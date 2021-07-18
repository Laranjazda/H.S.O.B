package com.game.H.S.O.B;

import HeroClass.Archer;
import HeroClass.Warrior;
import characters.Heroes;
import org.json.JSONException;

public class Application {
	public static void main(String[] args) throws JSONException {
		Archer personagem1 = new Archer ("Reginaldo", "Masculino") {};
		Archer personagem2 = new Archer ("Marcela", "Feminino") {};
		Warrior personagem3 = new Warrior ("Bombado","Masculino") {
			@Override
			public void getInfo() {
				super.getInfo ();
			}
		};

		System.out.println (personagem1);
		System.out.println (personagem2);
		System.out.println (personagem3);


	}
}
