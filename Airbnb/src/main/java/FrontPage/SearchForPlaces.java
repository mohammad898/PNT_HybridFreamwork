package FrontPage;

import Elements.FrontPageElements;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SearchForPlaces extends FrontPageElements {

    public SearchForPlaces(WebDriver driver) {
        super(driver);
    }

    public void inputPlaces (){
        try{
            inputXpath.sendKeys("Queens", Keys.ENTER);}
        catch(NoSuchElementException ex){
            inputID.sendKeys("Queens", Keys.ENTER);
        }
    }

    public void searchClick(){
        WebDriverWait wait = new WebDriverWait(driver, 3);
        searchClick.click();

    }

}
