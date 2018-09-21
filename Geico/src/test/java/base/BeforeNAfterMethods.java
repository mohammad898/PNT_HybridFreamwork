package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BeforeNAfterMethods {
    public static WebDriver driver = null;
    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver","/Users/afia/my-app-java/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.geico.com/");
    }
    @AfterMethod
    public void close(){
        driver.close();
    }
}
