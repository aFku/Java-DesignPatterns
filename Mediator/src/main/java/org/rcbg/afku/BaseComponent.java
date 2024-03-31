package org.rcbg.afku;

public class BaseComponent {
    ITransactionMediator transactionMediator;

    public void setTransactionMediator(ITransactionMediator transactionMediator){
        this.transactionMediator = transactionMediator;
    }
}
