package search;

import Elements.FrontPage;
import FrontPage.SearchForPlaces;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class searchForPlacesTest extends SearchForPlaces {

    FrontPage frontPage;

    @BeforeMethod
    public void init(){
        frontPage = PageFactory.initElements(driver, FrontPage.class);
    }

    @Test
    public void inputPlacesTest () {
        inputPlaces();
    }

}
