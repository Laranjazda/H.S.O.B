package connection;

import java.net.UnknownHostException;
import com.mongodb.*;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class GameDAO {
    DB dataBase;
    public DBCollection collection;
    public BasicDBObject document = new BasicDBObject();
    public GameDAO() throws MongoException{
        MongoClient connectionServer = new MongoClient(
                "mongodb+srv://laranjazda:bros2011@gamehsob.yqb41.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        dataBase = connectionServer.getDB("heroes");
        collection = dataBase.getCollection("warriors");
        System.out.println("Conexão bem sucedida!\n"+"Por favor aguarde ...");
    }

}
