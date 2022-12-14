package com.capgemini.selenium;// Generated by Selenium IDE



import static org.junit.jupiter.api.Assertions.assertEquals;

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
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class YoutubeTestTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @BeforeEach
  public void setUp() {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\mbarriga\\Downloads\\chromedriver\\chromedriver.exe");
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @AfterEach
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void youtubeTest() {
    // Test name: youtubeTest
    // Step # | name | target | value
    // 1 | open | /wiki/Wikipedia:Portada | 
    driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
    // 2 | setWindowSize | 667x680 | 
    driver.manage().window().setSize(new Dimension(667, 680));
    // 3 | click | id=searchInput | 
    driver.findElement(By.id("searchInput")).click();
    // 4 | type | id=searchInput | youtube
    driver.findElement(By.id("searchInput")).sendKeys("youtube");
    // 5 | sendKeys | id=searchInput | ${KEY_ENTER}
    driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
    // 6 | click | css=tr:nth-child(20) > th | 
    driver.findElement(By.cssSelector("tr:nth-child(20) > th")).click();
    // 7 | click | linkText=Idiomas disponibles | 
    driver.findElement(By.linkText("Idiomas disponibles")).click();
    // 8 | click | linkText=software | 
    driver.findElement(By.linkText("software")).click();
    // 9 | click | id=firstHeading | 
    driver.findElement(By.id("firstHeading")).click();
    // 10 | click | id=firstHeading | 
    driver.findElement(By.id("firstHeading")).click();
    // 11 | assertText | css=.mw-page-title-main | Software
    assertEquals("Software",driver.findElement(By.cssSelector(".mw-page-title-main")).getText());
    // 12 | click | linkText=hardware | 
    driver.findElement(By.linkText("hardware")).click();
  }
}
