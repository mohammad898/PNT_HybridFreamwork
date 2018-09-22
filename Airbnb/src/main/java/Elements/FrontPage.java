package Elements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.breakdownMethodToSetUp;

public class FrontPage extends breakdownMethodToSetUp {

    @FindBy(id = "checkin_input")
    public static WebElement checkingDate;
    @FindBy(name = "checkout")
    public static WebElement checkoutDate;
    @FindBy(className = "_cgr7tc7")
    public static WebElement searchClick;
    @FindBy(id = "Koan-magic-carpet-koan-search-bar__input")
    public static WebElement inputID;
    @FindBy(xpath = "//*[@id=\"Koan-via-Page0__input\"]")
    public static WebElement inputXpath;
    @FindBy(className = "_lvb55za")
    public static WebElement becomeAHost;
    @FindBy(className = "_1nhodd4u")
    public static WebElement hostingAHome;

    public void inputPlaces (){
        try{
            inputXpath.sendKeys("Queens", Keys.ENTER);}
        catch(NoSuchElementException ex){
            inputID.sendKeys("Queens", Keys.ENTER);
        }
    }

}
