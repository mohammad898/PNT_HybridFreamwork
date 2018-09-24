package homePage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InformationAndInsuranceHoverTest extends InformationAndInsuranceHover{
    InformationAndInsuranceHover object;
    @BeforeMethod
    public void init(){
        object = PageFactory.initElements(driver, InformationAndInsuranceHover.class);
    }
    @Test
    public void HoverInformationMenu() throws InterruptedException {
        testInformationMenuHover();
    }
}
