package homePage;

import base.BeforeNAfterMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class AutoInsurance extends BeforeNAfterMethods {
    @Test
    public void zipCodeBoxWithENTERKey(){
        driver.findElement(By.id("zip")).sendKeys("11435", Keys.ENTER);

    }
    @Test
    public void zipCodeTestWithButton(){
        driver.get("https://www.geico.com/");
        driver.findElement(By.id("zip")).sendKeys("11435");
        driver.findElement(By.id("submitButton")).click();
    }
}
