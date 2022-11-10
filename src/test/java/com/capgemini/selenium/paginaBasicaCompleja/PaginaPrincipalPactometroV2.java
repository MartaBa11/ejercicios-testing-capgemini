package com.capgemini.selenium.paginaBasicaCompleja;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

//En esta clase lo que hacemos es extraer los elementos y definir todas las funcionalidades
//declaramos todos los elementos y funcionalidades que se vayan a repetir durante el test

public class PaginaPrincipalPactometroV2 {
    private WebDriver driver;
    WebElement numSies;
    WebElement numAbst;
    WebElement numNoes;

    WebElement noes;

    WebElement botonPP;
    PaginaPrincipalPactometroV2(WebDriver driver){  //es necesario tener el driver para poder acceder
        this.driver = driver;
        navegaPagina();
        getElements();
    }
    public void navegaPagina(){
        // 1 | open | /pactometro/ |
        driver.get("https://cursosdedesarrollo.com/pactometro/");
        // 2 | setWindowSize | 1402x1219 |
        driver.manage().window().setSize(new Dimension(1402, 1219));
    }
    public void getElements() {
        numSies = driver.findElement(By.id("num-sies"));
        numAbst = driver.findElement(By.id("num-abst"));
        numNoes = driver.findElement(By.id("num-noes"));
        noes = driver.findElement(By.id("noes"));
        botonPP = driver.findElement(By.id("part-PP"));
    }

}
