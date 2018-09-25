package home;

import base.CollectionApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DragDrop extends CollectionApi {
@FindBy(xpath = "//*[@id=\"field_input_select_state\"]")
    public static WebElement dd;
public void drag(){
    Select select=new Select(driver.findElement(By.xpath("//*[@id=\"field_input_select_state\"]")));
    select.selectByVisibleText("Massachusetts");
}
}
