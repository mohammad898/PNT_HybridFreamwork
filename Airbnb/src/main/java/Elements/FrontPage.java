package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.breakdownMethodToSetUp;

public class FrontPage extends breakdownMethodToSetUp {

    @FindBy(id = "checkin_input")
    public WebElement checkingDate;
    @FindBy(name = "checkout")
    public WebElement checkoutDate;
    @FindBy(className = "_cgr7tc7")
    public WebElement searchClick;
    @FindBy(id = "Koan-magic-carpet-koan-search-bar__input")
    public WebElement inputID;
    @FindBy(xpath = "//*[@id=\"Koan-via-Page0__input\"]")
    public WebElement inputXpath;
    @FindBy(className = "_lvb55za")
    public WebElement becomeAHost;
    @FindBy(className = "_1nhodd4u")
    public WebElement hostingAHome;

}
