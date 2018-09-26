package popUp;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import popUpHandle.getQuotePopUp;

public class testPopUp extends getQuotePopUp {
    getQuotePopUp object;
    @BeforeMethod
    public void init(){
        object = PageFactory.initElements(driver,getQuotePopUp.class);
    }
    @Test
    public void testGetQuoteButton(){
        getQuote();
    }
    @Test
    public void testSkipButton(){
        clickSkip();
    }
}
