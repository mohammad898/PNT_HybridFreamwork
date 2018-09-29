package homeOwnersPackage;

import base.CommonClass;
import homePage.InsuranceProducts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerInfo extends CommonClass {
    InsuranceProducts object = PageFactory.initElements(driver,InsuranceProducts.class);
    @FindBy(xpath = "//a[@data-tooltip-view='HelpText-NIP013PIPropertyStreetAddress']")
    public static WebElement streetTip;
    @FindBy(xpath = "//div[@id='HelpText-NIP013PIPropertyStreetAddress']//div[@id='HelpTextDiv']/p")
    public static WebElement streetTipText;
    @FindBy(xpath = "//a[@data-tooltip-view='HelpText-CD010HomesitePolicyEffectiveDate']")
    public static WebElement coverageDateTip;
    @FindBy(xpath = "//div[@id='HelpText-CD010HomesitePolicyEffectiveDate']//div[@id='HelpTextDiv']/p")
    public static WebElement coverageDateTipText;
    @FindBy(xpath = "//a[@data-tooltip-view='HelpText-CD003DateOfBirth']")
    public static WebElement dateOfBirthTip;

    public void clickOnHO() throws InterruptedException {
        object.homeOwnersInsuranceIcon.click();
        object.sendZipCodeKeys("11435");
    }
    public String clickToolTip(WebElement toolKit, WebElement toolKitText ) throws InterruptedException {
        clickOnHO();
        Thread.sleep(1000);
        toolKit.click();
        waitToBeVisible(toolKitText);
        return toolKitText.getText();
    }
}
