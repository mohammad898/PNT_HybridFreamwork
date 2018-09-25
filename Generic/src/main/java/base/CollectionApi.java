package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CollectionApi {
    public WebDriver driver=null;
    @Parameters({"url"})
    @BeforeMethod
        public void startUp(@Optional("https://www.santanderbank.com/us") String url){
        System.setProperty("webdriver.chrome.driver","/Users/URMI/Desktop/GroupBlueFrameWork/Generic/DriversForBrowser/chromedriver");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }
    @AfterMethod
    public void closeUp(){
        driver.close();
    }


    }

