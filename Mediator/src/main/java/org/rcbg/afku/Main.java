package org.rcbg.afku;

public class Main {
    public static void main(String[] args) {

        // Create components
        Bank bank = new Bank();
        Buyer buyer = new Buyer();
        Seller seller = new Seller();
        Trader trader = new Trader();

        // Setup mediator
        TransactionMediator mediator = new TransactionMediator(bank, buyer, seller, trader);
        bank.setTransactionMediator(mediator);
        buyer.setTransactionMediator(mediator);
        seller.setTransactionMediator(mediator);
        trader.setTransactionMediator(mediator);

        // Execute actions

        bank.getLoan();

        buyer.buy(200);
        trader.trade(800);
        trader.trade(230);
        seller.sell(100);
        seller.sell(1000);
        buyer.buy(500);
        trader.trade(1000);
    }
}