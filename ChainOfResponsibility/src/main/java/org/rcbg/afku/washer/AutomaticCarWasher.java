package org.rcbg.afku.washer;

import org.rcbg.afku.vehicles.Vehicle;
import org.rcbg.afku.washer.handlers.Handler;
import org.rcbg.afku.washer.handlers.TypeChecker;
import org.rcbg.afku.washer.handlers.WheelsWashService;
import org.rcbg.afku.washer.handlers.WindowWashService;

public class AutomaticCarWasher {

    public void washVehicle(Vehicle vehicle){
        Handler entryHandler = new TypeChecker();
        Handler windowHandler = new WindowWashService();
        Handler wheelsHandler = new WheelsWashService();

        windowHandler.setNext(wheelsHandler);
        entryHandler.setNext(windowHandler);

        entryHandler.handle(vehicle);
    }
}
