package com.game.H.S.O.B;

import com.mongodb.DBCursor;
import connection.GameDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.UnknownHostException;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		GameDAO gameDAO =  new GameDAO ();

		//Ler dados
		DBCursor cursor = gameDAO.collection.find();
		while (cursor.hasNext()){
			System.out.println(cursor.next());
		}
	}


}
