package org.rcbg.afku;


public class Main {
    public static void main(String[] args) {
        CustomArray customArray = new CustomArray();
        customArray.add("1");
        customArray.add("2");
        customArray.add("3");
        customArray.add("4");
        customArray.add("5");
        customArray.add("6");
        customArray.add("7");

        IIterator iterator = customArray.getCustomIterator();
        while (iterator.hasMore()){
            System.out.println(String.format("Next element: %s", iterator.getNext()));
        }
    }
}