package org.rcbg.afku.states;

import org.rcbg.afku.Cannon;
import org.rcbg.afku.ChargeType;

public class Unloaded extends BaseGunState{

    @Override
    public boolean canShoot() {
        return false;
    }

    @Override
    public void shoot() {
        System.out.println("[UNLOADED] Cannot shoot when empty");
    }

    @Override
    public void reload(ChargeType chargeType) {
        System.out.println("[UNLOADED] Loading new charge: " + chargeType);
        context.changeState(new Loaded(chargeType));
    }

    @Override
    public ChargeType getChargeType() {
        return ChargeType.NONE;
    }
}
