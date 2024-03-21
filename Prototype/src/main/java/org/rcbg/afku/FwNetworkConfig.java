package org.rcbg.afku;

public class FwNetworkConfig extends NetworkConfig{

    private Traffic trafficDirection;
    private Action action;

    public FwNetworkConfig(String ipAddress, int port, String domain, Traffic trafficDirection, Action action) {
        super(ipAddress, port, domain);
        this.trafficDirection = trafficDirection;
        this.action = action;
    }

    protected FwNetworkConfig(FwNetworkConfig fwNetworkConfig){
        super(fwNetworkConfig);
        this.trafficDirection = fwNetworkConfig.trafficDirection;
        this.action = fwNetworkConfig.action;
    }

    @Override
    public IPrototype clone() {
        return new FwNetworkConfig(this);
    }

    @Override
    public String toString(){
        return String.format("{IP: %s , PORT: %d , DOMAIN: %s , DIRECTION: %s , ACTION: %s}",
                this.ipAddress, this.port, this.domain, this.trafficDirection.toString(), this.action.toString());
    }

}

