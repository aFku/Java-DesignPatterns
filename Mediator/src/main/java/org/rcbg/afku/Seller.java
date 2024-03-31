package org.rcbg.afku;

public class Seller extends BaseComponent{

    public void sell(int money){
        transactionMediator.notify(this, money);
    }
}
