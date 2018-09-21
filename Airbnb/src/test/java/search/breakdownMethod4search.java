package search;

import com.beust.jcommander.Parameter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class breakdownMethod4search { //independent ; not inherited from ReusableAPI
    public static WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdnas\\eclipse-workspace\\GroupBlueFrameWork\\Generic\\DriversForBrowser\\chromedriver.exe");
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
