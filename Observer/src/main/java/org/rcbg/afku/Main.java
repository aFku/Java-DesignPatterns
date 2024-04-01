package org.rcbg.afku;


public class Main {
    public static void main(String[] args) {

        // YoutubeAccount is also Publisher and Subscriber
        YoutubeAccount account1 = new YoutubeAccount("test1");
        YoutubeAccount account2 = new YoutubeAccount("test2");
        YoutubeAccount account3 = new YoutubeAccount("test3");

        // Do some subscriptions
        account1.addSubscriber(account2);
        account1.addSubscriber(account3);

        account2.addSubscriber(account3);

        // account2 and account3 should be notified
        account1.uploadNewMovie("NewMovieFromAccount1");

        System.out.println();
        // Only account 3 should be notified
        account2.uploadNewMovie("NewMovieFromAccount2");

        // No one should be notified
        account3.uploadNewMovie("NewMovieFromAccount3");
    }
}