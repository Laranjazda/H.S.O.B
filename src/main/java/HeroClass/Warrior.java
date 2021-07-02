package HeroClass;

import characters.Hero;

public class Warrior extends Hero{
    int warrior_attack;

    public Warrior(String name, String gender, int character_level, float experience, float maximum_life) {
        super (name, gender, character_level, experience, maximum_life);
    }

    public int getWarrior_attack() {
        return warrior_attack;
    }

    public void setWarrior_attack(int warrior_attack) {
        this.warrior_attack = warrior_attack;
    }
}
