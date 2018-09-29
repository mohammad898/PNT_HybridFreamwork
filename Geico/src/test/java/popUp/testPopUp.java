package popUp;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import popUpHandle.getQuotePopUp;
import reporting.TestLogger;

public class testPopUp extends getQuotePopUp {
    getQuotePopUp object;
    @BeforeMethod
    public void init(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        object = PageFactory.initElements(driver,getQuotePopUp.class);
    }
    @Test
    public void testGetQuoteButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getQuote();
    }
    @Test
    public void testSkipButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickSkip();
    }
}
