package HeroClass;

import characters.Heroes;

public abstract class Archer extends Heroes {
    protected Archer(String name, String gender) {
        this.name = name;
        this.gender = gender;
        this.type = "Archer";
        this.setAgility (5);
        this.setDefense (5);
        this.setStrength (5);
        this.skills ();
        this.setDamage (this.getStrength () + this.getAgility ());
        this.setHp (this.getStrength () + this.getDefense ());
        this.setStamina (this.getDefense () + this.getAgility ());
    }
}
