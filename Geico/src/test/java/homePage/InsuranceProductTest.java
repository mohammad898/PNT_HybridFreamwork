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
    public void testHomeOwnerInsuranceIconClick() throws InterruptedException {
        Assert.assertEquals("https://propertysales.geico.com/CustomerInformation",clickOnHomeOwnersInsuranceIcon());
    }
    @Test
    public void testRentersInsuranceIconClick()throws InterruptedException {
        Assert.assertEquals("https://propertysales.geico.com/Diva/Conversation",clickOnRentersInsuranceIcon());
    }
    @Test
    public void testMotorCycleInsuranceIconClick()throws InterruptedException{
        Assert.assertEquals("https://buy.geico.com/ui/nb#/sale/customerinformation/gskmsi",clickOnMotorCycleInsurance());
    }
    @Test
    public void testCondoInsuranceIconClick()throws InterruptedException{
        Assert.assertEquals("https://propertysales.geico.com/CustomerInformation",clickOnCondoInsurance());
    }
    @Test
    public void testBoatInsuranceIconClick()throws InterruptedException{
        Assert.assertEquals("https://boat-prod.geico.com/CustomerInformation",clickOnBoatInsurance());
    }
    @Test
    public void testUmbrellaInsuranceIconClick()throws InterruptedException{
        Assert.assertEquals("https://www.geico.com/umbrella-insurance/",clickOnUmbrellaInsurance());
    }
    /*@Test
    public void testRVInsuranceIconClick()throws InterruptedException{
        Assert.assertEquals("https://rv.geico.com/sales/(S(fkmghmtlvdw3pz0rykldkdv1))/default.aspx",clickOnRVInsurance());
    }*/
    @Test
    public void testCollectorAutoInsuranceIconClick()throws InterruptedException{
        clickOnCollectorAutoIcon();
    }
    @Test
    public void testMobileHomeInsuranceIconClick()throws InterruptedException{
        clickOnMobileHomeIcon();
    }
    @Test
    public void testFloodInsuranceIconClick()throws InterruptedException{
        clickOnFloodIcon();
    }
    @Test
    public void testCommercialAutoInsuranceIconClick()throws InterruptedException{
        clickOnCommercialAutoIcon();
    }
    @Test
    public void testGeneralLiabilityInsuranceIconClick()throws InterruptedException{
        clickOnGeneralLiabilityIcon();
    }
    @Test
    public void testProfessionalLiabilityInsuranceIconClick()throws InterruptedException{
        clickOnProfessionalLiabilityIcon();
    }
    @Test
    public void testBusinessOwnersInsuranceIconClick()throws InterruptedException{
        clickOnBusinessOwnersIcon();
    }

}
