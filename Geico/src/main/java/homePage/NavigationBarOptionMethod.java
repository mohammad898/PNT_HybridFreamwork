package homePage;


import base.CommonClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationBarOptionMethod extends CommonClass {
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

    public void clickOnInsurance(){
        insurance.click();
    }
    public void clickOnInformation(){
        information.click();
    }
    public void clickOnGeicoLogo(){
        geicoLogo.click();
    }
    public void clickOnLocationIcon(){
        locationIcon.click();
    }
    public void clickLogin(){
        locationIcon.click();
    }
    public void clickOnSearchIcon(){
        searchIcon.click();
    }


}
