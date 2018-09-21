package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class breakdownMethodToSetUp { //independent ; not inherited from ReusableAPI
    public static WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "..\\Generic\\DriversForBrowser\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.airbnb.com/");
    }

    @BeforeMethod
    public void waitToLoad() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @BeforeMethod
    public void fullScr() {
        driver.manage().window().fullscreen();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
