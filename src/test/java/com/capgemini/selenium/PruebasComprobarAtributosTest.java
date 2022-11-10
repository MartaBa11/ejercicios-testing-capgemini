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

import static org.junit.jupiter.api.Assertions.*;

public class PruebasComprobarAtributosTest {

    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @BeforeEach
    public void setUp() {
        // para windows
        //System.setProperty("webdriver.chrome.driver","c:\\Users\\ruta\\chromedriver.exe");
        driver = new ChromeDriver();
        // configurar un timeout a la hora de localizar elementos HTML presentes
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void botonesDeshabilitados(){
        //Acceder la página web
        driver.get("https://cursosdedesarrollo.com/pactometro/");

        WebElement botonPP = driver.findElement(By.id("part-PP"));
        botonPP.click();
        // System.out.println(botonPP.getAttribute("disabled"));
        assertEquals("true", botonPP.getAttribute("disabled"));
        assertTrue(!botonPP.isEnabled());
        driver.findElement(By.id("noes")).click();
        botonPP = driver.findElement(By.id("part-PP"));
        // System.out.println("style: " +botonPP.getAttribute("style"));
        assertEquals("display: none;", botonPP.getAttribute("style"));
        assertTrue(!botonPP.isDisplayed());
    }

    @Test
    public void testEstadoInicial(){
        // 1 | open | /pactometro/ |
        driver.get("https://cursosdedesarrollo.com/pactometro/");
        // 2 | setWindowSize | 1402x1219 |
        driver.manage().window().setSize(new Dimension(1402, 1219));
        WebElement numSies = driver.findElement(By.id("num-sies"));
        WebElement numAbst = driver.findElement(By.id("num-abst"));
        WebElement numNoes = driver.findElement(By.id("num-noes"));
        // valores iniciales visibles
        assertEquals("0", numSies.getText());
        assertEquals("0", numAbst.getText());
        assertEquals("0", numNoes.getText());
        // botón de reset
        assertNotNull(driver.findElement(By.id("reset")));
        // Botones de partidos
        List<WebElement> listadoBotonesPartidos =
                driver.findElements(By.cssSelector(".boton-partido")); //Si ponemos el punto tomamos todos los elementos con esa clase
        assertEquals(16, listadoBotonesPartidos.size());

        //Tomamos el botón
        WebElement botonPP = driver.findElement(By.id("part-PP"));
        assertEquals("boton-partido", botonPP.getAttribute("class"));
        assertEquals("89", botonPP.getAttribute("data-dipu"));
        assertEquals("PP", botonPP.getAttribute("data-nombre"));
        assertEquals("logotipo-pp.png", botonPP.getAttribute("data-img"));

        //Miramos la imagen correspondiente al botón
        WebElement imgPP = driver.findElement(By.cssSelector("#part-PP img"));
        assertEquals("https://cursosdedesarrollo.com/pactometro/img/logotipo-pp.png", imgPP.getAttribute("src"));
        assertEquals("100", imgPP.getAttribute("width"));

        //Miramos la parte h2 de un botón concreto
        WebElement h2PP = driver.findElement(By.cssSelector("#part-PP h2"));
        assertEquals("89", h2PP.getText());
    }
}
