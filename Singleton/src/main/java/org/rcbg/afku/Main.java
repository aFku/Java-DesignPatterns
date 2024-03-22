package org.rcbg.afku;

public class Main {
    public static void main(String[] args) {

        System.out.println("The GUIDs should be the same for both threads");
        Thread threadOne = new Thread(new ThreadDataOne());
        Thread threadTwo = new Thread(new ThreadDataTwo());

        threadOne.start();
        threadTwo.start();

        FileReaderSingleton.clearInstance();

        threadTwo.start();
        threadOne.start();
    }
}