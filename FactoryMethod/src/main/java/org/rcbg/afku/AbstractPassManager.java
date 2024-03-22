package org.rcbg.afku;

public abstract class AbstractPassManager {

    public boolean checkIfOpened(IOpenable pass){
        return pass.isOpen();
    }

    public abstract IOpenable createPass();
}
