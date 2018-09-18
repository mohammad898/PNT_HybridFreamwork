package base;
import base.ReusableAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class firstTest extends ReusableAPI{ //remember, this ReusableAPI is taking windows credentials. change those before you test
//or dont inherit the ReusableAPI. breakdown some setup method as @Before/After method annotation
     //you can have a look into my test, i created one without inheritance
    @Test
    public void firstTest() { //fix your method; select the right elements
         driver.findElement(By.cssSelector(".login header-right-label open")).sendKeys(Keys.ENTER);
     }

}
