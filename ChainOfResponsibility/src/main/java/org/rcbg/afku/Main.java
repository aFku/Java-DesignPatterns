package org.rcbg.afku;

import org.rcbg.afku.vehicles.Vehicle;
import org.rcbg.afku.vehicles.VehicleType;
import org.rcbg.afku.washer.AutomaticCarWasher;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle(VehicleType.BIKE, false, false);
        Vehicle vehicle2 = new Vehicle(VehicleType.CAR, false, true);
        Vehicle vehicle3 = new Vehicle(VehicleType.TRUCK, true, false);
        Vehicle vehicle4 = new Vehicle(VehicleType.CAR, true, true);

        AutomaticCarWasher washer = new AutomaticCarWasher();

        washer.washVehicle(vehicle1);
        System.out.println("\n");
        washer.washVehicle(vehicle2);
        System.out.println("\n");
        washer.washVehicle(vehicle3);
        System.out.println("\n");
        washer.washVehicle(vehicle4);
        System.out.println("\n");
    }
}