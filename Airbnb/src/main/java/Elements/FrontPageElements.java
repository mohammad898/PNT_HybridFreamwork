package Elements;

import PageObject.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FrontPageElements extends PageObject {

    public FrontPageElements(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "_17u98ky")
    public static WebElement dateButton;
    @FindBy(className = "_qz4lhy5")
    public static WebElement increaseGuest;
    @FindBy(className = "_n5wk6ic")
    public static WebElement applyButton;
    @FindBy(id = "checkin_input")
    public static WebElement checkinDate;
    @FindBy(className = "_16zigr23")
    public static WebElement AcheckinDate;
    @FindBy(id = "checkout_input")
    public static WebElement checkoutDate;
    @FindBy(xpath = "//*[@id=\"lp-search-button\"]/div/button/span")
    public static WebElement searchClick;
    @FindBy(id = "Koan-magic-carpet-koan-search-bar__input")
    public static WebElement inputID;
    @FindBy(xpath = "//*[@id=\"Koan-via-Page0__input\"]")
    public static WebElement inputXpath;
    @FindBy(className = "_lvb55za")
    public static WebElement becomeAHost;
    @FindBy(className = "_1nhodd4u")
    public static WebElement hostingAHome;
    @FindBy(className = "_1nil34o")
    public static WebElement guestButton;

}
