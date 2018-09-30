package DataDrivenTests;

import DataDrivenClass.InformationAndInsuranceHover;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import DataDrivenClass.ConnectToMongoDB;
import reporting.TestLogger;

import java.net.MalformedURLException;
import java.util.List;

public class InformationAndInsuranceHoverTest extends InformationAndInsuranceHover {
    InformationAndInsuranceHover object;
    @BeforeMethod
    public void init(){
        object = PageFactory.initElements(driver, InformationAndInsuranceHover.class);
    }
    @Test
    public void testInformationMenuItems() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> spanText = ConnectToMongoDB.readFromMongoDB("infoMenu");
        List<WebElement> element = getInformationMenuList();
        System.out.println("\n\n\n");
        for(int index=0; index<element.size();index++) {
            Assert.assertEquals(spanText.get(index),element.get(index).getText());
        }
    }
}
