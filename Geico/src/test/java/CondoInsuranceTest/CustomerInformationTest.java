package CondoInsuranceTest;

import CondoInsurance.CustomerInformation;
import homePage.InsuranceProducts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerInformationTest extends CustomerInformation {
    @BeforeMethod
    public void init() throws InterruptedException {
        CustomerInformation obj = PageFactory.initElements(driver,CustomerInformation.class);
        InsuranceProducts obj1 = PageFactory.initElements(driver,InsuranceProducts.class);
        obj.navigateToCustomerInfo();
    }
    @Test
    public void testWarning() throws Exception {
        getAllErrorMessage();
    }
}
