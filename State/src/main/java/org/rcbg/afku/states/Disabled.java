package org.rcbg.afku.states;

import org.rcbg.afku.Cannon;
import org.rcbg.afku.ChargeType;

public class Disabled extends BaseGunState{

    @Override
    public boolean canShoot() {
        return false;
    }

    @Override
    public void shoot() {
        System.out.println("[DISABLED] Cannot shoot while disabled");
    }

    @Override
    public void reload(ChargeType chargeType) {
        System.out.println("[DISABLED] Cannot reload while disabled");
    }

    @Override
    public ChargeType getChargeType() {
        return ChargeType.NONE;
    }
}
