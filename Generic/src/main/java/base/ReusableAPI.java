package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class ReusableAPI {
    public static WebDriver driver = null;

    @BeforeMethod
    public void setDriver (String url){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdnas\\eclipse-workspace\\GroupBlueFrameWork\\Generic\\DriversForBrowser\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(url);
    }
    @AfterMethod
    public void closeTest(){
        driver.close();
    }
}
