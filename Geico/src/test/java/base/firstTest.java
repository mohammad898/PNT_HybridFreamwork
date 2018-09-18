package base;
import base.ReusableAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class firstTest extends ReusableAPI{

     @Test
    public void firstTest() {
         driver.findElement(By.cssSelector(".login header-right-label open")).sendKeys(Keys.ENTER);
     }

}
