package characters;

import org.bson.json.JsonObject;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.DecimalFormat;
import java.util.Random;

public class Heroes {
    protected String name;
    protected String gender;
    protected String type;
//    protected int character_level;
//    protected float experience;

    protected int agility;
    protected int defense;
    protected int strength;

    protected double damage; //STR + AGI
    protected double hp; // STR + DEF
    protected double stamina; // DEF + AGI

    public Heroes() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setType(String type) {
        this.type = type;
    }

//    public void setCharacter_level(int character_level) {
//        this.character_level = character_level;
//    }
//
//    public void setExperience(float experience) {
//        this.experience = experience;
//    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public void setStamina(double stamina) {
        this.stamina = stamina;
    }
    //getters

    DecimalFormat df = new DecimalFormat("####0.00");

    public String getName() {
        return df.format (name);
    }

    public String getGender() {
        return df.format (gender);
    }

    public String getType() {
        return df.format (type);
    }

//    public int getCharacter_level() {
//        return character_level;
//    }
//
//    public float getExperience() {
//        return experience;
//    }

    public int getAgility() {
        return agility;
    }

    public int getDefense() {
        return defense;
    }

    public int getStrength() {
        return strength;
    }

    public double getDamage() {
        return damage;
    }

    public double getHp() {
        return hp;
    }

    public double getStamina() {
        return stamina;
    }

    @Override
    public String toString() {
        return "Heroes{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", type='" + type + '\'' +
                ", agility=" + agility +
                ", defense=" + defense +
                ", strength=" + strength +
                ", damage=" + damage +
                ", hp=" + hp +
                ", stamina=" + stamina +
                '}';
    }

    //atributos
    Random random = new Random ();
    public void skills(){
        this.agility += 8 + random.nextInt(9);
        this.defense += 8 +random.nextInt (7);
        this.strength += 36 + random.nextInt (5);
    }

    //info
    public void getInfo() {
        System.out.println ("Nome:" + this.name.toUpperCase ()
                + "\nGenero:" + this.getGender ()
                + "\nTipo: " + this.getType ()
                + "\nAgilidade: " + this.getAgility ()
                + "\nDefesa: " + this.getDefense ()
                + "\nForça: " + this.getStrength ()
                + "\nDano: " + this.getDamage ()
                + "\nHP: " + this.getHp ()
                + "\nStamina: " + this.getStamina ()
        );
    }
}

