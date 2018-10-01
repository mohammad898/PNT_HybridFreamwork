package Search;

import home.HomePage_DragDrop;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Homepage_DragDropTest extends HomePage_DragDrop {
    HomePage_DragDrop homePage_dragDrop;
    @BeforeMethod
    public void init(){homePage_dragDrop= PageFactory.initElements(driver,HomePage_DragDrop.class); }
    @Test
    public void onlineServices() throws InterruptedException {serviceDragDrop();}
}
