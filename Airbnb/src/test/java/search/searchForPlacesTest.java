package search;

import Elements.FrontPage;
import FrontPage.SearchForPlaces;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class searchForPlacesTest extends SearchForPlaces {

    FrontPage frontPage;

    @Test
    public void inputPlacesTest () {
        frontPage = PageFactory.initElements(driver, FrontPage.class);
        inputPlaces();
        searchClick();
    }
    @Test
    public void  click(){
        inputPlaces();
        searchClick();
    }

}
