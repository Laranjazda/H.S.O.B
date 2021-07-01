package connection;

import java.net.UnknownHostException;
import com.mongodb.*;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class GameDAO {
    public GameDAO() throws MongoException{
        try{
            MongoClient mongoClient = new MongoClient("mongodb+srv://laranjazda:bros2011@gamehsob.yqb41.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
            MongoDatabase database = mongoClient.getDatabase ("heroes");
            System.out.println ("Conexão realizada!");
        }catch (Exception e){
            System.out.println ("Erro: "+e);
        }
    }

}
