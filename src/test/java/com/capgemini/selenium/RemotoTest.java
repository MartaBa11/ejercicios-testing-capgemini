package com.capgemini.selenium;

// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
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
public class RemotoTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setBrowserName("chrome");
        driver = new RemoteWebDriver(
                new URL("http://localhost:4444/wd/hub"),
                desiredCapabilities);
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void testNavegacionCompleja() {
        // Test name: nevegacion-compleja
        // Step # | name | target | value
        // 1 | open | / |
        driver.get("https://cursosdedesarrollo.com/");
        // 2 | click | css=.size-70 > .g-content |
        driver.findElement(By.cssSelector(".size-70 > .g-content")).click();
        // 3 | click | id=wp-block-search__input-1 |
        driver.findElement(By.id("wp-block-search__input-1")).click();
        // 4 | type | id=wp-block-search__input-1 | docker
        driver.findElement(By.id("wp-block-search__input-1")).sendKeys("docker");
        // 5 | click | css=.wp-block-search__button |
        driver.findElement(By.cssSelector(".wp-block-search__button")).click();
        // 6 | assertText | css=h1 | Search results for: docker
        assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Search results for: docker"));
        // 7 | open | /sorteo-pycones-2021/ |
        driver.get("https://cursosdedesarrollo.com/sorteo-pycones-2021/");
        // 8 | assertText | css=.entry-title | Sorteo PyConEs 2021
        assertThat(driver.findElement(By.cssSelector(".entry-title")).getText(), is("Sorteo PyConEs 2021"));
    }
}
