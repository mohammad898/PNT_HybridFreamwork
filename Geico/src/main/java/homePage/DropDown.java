package homePage;

import DataReaderCommonClass.ConnectToMongoDB;
import base.CommonClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

public class DropDown extends CommonClass {
    @FindBy(id="homepage_manage_select")
    public static WebElement dropDownWebelement;

    public List<String> getDropDownList(){
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       Select dropDown = new Select(dropDownWebelement);
       List<WebElement> dropDownList = dropDown.getOptions();
       List<String> dropDownListText = new ArrayList<>();
        for(WebElement it:dropDownList) {
            dropDownListText.add(it.getText());
        }
        return dropDownListText;
    }
    public List<String> getDropDownDataFromDB(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return ConnectToMongoDB.readFromMongoDB("dropDown","dropDownList");
    }
    public void compareDropDownData(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> expectedData = getDropDownList();
        List<String> actualData = getDropDownDataFromDB();
        for(int i=0;i<actualData.size();i++){
            Assert.assertEquals(actualData.get(i),expectedData.get(i));
        }
    }
}
