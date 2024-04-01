package org.rcbg.afku.states;

import org.rcbg.afku.Cannon;
import org.rcbg.afku.ChargeType;

public class Loaded extends BaseGunState{

    private final ChargeType chargeType;

    public Loaded(ChargeType chargeType){
        this.chargeType = chargeType;
    }

    @Override
    public boolean canShoot() {
        return true;
    }

    @Override
    public void shoot() {
        System.out.println("[LOADED] Shooting Charge: " + this.chargeType.name());
        context.changeState(new Unloaded());
    }

    @Override
    public void reload(ChargeType chargeType) {
        if(chargeType.equals(this.chargeType)){
            System.out.println("[LOADED] Reload cannot be done. The same charge type");
        } else {
            System.out.println("[LOADED] Removing current charge: " + this.chargeType);
            System.out.println("[LOADED] Loading new charge: " + chargeType);
            context.changeState(new Loaded(chargeType));
        }
    }

    @Override
    public ChargeType getChargeType() {
        return this.chargeType;
    }
}
