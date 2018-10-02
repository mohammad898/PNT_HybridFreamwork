package Search;

import home.MongoDBElements;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import home.ConnectByMongoDB;

import java.util.List;

public class ConnectByMongoDBTest extends MongoDBElements {
    MongoDBElements object;
    @BeforeMethod
    public void init(){
        object = PageFactory.initElements(driver,MongoDBElements.class);
    }
    @Test
    public void test1() throws InterruptedException {
       List<String> bankinglist=banking();
       /*for(String it: bankinglist){
           ConnectByMongoDB.insertToMongoDB(it);
       }*/
        List<String> readData = ConnectByMongoDB.readFromMongoDB();
// int i=0;
//        for(String ahmed : readData){
//            Assert.assertEquals(ahmed,bankinglist.get(i));
//            i++;
//        }
        for(int index = 0; index<readData.size();index++){
            Assert.assertEquals(readData.get(index),bankinglist.get(index));
        }
    }
}
