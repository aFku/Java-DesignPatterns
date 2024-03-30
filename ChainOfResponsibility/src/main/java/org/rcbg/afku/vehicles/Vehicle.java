package org.rcbg.afku.vehicles;

import java.util.UUID;

public class Vehicle {

    private final VehicleType type;
    private boolean dirtyWheels;
    private boolean dirtyWindows;
    private String uuid;

    public Vehicle(VehicleType type, boolean dirtyWheels, boolean dirtyWindows){
        this.type = type;
        this.dirtyWheels = dirtyWheels;
        this.dirtyWindows = dirtyWindows;
        this.uuid = UUID.randomUUID().toString();
    }

    public VehicleType getType() {
        return type;
    }

    public boolean hasDirtyWheels() {
        return dirtyWheels;
    }

    public boolean hasDirtyWindows() {
        return dirtyWindows;
    }

    public String getUuid(){
        return this.uuid;
    }
}
