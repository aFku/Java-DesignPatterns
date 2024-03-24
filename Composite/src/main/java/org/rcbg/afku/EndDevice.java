package org.rcbg.afku;

public class EndDevice extends Device{

    public EndDevice(String name) {
        super(name);
    }

    @Override
    public int countConnected() {
        return 0;
    }

    @Override
    public String gatherUUID(){
        return this.deviceUUID;
    }
}
