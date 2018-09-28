package homePage;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InsuranceProductTest extends InsuranceProducts{
    InsuranceProducts insuranceProducts;
    @BeforeMethod
    public void init(){
        insuranceProducts = PageFactory.initElements(driver, InsuranceProducts.class);
    }

    @Test
    public void testHomeOwnerInsurance() throws InterruptedException {
        Assert.assertEquals("https://propertysales.geico.com/CustomerInformation",clickOnIconwithZipCode(homeOwnersInsuranceIcon));
    }
    @Test
    public void testRentersInsurance()throws InterruptedException {
        Assert.assertEquals("https://propertysales.geico.com/Diva/Conversation",clickOnIconwithZipCode(rentersInsuranceIcon));
    }
    @Test
    public void testMotorCycleInsurance()throws InterruptedException{
        Assert.assertEquals("https://buy.geico.com/ui/nb#/sale/customerinformation/gskmsi",clickOnIconwithZipCode(motorCycleInsuranceIcon));
    }
    @Test
    public void testCondoInsurance()throws InterruptedException{
        Assert.assertEquals("https://propertysales.geico.com/CustomerInformation",clickOnIconwithZipCode(condoInsuranceIcon));
    }
    @Test
    public void testBoatInsurance()throws InterruptedException{
        Assert.assertEquals("https://boat-prod.geico.com/CustomerInformation",clickOnIconwithZipCode(boatInsuranceIcon));
    }
    @Test
    public void testUmbrellaInsurance()throws InterruptedException{
        Assert.assertEquals("https://www.geico.com/umbrella-insurance/",clickOnIconWithoutZipCode(umbrellaInsuranceIcon));
    }
    /*@Test dynamic url
    public void testRVInsuranceIconClick()throws InterruptedException{
        Assert.assertEquals("https://rv.geico.com/sales/(S(fkmghmtlvdw3pz0rykldkdv1))/default.aspx",clickOnRVInsurance());
    }*/
    @Test
    public void testCollectorAutoInsurance()throws InterruptedException{
        Assert.assertEquals("https://www.geico.com/collector-auto-insurance/",clickOnIconWithoutZipCode2(collectorAutoIcon) );
    }
    @Test
    public void testMobileHomeInsurance()throws InterruptedException{
        Assert.assertEquals("https://www.geico.com/mobile-home-insurance/",clickOnIconWithoutZipCode2(mobileHomeIcon));
    }
    /*@Test popup
    public void testFloodInsurance()throws InterruptedException{
        clickOnFloodIcon();
    }*/
    /*@Test dynamic url
    public void testCommercialAutoInsurance()throws InterruptedException{
        Assert.assertEquals("https://commercial.geico.com/Sales/(S(qzn5nfzs4mdkszahrf11yxfv))/Quote/LandingPage.aspx?Zipcode=11435",clickOnIconwithZipCode2(commercialAutoIcon));
    }*/
    /*@Test popup
    public void testGeneralLiabilityInsurance()throws InterruptedException{
        clickOnGeneralLiabilityIcon();
    }*/
    /*@Test popup
    public void testProfessionalLiabilityInsurance()throws InterruptedException{
        clickOnProfessionalLiabilityIcon();
    }*/
    /*@Test popup
    public void testBusinessOwnersInsurance()throws InterruptedException{
        clickOnBusinessOwnersIcon();
    }*/
    /*@Test popup
    public void testWorkersCompensation(){

    }*/
   /* @Test popup
    public void testLifeInsurance(){}*/
   @Test
    public void testrideSharingInsurance()throws InterruptedException{
       Assert.assertEquals("https://www.geico.com/ridesharing-insurance/",clickOnIconWithoutZipCode3(rideSharingIcon) );
   }
   @Test
   public void testTravelInsurance() throws InterruptedException {
       Assert.assertEquals("https://www.geico.com/travel-insurance/",clickOnIconWithoutZipCode3(travelIsuranceIcon));
   }
   @Test
    public void testOverseasInsurance() throws InterruptedException {
        Assert.assertEquals("https://www.geico.com/overseas-insurance/",clickOnIconWithoutZipCode3(overseasIsuranceIcon));
    }
    @Test
    public void testIdentityProtection() throws InterruptedException {
        Assert.assertEquals("https://propertysales.geico.com/Generali/CustomerInformation",clickOnIconWithoutZipCode3(identityProtectionIcon));
    }
    /*@Test popUp
    public void testPestInsurance() throws InterruptedException { }*/
    /*@Test popUp
    public void testJewelryInsurance() throws InterruptedException { }*/
    @Test
    public void testLandlordInsurance() throws InterruptedException {
        Assert.assertEquals("https://www.geico.com/landlord-insurance/",clickOnIconWithoutZipCode3(landlordInsuranceIcon));
    }
      /*@Test popUp
    public void testMexicoAutoInsurance() throws InterruptedException { }*/
}
