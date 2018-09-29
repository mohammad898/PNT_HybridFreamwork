package homeOwnersPackage;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerInfoTest extends CustomerInfo{
    CustomerInfo object;
    @BeforeMethod
    public void init() {
        object = PageFactory.initElements(driver,this.getClass());
    }
    @Test
    public void testStreetTipText() throws InterruptedException {
        Assert.assertEquals("This is the actual address of the home, apartment or condo where you reside, and that you desire to insure.",clickToolTip(streetTip,streetTipText));
    }
    @Test
    public void testCoverageDateTipText()throws InterruptedException{
        Assert.assertEquals("The effective date of your policy can range from 1-59 days in the future. This is the date your coverage will begin.",clickToolTip(coverageDateTip,coverageDateTipText));
    }
}
