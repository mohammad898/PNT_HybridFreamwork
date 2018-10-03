package CondoInsurance;

import base.CommonClass;
import homePage.InsuranceProducts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import DataReaderCommonClass.ConnectToMySQL;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class CustomerInformation extends CommonClass{
    InsuranceProducts obj = new InsuranceProducts();
    ConnectToMySQL con = new ConnectToMySQL();
    @FindBy(id = "submitButton")
    public static WebElement continueButton;

    public void navigateToCustomerInfo() throws InterruptedException {
        ////*[@id="HelpText-CD003DateOfBirth"]/div/div/p
        WebElement condo = InsuranceProducts.condoInsuranceIcon;
       obj.clickOnIconwithZipCode(condo);
    }
    public void clickContinue(){
        continueButton.click();
    }
    public void getAllErrorMessage() throws Exception {
        clickContinue();
        waitToBeVisible(driver.findElement(By.id("validationSummary")));
        List<WebElement> warningList = driver.findElements(By.xpath("//ul[@class='list list--unordered']/li"));
        List<String> warningText = new ArrayList<>();
        for(WebElement ele: warningList) {
            warningText.add(ele.getText());
        }
       List<String> actualText= con.readData("condoWarning","warningList");
        for(int i=0;i<actualText.size();i++){
            Assert.assertEquals(actualText.get(i),warningText.get(i));
        }

    }
}
