package base;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.TestNGException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class ReusableAPI {
    public static WebDriver driver = null;

    @BeforeMethod
    public void setDriver () {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdnas\\eclipse-workspace\\GroupBlueFrameWork\\Generic\\DriversForBrowser\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get("https://www.airbnb.com/");
    }

    @AfterMethod
    public void closeTest(){
        driver.close();
    }
}