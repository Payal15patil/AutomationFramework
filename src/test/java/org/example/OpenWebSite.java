package org.example;

import com.sun.xml.internal.bind.v2.model.core.ID;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebSite {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
    public void OpenLidl() {
        driver.get("https://www.lidl.co.uk/");
        driver.manage().window().maximize();
    }
    @Test
    public void OpenSainsburys() {
        driver.get("https://www.sainsburys.co.uk/");
        driver.manage().window().maximize();
    }
    @After
    public void tearDown() throws InterruptedException {
            Thread.sleep(7000);
            driver.close();
    }
}
