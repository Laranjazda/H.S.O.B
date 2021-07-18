package HeroClass;

import characters.Heroes;

public abstract class Healer extends Heroes {
    protected Healer(String name, String gender) {
        this.name = name;
        this.gender = gender;
        this.type = "Healer";
        this.setAgility (14);
        this.setDefense (6);
        this.setStrength (7);
        this.skills ();
        this.setDamage (this.getStrength () + this.getAgility ());
        this.setHp (this.getStrength () + this.getDefense ());
        this.setStamina (this.getDefense () + this.getAgility ());
    }

}
