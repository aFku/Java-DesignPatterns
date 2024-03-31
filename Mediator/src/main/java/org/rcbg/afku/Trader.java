package org.rcbg.afku;

public class Trader extends BaseComponent{

    public void trade(int money){
        transactionMediator.notify(this, money);
    }
}
