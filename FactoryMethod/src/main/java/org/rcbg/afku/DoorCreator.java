package org.rcbg.afku;

public class DoorCreator extends AbstractPassManager{

    @Override
    public IOpenable createPass() {
        return new Door();
    }
}
