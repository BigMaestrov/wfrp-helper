package ru.bigmaestrov.wfrphelper.model;

/**
 * Class for storing and exchanging money
 * goldCrown = 20 silverShillings = 240 brassPennies
 * silverShillings = 12brassPennies
 *
 * @version 1.0
 * @autor Nikita Egorov
 */
public class Wallet {
    int goldCrown;
    int silverShillings;
    int brassPennies;

    public Wallet() {
        setGoldCrown(0);
        setSilverShillings(0);
        setBrassPennies(0);
    }

    public Wallet(int goldCrown, int silverShillings, int brassPennies) {
        addBrassPennies(brassPennies);
        addSilverShillings(silverShillings);
        addGoldCrown(goldCrown);
    }

    public int getGoldCrown() {
        return goldCrown;
    }

    public void setGoldCrown(int goldCrown) {
        this.goldCrown = goldCrown;
    }

    public int getSilverShillings() {
        return silverShillings;
    }

    public void setSilverShillings(int silverShillings) {
        this.silverShillings = silverShillings;
    }

    public int getBrassPennies() {
        return brassPennies;
    }

    public void setBrassPennies(int brassPennies) {
        this.brassPennies = brassPennies;
    }

    public void addGoldCrown(int number) {
        setGoldCrown(getGoldCrown() + number);
    }

    public void addSilverShillings(int number) {
        if (getSilverShillings() + number > 20) {
            addGoldCrown((getSilverShillings() + number) / 20);
            setSilverShillings(((getSilverShillings() + number) % 20));
        } else {
            setSilverShillings((getSilverShillings()+number));
        }
    }

    public void addBrassPennies(int number) {
        if (getBrassPennies() + number > 12) {
            addSilverShillings((getBrassPennies() + number) / 12);
            setBrassPennies(((getBrassPennies() + number) % 12));
        } else {
            setBrassPennies((getBrassPennies()+number));
        }
    }

    public void substructGoldCrown(int number) {
        setGoldCrown(getGoldCrown() - number);
    }

    public void substructSilverShillings(int number) {
        if (getSilverShillings() < number) {
            substructGoldCrown(1);
            setSilverShillings(getSilverShillings() + 20 - number);
        } else setSilverShillings(getSilverShillings() - number);
    }

    public void substructBrassPennies(int number) {
        if (getBrassPennies() < number) {
            substructSilverShillings(1);
            setBrassPennies(getBrassPennies() + 12 - number);
        } else setBrassPennies(getBrassPennies() - number);
    }

    public void showWallet() {
        System.out.println("Now you have " + getGoldCrown() + " " + getSilverShillings() + " " + getBrassPennies());
    }
}
