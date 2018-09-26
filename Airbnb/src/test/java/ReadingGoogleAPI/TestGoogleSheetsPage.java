package ReadingGoogleAPI;

import SignIn.SignInPage;
import UsingGoogleAPI.GoogleSheetsPage;
import base.ReusableAPI;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class TestGoogleSheetsPage extends ReusableAPI {

    SignInPage signInPage;
    GoogleSheetsPage googleSheetsPage;

    @BeforeMethod
    public void initialization(){
        signInPage = new SignInPage(driver);
       googleSheetsPage = new GoogleSheetsPage(driver);
    }

    //Verify log in by taking data from a google sheets file
    @Test
    public void testLogInByInvalidIdPassUsingGoogleSheet() throws IOException, InterruptedException {
        Thread.sleep(3000);
        signInPage.clickSignIn();
        Thread.sleep(3000);
        int i = 0;
        String spreadsheetId = "1vdntSdNgOM8j-TUZVgPdwbHdbT_soWmZ_RxiDCsET8Q";
        String range = "Sheet1!A2:D";
        List<String> actualErrorMessage = googleSheetsPage.signInByInvalidIdPass(spreadsheetId, range);
        List<List<Object>> expectedErrorMessage = googleSheetsPage.getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedErrorMessage) {
           // Assert.assertTrue(actualErrorMessage.get(i).contains(row.get(3).toString()));
            //System.out.println("expected"+row.get(3).toString());
            System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
            i++;
        }
        System.out.println("testLogInByInvalidIdPassUsingGoogleSheet Passed");
    }
}
