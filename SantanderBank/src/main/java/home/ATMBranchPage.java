package home;

<<<<<<< HEAD

//import base.CollectionApi;

=======
>>>>>>> da037efda82f7e8b723ed7b497116fb4eb9d31cc
import base.ReusableAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class ATMBranchPage extends ReusableAPI {
    //find elements for ATM/Branch location
    @FindBy(xpath = "//*[@id=\"q\"]")
     WebElement TextInput;
    @FindBy(xpath ="//*[@id=\"main\"]/div/div/div[1]/div/div/div/div/form/button")
     WebElement GoSearchButton;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div[1]/div/div/div/div/form/div/div[1]/a")////main[@id="main"]//div/form//div[1]/a
    public static WebElement BrowseByState;
    @FindBy (xpath = "//*[@id=\"q\"]")
    public static WebElement InnTextInput;
    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/div/form/button")
    public static WebElement InnGoSearchButton;
    //Define methods for above elements
    public void TextInput(){
        TextInput.click();
        TextInput.sendKeys("MASSACHUSETTS");
        GoSearchButton.click();
    }
    public void BrowseByState(){
        BrowseByState.click();
        InnTextInput.sendKeys("11230");
        InnGoSearchButton.click();
    }
}
