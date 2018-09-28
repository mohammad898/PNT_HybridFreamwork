package homePage;

import base.CommonClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InsuranceProducts extends CommonClass {
    @FindBy(how = How.CSS, using = "#submitButton")
    public static WebElement submitButton;
    @FindBy(how=How.ID, using = "zip")
    public static WebElement zipCodeTextBox;
    @FindBy(how = How.CLASS_NAME, using = "icon-chevron-right")
    public static WebElement rightArrow;

    @FindBy(css = "#home > div > span")
    public static WebElement homeOwnersInsuranceIcon;
    @FindBy(css = ".icon-renters-ins")
    public static WebElement rentersInsuranceIcon;
    @FindBy(css = ".icon-condo-ins")
    public static WebElement condoInsuranceIcon;
    @FindBy(css = ".icon-motorcycle")
    public static WebElement motorCycleInsuranceIcon;
    @FindBy(css = ".icon-boat-ins")
    public static WebElement boatInsuranceIcon;
    @FindBy(css = ".icon-umbrella-ins")
    public static WebElement umbrellaInsuranceIcon;
    @FindBy(css = ".icon-rv-ins")
    public static WebElement rvInsuranceIcon;
    @FindBy(css = ".icon-auto-collector-ins")
    public static WebElement collectorAutoIcon;
    @FindBy(css = ".icon-mobile-home-ins")
    public static WebElement mobileHomeIcon;
    @FindBy(css = ".icon-flood-ins")
    public static WebElement floodIcon;
    @FindBy(css = ".icon-commercial-ins")
    public static WebElement commercialAutoIcon;
    @FindBy(css = "#general > div > span")
    public static WebElement generalLiabilityIcon;
    @FindBy(css = ".icon-professional-liability")
    public static WebElement professionalLiability;
    @FindBy(css = "#businessowners > div > span")
    public static WebElement businessOwnersIcon;

    public String clickOnHomeOwnersInsuranceIcon() throws InterruptedException {
        homeOwnersInsuranceIcon.click();
        String url= sendZipCodeKeys("11435");
        return url;
    }
    public String clickOnRentersInsuranceIcon()throws InterruptedException{
        rentersInsuranceIcon.click();
        String url= sendZipCodeKeys("11435");
        return url;
    }

    public String clickOnCondoInsurance()throws InterruptedException{
        condoInsuranceIcon.click();
        String url= sendZipCodeKeys("11435");
        return url;
    }
    public String clickOnMotorCycleInsurance()throws InterruptedException{
        motorCycleInsuranceIcon.click();
        String url= sendZipCodeKeys("11435");
        return url;
    }
    public String clickOnBoatInsurance()throws InterruptedException{
        boatInsuranceIcon.click();
        String url= sendZipCodeKeys("11435");
        return url;
    }
    public String clickOnUmbrellaInsurance()throws InterruptedException{
        umbrellaInsuranceIcon.click();
        String url= clickStartQuote();
        return url;
    }
    /*public String clickOnRVInsurance()throws InterruptedException{
        rvInsuranceIcon.click();
        String url= clickStartQuote();
        return url;
    }*/
    public void clickOnCollectorAutoIcon()throws InterruptedException{
        collectorAutoIcon.click();
        submitButton.click();
    }
    public void clickOnMobileHomeIcon()throws InterruptedException{
        mobileHomeIcon.click();
        submitButton.click();
    }
    public void clickOnFloodIcon()throws InterruptedException{
        floodIcon.click();
        submitButton.click();
    }
    public void clickOnCommercialAutoIcon()throws InterruptedException{
        commercialAutoIcon.click();
        sendZipCodeKeys("11435");
    }
    public void clickOnGeneralLiabilityIcon()throws InterruptedException{
        generalLiabilityIcon.click();
        submitButton.click();
    }
    public void clickOnProfessionalLiabilityIcon()throws InterruptedException{
        professionalLiability.click();
        submitButton.click();
    }
    public void clickOnBusinessOwnersIcon()throws InterruptedException{
        businessOwnersIcon.click();
        submitButton.click();
    }

    public void goRight(){
        rightArrow.click();
    }

    public String clickStartQuote() throws InterruptedException {
        submitButton.click();
        Thread.sleep(2000);
        String url = driver.getCurrentUrl();
        return url;
    }

    public String sendZipCodeKeys(String zipCode) throws InterruptedException {
        zipCodeTextBox.sendKeys(zipCode);
        submitButton.click();
        Thread.sleep(2000);
        String url = driver.getCurrentUrl();
        return url;
    }

}
