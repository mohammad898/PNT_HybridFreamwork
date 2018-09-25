package BecomeAHost;

import Elements.FrontPageElements;
import FrontPage.BecomeAHost;
import base.ReusableAPI;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BecomeAHostTest extends ReusableAPI {

    FrontPageElements frontPageElements;
    BecomeAHost becomeAHost;

    @BeforeMethod
    public void init(){
    frontPageElements = new FrontPageElements(driver);
    becomeAHost = new BecomeAHost(driver);}
    @Test
    public void HostingHouse(){
        becomeAHost.clickHost();
        becomeAHost.hostingHouse();
    }
}
