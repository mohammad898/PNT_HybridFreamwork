package homeOwnersPackage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class PromptToCallTest extends PromptToCall{
    PromptToCall objePTC;
    @BeforeMethod
    public void init(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objePTC = PageFactory.initElements(driver,PromptToCall.class);
    }
    /*@Test
    public void testNavigation(){
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getErrorHeadline();
    }*/
}
