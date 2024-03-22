package org.rcbg.afku;

public class ThreadDataTwo implements Runnable{

    @Override
    public void run(){
        FileReaderSingleton reader = FileReaderSingleton.getInstance("data_2.json");
        System.out.println("[ThreadDataTwo] After getting instance for data_2.json");
        System.out.println(String.format("[ThreadDataTwo] guid: %s", reader.getField("guid")));
    }
}
