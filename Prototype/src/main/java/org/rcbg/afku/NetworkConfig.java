package org.rcbg.afku;

public class NetworkConfig implements IPrototype{
    protected String ipAddress;
    protected int port;
    protected String domain;

    public NetworkConfig(String ipAddress, int port, String domain) {
        this.ipAddress = ipAddress;
        this.port = port;
        this.domain = domain;
    }

    protected NetworkConfig(NetworkConfig networkConfig){
        this.ipAddress = networkConfig.ipAddress;
        this.port = networkConfig.port;
        this.domain = networkConfig.domain;
    }

    @Override
    public IPrototype clone() {
        return new NetworkConfig(this);
    }

    @Override
    public String toString(){
        return String.format("{IP: %s , PORT: %d , DOMAIN: %s}", this.ipAddress, this.port, this.domain);
    }
}
