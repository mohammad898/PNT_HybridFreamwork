package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class CommonClass {
    public static WebDriver driver = null;
    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver","/Users/afia/IdeaProjects/GroupBlueFrameWork/Generic/DriversForBrowser/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.geico.com/");
    }
    @AfterMethod
    public void end(){
        driver.close();
    }
}
