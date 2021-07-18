package HeroClass;

import characters.Heroes;

public abstract class Mage extends Heroes {
    protected Mage(String name, String gender) {
        this.name = name;
        this.gender = gender;
        this.type = "Mage";
        this.setAgility (7);
        this.setDefense (5);
        this.setStrength (3);
        this.skills ();
        this.setDamage (this.getStrength () + this.getAgility ());
        this.setHp (this.getStrength () + this.getDefense ());
        this.setStamina (this.getDefense () + this.getAgility ());
    }

}
