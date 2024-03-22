package org.rcbg.afku;

public class Main {
    public static void main(String[] args) {

        // Test case when client uses Library with incompatible interface
        VeryUsefulFinancialLib rawFinancialLib = new VeryUsefulFinancialLib();
        System.out.println("[RAW LIB]");
        processReportFile(rawFinancialLib.generateXmlFinancialReport());

        System.out.println("\n\n");

        // Test case when client uses Adapter for incompatible library
        IFinancialLibJson financialLib = new FinancialLibJsonAdapter();
        System.out.println("[ADAPTER LIB]");
        processReportFile(financialLib.generateJsonFinancialReport());

    }


    // Our client code required data in JSON format
    public static void processReportFile(String reportString){
        // First check if have required format
        if(reportString.charAt(0) != '{'){
            System.out.println("ERROR: Provided data are not compatible. Required json format.");
            return;
        }
        System.out.println("Client is processing data: " + reportString);
    }
}