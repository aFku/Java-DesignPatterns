package org.rcbg.afku.verifylib;


public class ConfigObj {
    private String source;
    private String destination;
    private int port;

    public ConfigObj(String source, String destination, int port) {
        this.source = source;
        this.destination = destination;
        this.port = port;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getPort() {
        return port;
    }
}
