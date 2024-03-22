package org.rcbg.afku;

public class ThreadDataOne implements Runnable{

    @Override
    public void run(){
        FileReaderSingleton reader = FileReaderSingleton.getInstance("data_1.json");
        System.out.println("[ThreadDataOne] After getting instance for data_1.json");
        System.out.println(String.format("[ThreadDataOne] guid: %s", reader.getField("guid")));
    }
}
