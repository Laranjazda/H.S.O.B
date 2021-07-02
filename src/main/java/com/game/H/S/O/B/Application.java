package com.game.H.S.O.B;

import HeroClass.Warrior;

public class Application {
	public static void main(String[] args) {

		Warrior warrior = new Warrior ("João", "Masculno",	0,0,10);
		warrior.setWarrior_attack (20);
		System.out.println ("==========================="
				+ "\nNome: " + warrior.getName ()
				+ "\nGênero: " + warrior.getGender ()
				+ "\nLevel: " + warrior.getCharacter_level ()
				+ "\nExperiência: " + warrior.getExperience ()
				+ "\nVida Máxima: " + warrior.getMaximum_life ()
				+ "\nAtaque: " + warrior.getWarrior_attack ()
				+ "\n===========================");
	}
}
