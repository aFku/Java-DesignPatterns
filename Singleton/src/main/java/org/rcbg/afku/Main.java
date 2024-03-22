package org.rcbg.afku;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("The GUIDs should be the same for both threads");
        Thread threadOne = new Thread(new ThreadDataOne());
        Thread threadTwo = new Thread(new ThreadDataTwo());

        threadOne.start();
        threadTwo.start();

        threadOne.join();
        threadTwo.join();

        FileReaderSingleton.clearInstance();

        Thread threadThree = new Thread(new ThreadDataOne());
        Thread threadFour = new Thread(new ThreadDataTwo());

        threadFour.start();
        threadThree.start();

        threadFour.join();
        threadThree.join();
    }
}