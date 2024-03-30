package org.rcbg.afku.washer.handlers;

import org.rcbg.afku.vehicles.Vehicle;

public abstract class BaseHandler implements Handler{
    private Handler nextHandler;

    public void setNext(Handler handler){
        this.nextHandler = handler;
    }

    @Override
    public void handle(Vehicle vehicle) {
        if(nextHandler != null){
            nextHandler.handle(vehicle);
        }
    }
}
