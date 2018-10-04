package CondoInsuranceTest;

import CondoInsurance.CustomerInformation;
import homePage.InsuranceProducts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

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
    @Test
    public void testFirstName(){
        firstName();
    }
    @Test
    public void testLastName(){
        lastName();
    }
    @Test
    public void testAddress(){
        address();
    }
    @Test
    public void testCity(){
        city();
    }
    @Test
    public void testPropertyCoverage1(){
        propertyCoverage20000();
    }
    @Test
    public void testPropertyCoverage2(){
        propertyCoverage30000();
    }
    @Test
    public void testPropertyCoverage3(){
        propertyCoverage40000();
    }
    @Test
    public void testPropertyCoverage4(){
        propertyCoverage50000();
    }
    @Test
    public void testPropertyCoverage5(){
        propertyCoverageOther();
    }
}
