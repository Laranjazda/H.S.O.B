package com.game.H.S.O.B;


import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class Application {
	public static void main(String[] args) {
		try{
			MongoClient mongoClient = new MongoClient("mongodb+srv://laranjazda:B@tataFrut@1979@gamehsob.siuyj.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
			MongoDatabase database = mongoClient.getDatabase ("test");
			System.out.println ("Conexão realizada!");
		}catch (Exception e){
			System.out.println ("Erro: "+e);
		}





//		GameDAO gameDAO =  new GameDAO ();

//		//Ler dados
//		DBCursor cursor = gameDAO.collection.find();
//		while (cursor.hasNext()){
//			System.out.println(cursor.next());
//		}
	}


}
