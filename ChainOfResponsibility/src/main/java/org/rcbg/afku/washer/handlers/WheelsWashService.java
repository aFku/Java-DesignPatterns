package org.rcbg.afku.washer.handlers;

import org.rcbg.afku.vehicles.Vehicle;

public class WheelsWashService extends BaseHandler{

    @Override
    public void handle(Vehicle vehicle){
        System.out.println(String.format("[Vehicle: %s] Checking if wheels are dirty...", vehicle.getUuid()));
        if(vehicle.hasDirtyWheels()){
            System.out.println(String.format("[Vehicle: %s] Vehicle has dirty wheels. Cleaning...", vehicle.getUuid()));
        } else {
            System.out.println(String.format("[Vehicle: %s] Vehicle has no dirt on wheels. Skipping...", vehicle.getUuid()));
        }
        super.handle(vehicle);
    }
}
