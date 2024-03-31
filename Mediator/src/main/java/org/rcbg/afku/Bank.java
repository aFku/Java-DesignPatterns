package org.rcbg.afku;

public class Bank extends BaseComponent{
    private int balance = 1000;

    public void addMoney(int money){
        System.out.println(String.format("Adding money: %d + %d = %d", balance, money, balance + money));
        this.balance += money;
    }

    public void removeMoney(int money){
        System.out.println(String.format("Removing money: %d - %d = %d", balance, money, balance - money));
        this.balance -= money;
    }

    public void trade(int money){
        System.out.println(String.format("Barter trade has been executed with value: %d . No changes. Balance: %d", money, this.balance));
    }

    public void getLoan(){
        transactionMediator.notify(this, 100);
    }
}
