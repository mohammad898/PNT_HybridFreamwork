package home;
import base.ReusableAPI;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static base.GoogleSheetReader.getSheetsService;

public class GoogleSheetsPage extends ReusableAPI {

    //find elements for login page

    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/div[1]/span")
    public static WebElement login;
    @FindBy(id = "_P002_Menu_WAR_P002_Menuportlet_entrada.alias")
    public static WebElement UserInput;
    @FindBy(id = "_P002_Menu_WAR_P002_Menuportlet_entrada.pwd")
    public static WebElement PasswordInput;
    @FindBy(id = "_P002_Menu_WAR_P002_Menuportlet_loginButtonTM")
    public static WebElement LogIn;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet_formLogin\"]/fieldset/div/span/div[1]")
    public static WebElement errorMsg;
    @FindBy(name = "_W000_hidden_WAR_W000_hiddenportlet_texto")
    public static WebElement Textbox;

    public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
        // Build a new authorized API client service.
        Sheets service = getSheetsService();
        ValueRange response = service.spreadsheets().values().get(spreadsheetId, range).execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            return null; }
            else { return values; }
    }

    //LogIn by using Google Sheet sheet data
    public List<String> signInByInvalidIdPass(String spreadsheetId, String range) throws IOException, InterruptedException {

        List<List<Object>> col2Value = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList<>();
        for (List row : col2Value) {
            Thread.sleep(5000);
            inputValueInTextBoxByWebElement(UserInput, row.get(1).toString());
            inputValueInTextBoxByWebElement(PasswordInput, row.get(2).toString());
            Thread.sleep(5000);
            //actual.add(getCurrentPageTitle());
            actual.add(getTextByWebElement(errorMsg));
            System.out.println(getTextByWebElement(errorMsg));
            //clearInputBox(Textbox);
            clearInputBox(UserInput);
            clearInputBox(PasswordInput);
            Thread.sleep(5000);}
        return actual;
    }
    public void inputValueInTextBoxByWebElement(WebElement webElement, String value){
        webElement.sendKeys(value + Keys.ENTER);
    }
    public void clearInputBox(WebElement webElement){
        webElement.clear();
    }
    public String getTextByWebElement(WebElement webElement){
        String text = webElement.getText();
        return text;
    }
}