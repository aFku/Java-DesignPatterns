package org.rcbg.afku.states;

import org.rcbg.afku.Cannon;
import org.rcbg.afku.ChargeType;

public abstract class BaseGunState {

    protected Cannon context;

    public void setContext(Cannon cannon){
        this.context = cannon;
    }

    public abstract boolean canShoot();
    public abstract void shoot();
    public abstract void reload(ChargeType chargeType);
    public abstract ChargeType getChargeType();
}
