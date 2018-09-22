package BecomeAHost;

import Elements.FrontPage;
import FrontPage.BecomeAHost;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class BecomeAHostTest extends BecomeAHost {

    FrontPage frontPage;

    @Test
    public void HostingHouse(){
        frontPage = PageFactory.initElements(driver, FrontPage.class);
        clickHost();
        hostingHouse();
    }
}
