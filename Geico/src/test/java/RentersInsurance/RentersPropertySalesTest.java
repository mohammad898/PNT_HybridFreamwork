package RentersInsurance;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class RentersPropertySalesTest extends RentersPropertySales{
    @BeforeMethod
    public void init(){
        RentersPropertySales obj = PageFactory.initElements(driver,RentersPropertySales.class);
        navigteToConversation();
    }
    @Test
    public void testMovingClick(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnMoving();
    }
}
