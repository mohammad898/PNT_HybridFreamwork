package DataDrivenTests;

import DataDrivenClass.GoogleSheetClass;
import DataDrivenClass.Login;
import base.CommonClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;
import java.util.List;

public class TestGoogleSheetsPage extends GoogleSheetClass{
    GoogleSheetClass googleSheetsPage;
    @BeforeMethod
    public void initialization(){
        googleSheetsPage = PageFactory.initElements(driver,GoogleSheetClass.class);
    }
    @Test
    public void testLogInByInvalidIdPassUsingGoolgleSheet() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sendSpreadSheetIdAndRange("1H0JiWbL-Hq9to5oI21m65xpY0OQzJ4qCLjdzqbFgy6c","Sheet1!A2:C");
    }
}