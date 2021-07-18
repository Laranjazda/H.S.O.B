package HeroClass;

import characters.Heroes;

public abstract class Mage extends Heroes {
    protected Mage(String name, String gender) {
        this.name = name;
        this.gender = gender;
        this.type = "Mage";
        this.setAgility (5);
        this.setDefense (8);
        this.setStrength (8);
        this.skills ();
        this.setDamage (this.getStrength () + this.getAgility ());
        this.setHp (this.getStrength () + this.getDefense ());
        this.setStamina (this.getDefense () + this.getAgility ());
    }

}
