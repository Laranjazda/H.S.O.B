package HeroClass;

import characters.Heroes;

public abstract class Healer extends Heroes {
    protected Healer(String name, String gender) {
        this.name = name;
        this.gender = gender;
        this.type = "Healer";
        this.setAgility (7);
        this.setDefense (3);
        this.setStrength (2);
        this.skills ();
        this.setDamage (this.getStrength () + this.getAgility ());
        this.setHp (this.getStrength () + this.getDefense ());
        this.setStamina (this.getDefense () + this.getAgility ());
    }

}
