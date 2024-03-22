package org.rcbg.afku;

public class HatchCreator extends AbstractPassManager{

    @Override
    public IOpenable createPass() {
        return new Hatch();
    }
}
