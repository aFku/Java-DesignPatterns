package org.rcbg.afku;

public class TransactionMediator implements ITransactionMediator{
    private Bank bank;
    private Buyer buyer;
    private Seller seller;
    private Trader trader;

    public TransactionMediator(Bank bank, Buyer buyer, Seller seller, Trader trader) {
        this.bank = bank;
        this.buyer = buyer;
        this.seller = seller;
        this.trader = trader;
    }

    public void reactOnBuy(int money){
        System.out.println("[Buyer notification]");
        bank.removeMoney(money);
    }

    public void reactOnSell(int money){
        System.out.println("[Seller notification]");
        bank.addMoney(money);
    }

    public void reactOnTrade(int money){
        System.out.println("[Trader notification]");
        bank.trade(money);
    }

    public void reactOnLoan(int money){
        System.out.println("[Loan notification]");
        bank.addMoney(money);
    }

    @Override
    public void notify(BaseComponent sender, int money) {
        if (sender == this.buyer){
            reactOnBuy(money);
        }
        if (sender == this.seller){
            reactOnSell(money);
        }
        if (sender == this.trader){
            reactOnTrade(money);
        }
        if (sender == this.bank){
            reactOnLoan(money);
        }
    }
}
