package ru.bigmaestrov.wfrphelper.model;

public class Main {
    public static void main(String[] args) {
        Wallet wallet = new Wallet(20,20,11);
        wallet.showWallet();
        wallet.substructBrassPennies(13);
        wallet.showWallet();
    }
}
