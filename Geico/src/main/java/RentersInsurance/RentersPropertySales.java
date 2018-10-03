package RentersInsurance;

import base.CommonClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import reporting.TestLogger;

public class RentersPropertySales extends CommonClass {
    PropertySales objPropertySales = new PropertySales();
    public void navigteToConversation(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objPropertySales.clickOnElementRD(PropertySales.rentersRD);
    }
    public void clickOnMoving(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver.findElement(By.xpath("//button[@value='moving']")).click();
    }
}
