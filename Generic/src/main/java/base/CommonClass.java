package base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CommonClass {
    public static WebDriver driver = null;
    public static Actions builder = null;
    public static WebDriverWait wait = null ;

    @BeforeMethod
    public void setup() throws MalformedURLException {
        //setUpBrowserStack();
        System.setProperty("webdriver.chrome.driver","/Users/afia/IdeaProjects/GroupBlueFrameWork/Generic/DriversForBrowser/chromedriver");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        builder = new Actions(driver);
        wait = new WebDriverWait(driver,10);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.geico.com/");

    }
    /*@BeforeMethod
    public void fullScreen(){
        driver.manage().window().fullscreen();
    }*/
    @AfterMethod
    public void end() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

    public static void captureScreenshot( String screenshotName){

        DateFormat df = new SimpleDateFormat("(MM.dd.yyyy-HH:mma)");
        Date date = new Date();
        df.format(date);

        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File(System.getProperty("user.dir")+ "/screenshots/"+screenshotName+" "+df.format(date)+".png"));
            System.out.println("Screenshot captured");
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot "+e.getMessage());;
        }

    }

    public void waitToBeVisible(WebElement element){
wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitToBeVisible(String xpath){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='homepage_manage_select']/option")));
    }
    /*public void setUpBrowserStack() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setPlatform(Platform.MAC);
        cap.setBrowserName("chrome");
        String browserStackUrl = "https://afiafarjana1:9Z5U2U9zmF6Uq6QUr9pi@hub-cloud.browserstack.com/wd/hub";
        URL serverUrl = new URL(browserStackUrl);
        driver = new RemoteWebDriver(serverUrl,cap);
    }*/
}
