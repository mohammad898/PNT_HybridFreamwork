package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class firstTest extends BeforeNAfterMethods{
    @Test
    public void search(){
        driver.findElement(By.cssSelector("#headerSearch")).sendKeys("Laptop", Keys.ENTER);
    }

}
