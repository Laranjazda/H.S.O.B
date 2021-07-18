package HeroClass;

import characters.Heroes;

public abstract class Warrior extends Heroes {
    protected Warrior(String name, String gender) {
        this.name = name;
        this.gender = gender;
        this.type = "Warrior";
        this.setAgility (8);
        this.setDefense (8);
        this.setStrength (8);
        this.skills ();
        this.setDamage (this.getStrength () + this.getAgility ());
        this.setHp (this.getStrength () + this.getDefense ());
        this.setStamina (this.getDefense () + this.getAgility ());
    }
}
