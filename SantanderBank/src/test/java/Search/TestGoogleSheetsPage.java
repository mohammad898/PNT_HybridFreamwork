package Search;
import home.GoogleSheetsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;
import java.io.IOException;


public class TestGoogleSheetsPage extends GoogleSheetsPage {
    GoogleSheetsPage googleSheetsPage;
    @BeforeMethod
    public void init(){
        googleSheetsPage= PageFactory.initElements(driver,GoogleSheetsPage.class);
    }

    //Verify log in by taking data from a google sheets file
    @Test
    public void testLogInByInvalidIdPassUsingGoogleSheet() throws IOException, InterruptedException {
        Thread.sleep(3000);
        login.click();
        Thread.sleep(3000);
        int i = 0;
        String spreadsheetId = "1r7vJp3FX5oRzEK-4W5q3HRl9Jq5LYJmOVUcRDqguzag";
        String range = "Sheet1!A2:E";
        List<String> actualErrorMessage = googleSheetsPage.signInByInvalidIdPass(spreadsheetId, range);
        List<List<Object>> expectedErrorMessage = googleSheetsPage.getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedErrorMessage) {
            Assert.assertTrue(actualErrorMessage.get(i).contains(row.get(3).toString()));
            System.out.println("expected" + row.get(3).toString());
            System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
            i++;
        }
        System.out.println("testLogInByInvalidIdPassUsingGoogleSheet Passed");
    }
}

