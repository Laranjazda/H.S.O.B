package characters;

import org.json.JSONException;
import org.json.JSONObject;

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

//    DecimalFormat df = new DecimalFormat("####0.00");

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getType() {
        return type;
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


    //atributos

    public void skills(){
        Random random = new Random ();
        int agi = 8 + random.nextInt(9);
        int def =  8 + random.nextInt (9);
        int str = 36 - agi - def;

        this.agility += agi;
        this.defense += def;
        this.strength += str;
    }

    //info
    @Override
    public String toString() {
        JSONObject data = new JSONObject ();
        try {
            data.put ("Nome", this.getName ());
            data.put ("Genero", this.getGender ());
            data.put ("Tipo", this.getType ());
            data.put ("Agilidade", this.getAgility ());
            data.put ("Defesa", this.getDefense ());
            data.put ("Força", this.getStrength ());
            data.put ("Dano", this.getDamage ());
            data.put ("HP",this.getHp ());
            data.put ("Stamina", this.getStamina ());
        } catch (JSONException e) {
            e.printStackTrace ();
        }
        return data.toString ().strip ();
    }

}

