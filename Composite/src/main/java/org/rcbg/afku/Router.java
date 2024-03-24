package org.rcbg.afku;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Router extends Device{

    private List<Device> connected = new ArrayList<>();

    public Router(String name) {
        super(name);
    }

    public void addDevice(Device device){
        connected.add(device);
    }

    public void removeDevice(Device device){
        connected.remove(device);
    }

    @Override
    public String gatherUUID() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.deviceUUID);
        stringBuilder.append(";;");
        for(Device device: connected){
            stringBuilder.append(device.gatherUUID());
            stringBuilder.append(";;");
        }
        return stringBuilder.toString();
    }

    @Override
    public int countConnected(){
        int numberOfConnections = 0;
        for(Device device: connected){
            numberOfConnections += device.countConnected() + 1;
        }
        return numberOfConnections;
    }
}
