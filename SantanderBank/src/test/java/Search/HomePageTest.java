package Search;

import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends HomePage {
    @BeforeMethod
    public void initializing() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    }
    @Test
    public void Header_Taeget_Test(){ Header_Taeget(); }
    @Test
    public void Personal_Textoption_Test(){ Personal_Textoption(); }
    @Test
    public void Business_Textoption_Test(){ Business_Textoption(); }
    @Test
    public void Corporate_Textoption_Test(){Corporate_Textoption();}
    @Test
    public void About_Textoption_Test(){About_Textoption();}
    @Test
    public void ATM_BranchLocation_Test(){ATM_BranchLocation();}
//    @Test
//    public void Search_input_Test(){Search_input();}
    /*@Test
    public void Search_input_Test(){Search_input();}*/
    @Test
    public void Login_Test(){Login();}
    @Test
    public void ULT_cash_back_creditcard_grouplink_Test(){ULT_cash_back_creditcard_grouplink();}
    @Test
    public void STU_VALUE_CHEK_Test(){STU_VALUE_CHEK();}
    @Test
    public void DIGI_BANKING_Test(){DIGI_BANKING();}
    @Test
    public void Find_location_near_you_Test(){Find_location_near_you();}
    @Test
    public void top_10_credit_tips_article_link_Test(){top_10_credit_tips_article_link();}
    @Test
    public void top_5_text_email_mobile_alert_article_link_Test(){top_5_text_email_mobile_alert_article_link();}
    @Test
    public void How_to_Overcome_Anxiety_article_link_Test(){How_to_Overcome_Anxiety_article_link();}
    @Test
    public void top_9_Ways_to_Save_Serious_$_article_link_Test(){top_9_Ways_to_Save_Serious_$_article_link();}
    @Test
    public void The_ABCs_of_the_HELOC_article_link_Test(){The_ABCs_of_the_HELOC_article_link();}
    @Test
    public void Home_Header_Test(){Home_Header();}
    @Test
    public void Terms_of_use_Header_Test(){Terms_of_use_Header();}
    @Test
    public void Privacy_policy_Header_Test(){Privacy_policy_Header();}
    @Test
    public void Contact_us_Header_Test(){Contact_us_Header();}
}
