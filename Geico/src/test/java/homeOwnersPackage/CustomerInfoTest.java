package homeOwnersPackage;

import DataDrivenClass.ConnectToMySQL;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class CustomerInfoTest extends CustomerInfo{
    ConnectToMySQL connect = new ConnectToMySQL();
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
    @Test
    public void testDOB() throws InterruptedException {
        System.out.println(clickToolTip(dateOfBirthTip,dateOfBirthTipText));
    }
    @Test
    public void testWarning1() throws InterruptedException {
        List<String> warningText = clickContinue1();
        List<String> actualText = connect.readData("customerInfo1","warning");
        for (int i=0; i<actualText.size();i++)
            Assert.assertEquals(actualText.get(i),warningText.get(i));
    }
}
