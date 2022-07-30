package ru.bigmaestrov.wfrphelper.model;

public abstract class Entity {
    String entityClass;
    Characteristics characteristics;
    String Appearance;
    Movement movement;
    Armour armour;
    Attack attack;

    public String getEntityClass() {
        return entityClass;
    }

    public void setEntityClass(String entityClass) {
        this.entityClass = entityClass;
    }

    public Characteristics getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(Characteristics characteristics) {
        this.characteristics = characteristics;
    }

    public String getAppearance() {
        return Appearance;
    }

    public void setAppearance(String appearance) {
        Appearance = appearance;
    }

    public Movement getMovement() {
        return movement;
    }

    public void setMovement(Movement movement) {
        this.movement = movement;
    }

    public Armour getArmour() {
        return armour;
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
    }

    public Attack getAttack() {
        return attack;
    }

    public void setAttack(Attack attack) {
        this.attack = attack;
    }
}
