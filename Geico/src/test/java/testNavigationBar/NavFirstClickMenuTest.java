package testNavigationBar;

import navigationBar.NavFirstClickMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class NavFirstClickMenuTest extends NavFirstClickMenu {
    NavFirstClickMenu object;
    @BeforeMethod
    public void init(){
        object = PageFactory.initElements(driver, NavFirstClickMenu.class);
    }
    @Test
   public void testInformationMenuItems() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        compareInformation();
    }
    @Test
    public void testInsuranceMenuItems() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        compareInsurance();
    }
}
