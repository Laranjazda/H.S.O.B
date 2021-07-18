package HeroClass;

import characters.Heroes;

public abstract class Tanker extends Heroes {
    protected Tanker(String name, String gender) {
        this.name = name;
        this.gender = gender;
        this.type = "Tanker";
        this.setAgility (9);
        this.setDefense (15);
        this.setStrength (12);
        this.skills ();
        this.setDamage (this.getStrength () + this.getAgility ());
        this.setHp (this.getStrength () + this.getDefense ());
        this.setStamina (this.getDefense () + this.getAgility ());
    }

}
