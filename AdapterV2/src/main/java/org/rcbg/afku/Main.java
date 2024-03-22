package org.rcbg.afku;

// We found really good Lib to verify if data in our config are correct, but Lib requires data as POJO and we have them in string
public class Main {
    public static void main(String[] args) {

        String config = "<?xml version='1.0'>\n" +
                "<config>\n" +
                "<destination>192.168.1.32</destination>\n" +
                "<source>127.0.0.1</source>\n" +
                "<port>22</port>\n" +
                "</config>";

        System.out.println(config);

        processConfig(config);
    }

    public static void processConfig(String config){
        IVerifyConfig verifyLib = new ConfigVerifyLibAdapter();
        System.out.println(String.format("Is config correct?: %b", verifyLib.checkIfCorrect(config)));
    }
}