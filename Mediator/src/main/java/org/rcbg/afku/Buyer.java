package org.rcbg.afku;

public class Buyer extends BaseComponent{

    public void buy(int money){
        transactionMediator.notify(this, money);
    }
}
