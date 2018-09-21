package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class ReusableAPI { //Remember this class is not reading from that TestRunner.xml.

    public static WebDriver driver = null;

    @BeforeMethod
    public void setDriver(String os,String url) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdnas\\eclipse-workspace\\GroupBlueFrameWork\\Generic\\DriversForBrowser\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        driver.get("https://www.airbnb.com/");
    }
    /*public static void setDriverForOS(String os){
        if(os.equalsIgnoreCase("Windows")){
          System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir"+"\\Generic\\DriversForBrowser\\chromedriver.exe"));
          driver = new ChromeDriver();
        }
        else if(os.equalsIgnoreCase("Mac")){
           System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Generic/DriversForBrowser/chromedriverMacOS");
            driver = new ChromeDriver();
        }
    }*/

    @AfterMethod
    public void closeTest(){
        driver.close();
    }

    //helper method
    public void hoverOver() throws InterruptedException {
        driver.findElement(By.id("NAV_ABOUT_US")).click();
        Thread.sleep(2000);
        WebElement e = driver.findElement(By.linkText("Who we are"));
        Actions ac = new Actions(driver);
        ac.moveToElement(e).build().perform();
    }
}