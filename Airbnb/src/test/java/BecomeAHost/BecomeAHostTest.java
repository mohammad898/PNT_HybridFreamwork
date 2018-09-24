package BecomeAHost;

import Elements.FrontPageElements;
import FrontPage.BecomeAHost;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class BecomeAHostTest extends BecomeAHost {

    FrontPageElements frontPageElements;

    @Test
    public void HostingHouse(){
        frontPageElements = PageFactory.initElements(driver, FrontPageElements.class);
        clickHost();
        hostingHouse();
    }
}
