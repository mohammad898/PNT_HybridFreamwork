package base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class CommonClass {
    public static WebDriver driver = null;
    public static Actions builder = null;
    public static WebDriverWait wait = null ;
    @FindBy(css = "ul.desktop-links > li:nth-child(2)>a")
    public static WebElement information;
    @FindBy(css = "#header-left-links > ul> li > a")
    public static WebElement insurance;
    @FindBy(css = "#header-middle-links > a")
    public static WebElement geicoLogo;
    @FindBy(css = "#header-right-links>ul>li>a>span.icon-geolocation")
    public static WebElement locationIcon;
    @FindBy(css = "#header-right-links>ul>li:nth-child(2)>a")
    public static WebElement login;
    @FindBy(css = "#header-right-links > ul > li:nth-child(3) > a > span")
    public static WebElement searchIcon;
    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver","/Users/afia/IdeaProjects/GroupBlueFrameWork/Generic/DriversForBrowser/chromedriver");
        driver = new ChromeDriver();
        builder = new Actions(driver);
        wait = new WebDriverWait(driver,10);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.geico.com/");

    }
    @BeforeMethod
    public void fullScreen(){
        driver.manage().window().fullscreen();
    }
    @AfterMethod
    public void end() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
}
