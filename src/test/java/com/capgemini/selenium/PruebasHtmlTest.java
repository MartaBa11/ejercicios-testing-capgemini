package com.capgemini.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;

import java.time.Duration;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PruebasHtmlTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mbarriga\\Downloads\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //hacemos que compruebe el tiempo de ejecución
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void comprobarPactimetro(){

        //Abrimos la página
        driver.get("https://cursosdedesarrollo.com/pactometro/");

        //Comprobar existen los elementos
        WebElement element;

        //Hacemos click en el boton del PP
        driver.findElement(By.id("part-PP")).click();

        //Hacemos click en el boton del PSOE
        driver.findElement(By.id("part-PSOE")).click();

        //Hay que hacer click en la pantalla
        driver.findElement(By.id("sies")).click();

        //Vemos que es lo que nos devuelve lo adecuado
        element = driver.findElement(By.id("num-sies"));
        String texto = element.getText();

        //Comprobamos que da la que tiene que dar
        System.out.println(texto);
        assertEquals("209",texto,"El texto de los síes tiene que ser 209");

        //Comprobar que en el resto da 0 para esa combinación
        assertEquals("0",driver.findElement(By.id("num-noes")).getText());

        //Comprobar que en la cabecera hay tres elementos
        List<WebElement> elements = driver.findElements(By.cssSelector("#cabecera > div"));
        System.out.println(elements.size());

        //Hacer click en el reset
        driver.findElement(By.id("botones")).click();

        //Mirar que todos los valores sean 0



    }
}
