package com.capgemini.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;


public class PaginaPrincipalPactometro {
    public WebDriver driver;
    private Map<String, Object> vars;

    //Los WebElements podemos ponerlos como atributos de la clase
    WebElement numSies;
    WebElement numAbst;
    WebElement numNoes;
    WebElement noes;
    WebElement botonPP;
    JavascriptExecutor js;
    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mbarriga\\Downloads\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        // configurar un timeout a la hora de localizar elementos HTML presentes
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        navegaPagina();
        getElements();
    }
    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    //Metodo que navegara directamente a la página
    public void navegaPagina(){
        //Esto lo podríamos llamar dentro del setUp(), siempre se hace

        //Accedemos a la página
        driver.get("https://cursosdedesarrollo.com/pactometro/");
        //cambiamos el tamaño de la página
        driver.manage().window().setSize(new Dimension(1402, 1219));
    }

    public void getElements(){
        //Aquí accedemos a todos los elementos para facilitar el trabajo
        numSies = driver.findElement(By.id("num-sies"));
        numAbst = driver.findElement(By.id("num-abst"));
        numNoes = driver.findElement(By.id("num-noes"));
        noes = driver.findElement(By.id("noes"));
        botonPP = driver.findElement(By.id("part-PP"));

    }

}
