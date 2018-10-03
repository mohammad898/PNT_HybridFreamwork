package RentersInsurance;

import base.CommonClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RentersPropertySales extends CommonClass {
    PropertySales objPropertySales = new PropertySales();
    public void navigteToConversation(){
        objPropertySales.clickOnElementRD(PropertySales.rentersRD);
    }
    public void clickOnMoving(){
        driver.findElement(By.xpath("//button[@value='moving']")).click();
    }
}
