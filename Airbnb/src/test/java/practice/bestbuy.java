package practice;

import base.ReusableAPI;
import com.microsoft.schemas.office.visio.x2012.main.impl.SectionTypeImpl;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import reporting.ExtentTestManager;

import java.util.NoSuchElementException;
import java.util.Set;

public class bestbuy extends ReusableAPI {

    public void popUp(){
        driver.findElement(By.xpath("")).click();
        log("Clicked on something");
    }

    public void log(String message) {
        ExtentTestManager.getTest().log(LogStatus.INFO, message);
    }

    @Test
    public void pop(){
      //  driver.switchTo().alert().dismiss();
       // driver.findElement(By.id("gh-search-input")).sendKeys("laptop", Keys.ENTER);
      /*  int count = 0;
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles){
            System.out.println(handle+ " : "+count++);*/
      /*int size = driver.findElements(By.tagName("iframe")).size();

      for (int i = 0; i<size; i++){
          driver.switchTo().frame(i);
          try{
          if (driver.findElement(By.xpath("(//button[@aria-label='Close'])[2]")).isDisplayed()){
              driver.findElement(By.xpath("(//button[@aria-label='Close'])[2]")).click();
              break;}
          } catch (NoSuchElementException e){
              System.out.println("element not found");
          }
        }
        driver.switchTo().defaultContent();
        driver.findElement(By.id("gh-search-input")).sendKeys("laptop", Keys.ENTER);*/
        driver.findElement(By.xpath("(//button[@aria-label='Close'])[2]")).click();
        driver.findElement(By.id("gh-search-input")).sendKeys("laptop", Keys.ENTER);

    }
}
