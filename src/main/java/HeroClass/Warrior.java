package HeroClass;

import characters.Heroes;

public abstract class Warrior extends Heroes {
    protected Warrior(String name, String gender) {
        this.name = name;
        this.gender = gender;
        this.type = "Warrior";
        this.setAgility (14);
        this.setDefense (12);
        this.setStrength (12);
        this.skills ();
        this.setDamage (this.getStrength () + this.getAgility ());
        this.setHp (this.getStrength () + this.getDefense ());
        this.setStamina (this.getDefense () + this.getAgility ());
    }
}
