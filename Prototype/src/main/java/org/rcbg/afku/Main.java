package org.rcbg.afku;

public class Main {
    public static void main(String[] args) {
        // Create first NetworkConfig
        NetworkConfig networkConfig1 = new NetworkConfig("127.0.0.1", 80, "localhost.localdomain");

        // Copy config
        IPrototype networkConfig2 = networkConfig1.clone();

        // Verify copy with original
        System.out.println("Original: " + networkConfig1.toString());
        System.out.println("COPY: " + networkConfig2.toString());


        System.out.println("\n\n");

        // Create child of NetworkConfig - FwNetworkConfig
        FwNetworkConfig fwNetworkConfig1 = new FwNetworkConfig("192.168.1.123", 443, "example.domain", Traffic.INBOUND, Action.PASS);

        // Copy NetworkConfig
        IPrototype fwNetworkConfig2 = fwNetworkConfig1.clone();

        // Verify copy with original
        System.out.println("Original: " + fwNetworkConfig1.toString());
        System.out.println("COPY: " + fwNetworkConfig2.toString());
    }
}