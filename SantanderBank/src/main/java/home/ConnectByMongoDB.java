package home;



import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.openqa.selenium.WebElement;


import java.util.ArrayList;
import java.util.List;
public class ConnectByMongoDB extends MongoDBElements{

        public static MongoDatabase mongoDatabase = null;
        public static MongoDatabase connectToMongoDB(){
            MongoClient mongoClient = new MongoClient();
            mongoDatabase = mongoClient.getDatabase("PNT");
            System.out.println("Database Connected");
            return mongoDatabase;
        }
        public static String insertToMongoDB(String menu){
            MongoDatabase mongoDatabase = connectToMongoDB();
            MongoCollection<Document>  collection = mongoDatabase.getCollection("Banking");
            //table names: Banking
            //using getCollection(String s) method.
            Document doc = new Document().append("AccountType",menu);
            collection.insertOne(doc);
            return menu + " added.";
        }
        public static List<String> readFromMongoDB(){
            List<String> list = new ArrayList<>();
            //User user = new User();
            MongoDatabase mongoDatabase = connectToMongoDB();
            MongoCollection<Document> collection = mongoDatabase.getCollection("Banking");
            //table names: infoMenu
            BasicDBObject basicDBObject = new BasicDBObject();
            FindIterable<Document> iterable = collection.find(basicDBObject);
            for(Document doc:iterable){
                String id = "";
                int idInt = 0;
                String spanText = (String) doc.get("AccountType");
                list.add(spanText);
            }
            return list;
        }
    }

