package homePage;

import base.CommonClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class NavigationBarOptionMethod extends CommonClass{
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

    public static Actions builder = new Actions(driver);

    public void clickOnInsurance(){
        builder.moveToElement(insurance).pause(2000);
        builder.perform();
    }
    public void clickOnInformation(){
        builder.moveToElement(information).pause(2000);
        builder.perform();
    }
    public void clickOnGeicoLogo(){
        builder.moveToElement(geicoLogo).pause(2000);
        builder.perform();
    }
    public void clickOnLocationIcon(){
        builder.moveToElement(locationIcon).pause(2000);
        builder.perform();
    }
    public void clickLogin(){
        builder.moveToElement(login).pause(2000);
        builder.perform();
    }
    public void clickOnSearchIcon(){
        builder.moveToElement(searchIcon).pause(2000);
        builder.perform();
    }


}
