package FrontPage;

import Elements.FrontPage;
import org.openqa.selenium.*;

public class SearchForPlaces extends FrontPage {

    public void inputPlaces (){
        try{
            inputXpath.sendKeys("Queens", Keys.ENTER);}
        catch(NoSuchElementException ex){
            inputID.sendKeys("Queens", Keys.ENTER);
        }
    }

    public void searchClick(){
        searchClick.click();

    }

}
