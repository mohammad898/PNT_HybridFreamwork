package search;

import FrontPage.SearchForPlaces;
import base.ReusableAPI;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class searchForPlacesTest extends ReusableAPI {

    SearchForPlaces searchForPlaces;

    @BeforeMethod
    public void init(){
        searchForPlaces = new SearchForPlaces(driver);
    }

    @Test
    public void inputPlacesTest () {
        searchForPlaces.inputPlaces();
        searchForPlaces.searchClick();
    }

}
