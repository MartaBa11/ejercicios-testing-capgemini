package com.capgemini;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class APITest {

    @Test
    public void testGetSogetiWeb() throws IOException, InterruptedException {
        // Given
        // configurar el cliente Web que haga la petición
        HttpClient client = HttpClient.newHttpClient(); // se declara el nuevo cliente
        HttpRequest request = HttpRequest.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .uri(URI.create("https://www.sogeti.nl/"))
                .build();  //creamos la estructura de la petición
        // When
        // realizar la petición
        HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString()); //
        // Then
        // comprobar que la respuesta a nuestra petición es correcta
        int responseStatusCode = response.statusCode();
        assertEquals(
                200,
                responseStatusCode,
                "El código a devolver debería ser 200");
    }

    @Test
    public void testGetHttpBinOrg() throws IOException, InterruptedException {
        // Given
        // configurar el cliente Web que haga la petición
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .uri(URI.create("https://httpbin.org/get"))
                .build();
        // When
        // realizar la petición
        HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString());
        // Then
        // comprobar que la respuesta a nuestra petición es correcta
        int responseStatusCode = response.statusCode();
        assertEquals(
                200,
                responseStatusCode,
                "El código a devolver debería ser 200");
    }

    //Hacemos peticiones y vemos que es lo que nos devuelve

    @Test
    public void testGetHttpBinOrgWithJSON() throws IOException, InterruptedException, ParseException {
        // Given
        // configurar el cliente Web que haga la petición
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .uri(URI.create("https://httpbin.org/get"))
                .build(); //Configuramos la request y la URL a la que queremos acceder
        // When
        // realizar la petición
        HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString()); //hacemos que el cliente envíe la petición correspondiente

        // Then
        // comprobar que la respuesta a nuestra petición es correcta
        int responseStatusCode = response.statusCode(); //recogemos el código de respuesta de la petición

        assertEquals(
                200,
                responseStatusCode,
                "El código a devolver debería ser 200"); //miramos que todo  funciona bien

        // Extraemos el body de la respuesta
        String body = response.body();

        // Parsear el contenido del body
        JSONParser jsonParser = new JSONParser();  //creamos un JSON parsero
        JSONObject json = (JSONObject) jsonParser.parse(body);  //creamos un JSON a partir del body de la respuesta

        // Obtener los datos de los atributos que están dentro del JSON
        String url = json.get("url").toString(); //En esta parte cogemos la parte del body en la que se encuentra la url

        // Comprobamos que el es el contenido esperado
        assertEquals(
                "https://httpbin.org/get",
                url,
                "La url debe coincidir con el valor esperado");


        ////////////////////////AQUÍ SE HACE CON EL CAMPO ORIGIN DEL BODY
        String origin = json.get("origin").toString();
        // Comprobamos que el es el contenido esperado
        assertNotNull(
                origin,
                "El origen no puede ser null");


    }

    @Test
    public void testGetHttpBinOrgWithParams() throws IOException, InterruptedException, ParseException {
        // Given
        // configurar el cliente Web que haga la petición
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .uri(URI.create("https://httpbin.org/get?param1=hola&param2=23")) //metiendo parámetros
                .build();
        // When
        // realizar la petición
        HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString());
        // Then
        // comprobar que la respuesta a nuestra petición es correcta
        int responseStatusCode = response.statusCode();
        assertEquals(
                200,
                responseStatusCode,
                "El código a devolver debería ser 200");
        // Datos del body
        String responseBody = response.body();
        System.out.println(responseBody);
        assertNotNull(responseBody, "El valor debe ser diferente a null");

        //Obtenemos los parametros del body
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(responseBody);
        JSONObject jsonArgs = (JSONObject) jsonObject.get("args");

        String param1 = (String) jsonArgs.get("param1"); //así se denominan a los parámetros
        String param2 = (String) jsonArgs.get("param2");

        //Mostramos por pantalla y comprobamos
        System.out.println("param1: "+ param1);
        assertEquals("hola", param1);

        System.out.println("param2: "+ param2);
        assertEquals("23", param2);

    }

    @Test
    public void testPostRequest() throws IOException, InterruptedException, URISyntaxException, ParseException {
        // Given
        //Primero creamos el cliente
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();


        //Creamos el objeto JSON que queremos "postear"
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","Marta");
        jsonObject.put("age",23);

        //Tenemos que hacer una petición pero esta vez es diferente porque es POST
        HttpRequest request = HttpRequest
                .newBuilder(new URI("https://httpbin.org/post"))
                .version(HttpClient.Version.HTTP_2)
                .POST(HttpRequest.BodyPublishers.ofString(jsonObject.toJSONString())) //añadimos lo que queremos postear
                .build();

        // When
        //Ahora retomamos lo que nos devuelve el servicio al hacer la petición
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        int responseStatusCode = response.statusCode();
        String reponseBody = response.body();
        System.out.println("httpGetRequest: " + reponseBody);

        //Then -> se hacen todas las comprobaciones
        assertEquals(responseStatusCode,200);

        //De nuevo hay que parsear el body para poder extraer los campos
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject1 = (JSONObject) jsonParser.parse(reponseBody);

        JSONObject json = (JSONObject) jsonObject1.get("json");

        //Ponerlo directamente porque no se el tipo de dato que me puede dar
        assertEquals("Marta",json.get("name"));
        assertEquals(23L,json.get("age"));

    }
}
