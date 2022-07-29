package ru.bigmaestrov.wfrphelper.model;

import java.io.*;

/**
 * Class for storing and exchanging money
 * goldCrown = 20 silverShillings = 240 brassPennies
 * silverShillings = 12brassPennies
 *
 * @version 1.0
 * @autor Nikita Egorov
 */
public class Wallet {
    String owner;
    int goldCrown;
    int silverShillings;
    int brassPennies;

    public Wallet() {
        setGoldCrown(0);
        setSilverShillings(0);
        setBrassPennies(0);
        setOwner("None");
    }

    public Wallet(int goldCrown, int silverShillings, int brassPennies) {
        addBrassPennies(brassPennies);
        addSilverShillings(silverShillings);
        addGoldCrown(goldCrown);
        setOwner("None");
    }

    public Wallet(int goldCrown, int silverShillings, int brassPennies, String owner) {
        addBrassPennies(brassPennies);
        addSilverShillings(silverShillings);
        addGoldCrown(goldCrown);
        setOwner(owner);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
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
            setSilverShillings((getSilverShillings() + number));
        }
    }

    public void addBrassPennies(int number) {
        if (getBrassPennies() + number > 12) {
            addSilverShillings((getBrassPennies() + number) / 12);
            setBrassPennies(((getBrassPennies() + number) % 12));
        } else {
            setBrassPennies((getBrassPennies() + number));
        }
    }

    public void substructGoldCrown(int number) {
        if (getGoldCrown() >= number) setGoldCrown(getGoldCrown() - number);
        else System.err.println("You haven't enough money");
    }

    public void substructSilverShillings(int number) {
        if (getSilverShillings() >= number) setSilverShillings(getSilverShillings() - number);
        else if (getSilverShillings() < number && getGoldCrown() * 20 + getSilverShillings() >= number) {
            substructGoldCrown((int) Math.ceil((((double) number - getSilverShillings())) / 20));
            setSilverShillings(getSilverShillings() + (int) Math.ceil(((double) number - getSilverShillings()) / 20) * 20 - number);
        } else System.err.println("You haven't enough money");
    }

    public void substructBrassPennies(int number) {
        if (getBrassPennies() >= number) setBrassPennies(getBrassPennies() - number);
        else if (getBrassPennies() < number && getGoldCrown() * 20 * 12 + getSilverShillings() * 12 + getBrassPennies() >= number) {
            substructSilverShillings((int) Math.ceil((((double) number - getBrassPennies())) / 12));
            setBrassPennies(getBrassPennies() + (int) Math.ceil(((double) number - getBrassPennies()) / 12) * 12 - number);
        } else System.err.println("You haven't enough money");
    }

    public void showWallet() {
        System.out.println("Now you have " + getGoldCrown() + " " + getSilverShillings() + " " + getBrassPennies());
    }

    public String getWallet() {
        return getOwner() + " " + getGoldCrown() + " " + getSilverShillings() + " " + getBrassPennies();
    }

    public void saveToTxtFile(String filePath) {
        try {
            PrintStream out = new PrintStream(new FileOutputStream(filePath));
            out.println(getWallet());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void loadFromTxtFile(String filePath) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String[] s = br.readLine().split(" ");
            setOwner(s[0]);
            setGoldCrown(Integer.parseInt(s[1]));
            setSilverShillings(Integer.parseInt(s[2]));
            setBrassPennies(Integer.parseInt(s[3]));
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
