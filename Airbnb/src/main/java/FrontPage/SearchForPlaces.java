package FrontPage;

import Elements.FrontPageElements;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

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
        if(searchClick!=null){
            searchClick.click();}
        }

    }


