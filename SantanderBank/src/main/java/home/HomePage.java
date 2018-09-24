package home;

import base.ReusableAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;




public class HomePage extends ReusableAPI {
    //HomePage Elements
    @FindBy(xpath = "//*[@id=\"_P001_Header_WAR_P001_Headerportlet__VIEW\"]/div/div/div[1]/p/a/img")
    public static WebElement Header_Taeget;
    @FindBy(css = "#navsup > nav > ul > li:nth-child(1) > a")
    public static WebElement Personal_Textoption;
    @FindBy(css="#navsup > nav > ul > li:nth-child(2) > a")
    public static WebElement Business_Textoption;
    @FindBy(xpath = "//*[@id=\"navsup\"]/nav/ul/li[3]/a")
    public static WebElement Corporate_Textoption;
    @FindBy(xpath = "//*[@id=\"navsup\"]/nav/ul/li[4]/a")
    public static WebElement About_Textoption;
    @FindBy(xpath = "//*[@id=\"navsup\"]/nav/div/div/div[1]/a")
    public static WebElement ATM_BranchLocation;
    @FindBy(xpath = "//*[@id=\"_P001_Header_WAR_P001_Headerportlet_search\"]")
    public static WebElement Search_input;
    @FindBy(xpath = "//*[@id=\"_P001_Header_WAR_P001_Headerportlet_searchButton\"]")
    public static WebElement Search_button;
    @FindBy(xpath = "//*[@id=\"_P002_Menu_WAR_P002_Menuportlet__VIEW\"]/div/div/header/div[2]/div/div/nav/div[1]/span")
    public static WebElement Login;
    @FindBy(xpath = "//*[@id=\"_P049_Informations_Cluster_Grouper_WAR_P049_Informations_Clusterportlet_INSTANCE_4KcVbMQeZ1mG__VIEW\"]/div/div/nav/ul/li[1]/a")
    public static WebElement ULT_cash_back_creditcard_grouplink;
    @FindBy(xpath = "//*[@id=\"_P049_Informations_Cluster_Grouper_WAR_P049_Informations_Clusterportlet_INSTANCE_4KcVbMQeZ1mG__VIEW\"]/div/div/nav/ul/li[2]/a")
    public static WebElement STU_VALUE_CHEK;
    @FindBy(xpath = "//*[@id=\"_P049_Informations_Cluster_Grouper_WAR_P049_Informations_Clusterportlet_INSTANCE_4KcVbMQeZ1mG__VIEW\"]/div/div/nav/ul/li[3]/a")
    public static WebElement DIGI_BANKING;
    @FindBy(xpath = "//*[@id=\"san-locate-branch\"]")
    public static WebElement Find_location_near_you;
    @FindBy(xpath = "//*[@id=\"PandT-10-credit-tips-someone-perfect-credit-score\"]")
    public static WebElement top_10_credit_tips_article_link;
    @FindBy(xpath = "//*[@id=\"PandT-top-5-text-email-mobile-alerts-belong-electronic-devices\"]")
    public static WebElement top_5_text_email_mobile_alert_article_link;
    @FindBy(xpath = "//*[@id=\"PandT-overcome-anxiety-buying-house\"]")
    public static WebElement How_to_Overcome_Anxiety_article_link;
    @FindBy(xpath = "//*[@id=\"PandT-9-ways-save-serious-grocery-store\"]")
    public static WebElement top_9_Ways_to_Save_Serious_$_article_link;
    @FindBy (xpath = "//*[@id=\"PandT-abcs-heloc-application-process\"]")
    public static WebElement The_ABCs_of_the_HELOC_article_link;
    @FindBy(xpath = "//*[@id=\"_P016_Links_Cluster_Grouper_WAR_P016_Links_Cluster_Grouperportlet_INSTANCE_9FLuCSt6O4Uq__VIEW\"]/div/footer/nav/div[1]/ul/li[1]/a/h4")
    public static WebElement Home_Header;
    @FindBy(xpath = "//*[@id=\"_P016_Links_Cluster_Grouper_WAR_P016_Links_Cluster_Grouperportlet_INSTANCE_9FLuCSt6O4Uq__VIEW\"]/div/footer/nav/div[1]/ul/li[2]/a/h4")
    public static WebElement Terms_of_use_Header;
    @FindBy(xpath = "//*[@id=\"_P016_Links_Cluster_Grouper_WAR_P016_Links_Cluster_Grouperportlet_INSTANCE_9FLuCSt6O4Uq__VIEW\"]/div/footer/nav/div[1]/ul/li[3]/a/h4")
    public static WebElement Privacy_policy_Header;
    @FindBy(xpath = "//*[@id=\"_P016_Links_Cluster_Grouper_WAR_P016_Links_Cluster_Grouperportlet_INSTANCE_9FLuCSt6O4Uq__VIEW\"]/div/footer/nav/div[1]/ul/li[4]/a/h4")
    public static WebElement Contact_us_Header;






    //define functions of above elements

    public void Header_Taeget(){
        Header_Taeget.click();
    }
    public void Personal_Textoption(){Personal_Textoption.click();}
    public void Business_Textoption(){Business_Textoption.click();}
    public void Corporate_Textoption(){Corporate_Textoption.click();}
    public void About_Textoption(){About_Textoption.click();}
    public void ATM_BranchLocation(){ATM_BranchLocation.click();}
    //public void https://github.com/Jahidul2543/PageObjectModelFrameworkearch_input(){Search_input.click();Search_input.sendKeys("debit card");Search_button.click();}
    public void Login(){Login.click();}
    public void ULT_cash_back_creditcard_grouplink(){ULT_cash_back_creditcard_grouplink.click();}
    public void STU_VALUE_CHEK(){STU_VALUE_CHEK.click();}
    public void DIGI_BANKING(){DIGI_BANKING.click();}
    public void Find_location_near_you(){Find_location_near_you.click();}
    public void top_10_credit_tips_article_link(){top_10_credit_tips_article_link.click();}
    public void top_5_text_email_mobile_alert_article_link(){top_5_text_email_mobile_alert_article_link.click();}
    public void How_to_Overcome_Anxiety_article_link(){How_to_Overcome_Anxiety_article_link.click();}
    public void top_9_Ways_to_Save_Serious_$_article_link(){top_9_Ways_to_Save_Serious_$_article_link.click();}
    public void The_ABCs_of_the_HELOC_article_link(){The_ABCs_of_the_HELOC_article_link.click();}
    public void Home_Header(){Home_Header.click();}
    public void Terms_of_use_Header(){Terms_of_use_Header.click();}
    public void Privacy_policy_Header(){Privacy_policy_Header.click();}
    public void Contact_us_Header(){Contact_us_Header.click();}

//



}
