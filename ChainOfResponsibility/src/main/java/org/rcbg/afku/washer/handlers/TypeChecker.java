package org.rcbg.afku.washer.handlers;

import org.rcbg.afku.vehicles.Vehicle;
import org.rcbg.afku.vehicles.VehicleType;

public class TypeChecker extends BaseHandler{

    @Override
    public void handle(Vehicle vehicle){
        System.out.println(String.format("[Vehicle: %s] Type checking...", vehicle.getUuid()));
        if(vehicle.getType() == VehicleType.BIKE){
            System.out.println(String.format("[Vehicle: %s] This vehicle type is not allowed to use washer. Aborting...", vehicle.getUuid()));
            return;
        } else {
            System.out.println(String.format("[Vehicle: %s] This vehicle type is allowed to use washer. Continuing...", vehicle.getUuid()));
            super.handle(vehicle);
        }
    }
}
