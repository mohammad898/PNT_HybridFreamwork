package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class searchPage {
    private WebDriver driver;
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mdnas\\eclipse-workspace\\GroupBlueFrameWork\\Generic\\DriversForBrowser\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @BeforeMethod
    public void openHomePage(){
        driver.get("https://www.airbnb.com");
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void search (){
        driver.manage().window().fullscreen();
    }
}
