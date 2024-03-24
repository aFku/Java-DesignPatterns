package org.rcbg.afku;

import java.util.UUID;

public abstract class Device {

    protected String deviceUUID;

    public Device(String name){
        this.deviceUUID = UUID.randomUUID().toString();
        System.out.println(String.format("Device: %s - created with UUID: %s", name, deviceUUID));
    }

    public abstract int countConnected();
    public abstract String gatherUUID();
}
