package org.rcbg.afku.washer.handlers;

import org.rcbg.afku.vehicles.Vehicle;

public interface Handler {
    public void setNext(Handler handler);
    public void handle(Vehicle vehicle);
}
