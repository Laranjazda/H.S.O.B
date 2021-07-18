package com.game.H.S.O.B;

import HeroClass.*;
import org.json.JSONException;

public class Application {
	public static void main(String[] args) throws JSONException {
		Archer personagem1 = new Archer ("Carlos", "Masculino") {};
		Warrior personagem2 = new Warrior ("Maria", "Feminino") {};
		Healer personagem3 = new Healer ("Regina", "Feminino") {};
		Mage personagem4 = new Mage ("João", "Masculino") {};
		Tanker personagem5 = new Tanker ("Adhemar", "Masculino") {};


		System.out.println (personagem1);
		System.out.println (personagem2);
		System.out.println (personagem3);
		System.out.println (personagem4);
		System.out.println (personagem5);
//


	}
}
