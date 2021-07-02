package characters;

public class Hero {
    String name;
    String gender;
    int character_level = 0;
    float experience;
    float damage;
    float defense;
    float maximum_life;
    float armor;
    float physical_attack;
    float critical_damage;
    float critical_strike_chance;
    float attack_speed;
    float life_regeneration;

    public Hero(String name, String gender, int character_level, float experience, float maximum_life) {
        this.name = name;
        this.gender = gender;
        this.character_level = character_level;
        this.experience = experience;
        this.maximum_life = maximum_life;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getCharacter_level() {
        return character_level;
    }

    public float getExperience() {
        return experience;
    }

    public float getDamage() {
        return damage;
    }

    public float getDefense() {
        return defense;
    }

    public float getMaximum_life() {
        return maximum_life;
    }

    public float getArmor() {
        return armor;
    }

    public float getPhysical_attack() {
        return physical_attack;
    }

    public float getCritical_damage() {
        return critical_damage;
    }

    public float getCritical_strike_chance() {
        return critical_strike_chance;
    }

    public float getAttack_speed() {
        return attack_speed;
    }

    public float getLife_regeneration() {
        return life_regeneration;
    }

    public void setCharacter_level(int character_level) {
        this.character_level = character_level;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }

    public void setDefense(float defense) {
        this.defense = defense;
    }

    public void setMaximum_life(float maximum_life) {
        this.maximum_life = maximum_life;
    }

    public void setArmor(float armor) {
        this.armor = armor;
    }

    public void setPhysical_attack(float physical_attack) {
        this.physical_attack = physical_attack;
    }

    public void setCritical_damage(float critical_damage) {
        this.critical_damage = critical_damage;
    }

    public void setCritical_strike_chance(float critical_strike_chance) {
        this.critical_strike_chance = critical_strike_chance;
    }

    public void setAttack_speed(float attack_speed) {
        this.attack_speed = attack_speed;
    }

    public void setLife_regeneration(float life_regeneration) {
        this.life_regeneration = life_regeneration;
    }
}

