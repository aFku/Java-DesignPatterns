package org.rcbg.afku.washer.handlers;

import org.rcbg.afku.vehicles.Vehicle;
import org.rcbg.afku.vehicles.VehicleType;

public class WindowWashService extends BaseHandler{
    @Override
    public void handle(Vehicle vehicle){
        System.out.println(String.format("[Vehicle: %s] Checking if windows are dirty...", vehicle.getUuid()));
        if(vehicle.hasDirtyWindows()){
            System.out.println(String.format("[Vehicle: %s] Vehicle has dirty windows. Cleaning...", vehicle.getUuid()));
        } else {
            System.out.println(String.format("[Vehicle: %s] Vehicle has no dirt on windows. Skipping...", vehicle.getUuid()));
        }
        super.handle(vehicle);
    }
}
