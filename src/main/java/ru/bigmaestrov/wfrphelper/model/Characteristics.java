package ru.bigmaestrov.wfrphelper.model;

/**
 * Class for storing and exchanging money
 * goldCrown = 20 silverShillings = 240 brassPennies
 * silverShillings = 12brassPennies
 *
 * @version 1.0
 * @autor Nikita Egorov
 */
public abstract class Characteristics {
    int movement;
    int weaponSkill;
    int ballisticSkill;
    int strength;
    int toughness;
    int initiative;
    int dexterity;
    int leadership;
    int intelligence;
    int willPower;
    int fellowship;

    public Characteristics(int movement, int weaponSkill, int ballisticSkill, int strength, int toughness,
                           int initiative, int dexterity, int leadership, int intelligence, int willPower,
                           int fellowship) {
        this.movement = movement;
        this.weaponSkill = weaponSkill;
        this.ballisticSkill = ballisticSkill;
        this.strength = strength;
        this.toughness = toughness;
        this.initiative = initiative;
        this.dexterity = dexterity;
        this.leadership = leadership;
        this.intelligence = intelligence;
        this.willPower = willPower;
        this.fellowship = fellowship;
    }

    public int getMovement() {
        return movement;
    }

    public void setMovement(int movement) {
        this.movement = movement;
    }

    public int getWeaponSkill() {
        return weaponSkill;
    }

    public void setWeaponSkill(int weaponSkill) {
        this.weaponSkill = weaponSkill;
    }

    public int getBallisticSkill() {
        return ballisticSkill;
    }

    public void setBallisticSkill(int ballisticSkill) {
        this.ballisticSkill = ballisticSkill;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getToughness() {
        return toughness;
    }

    public void setToughness(int toughness) {
        this.toughness = toughness;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getLeadership() {
        return leadership;
    }

    public void setLeadership(int leadership) {
        this.leadership = leadership;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWillPower() {
        return willPower;
    }

    public void setWillPower(int willPower) {
        this.willPower = willPower;
    }

    public int getFellowship() {
        return fellowship;
    }

    public void setFellowship(int fellowship) {
        this.fellowship = fellowship;
    }
}
