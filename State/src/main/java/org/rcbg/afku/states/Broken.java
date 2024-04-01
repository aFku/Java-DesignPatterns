package org.rcbg.afku.states;

import org.rcbg.afku.ChargeType;

public class Broken extends BaseGunState{

    @Override
    public boolean canShoot() {
        return false;
    }

    @Override
    public void shoot() {
        System.out.println("[Broken] Cannot shoot while broken");
    }

    @Override
    public void reload(ChargeType chargeType) {
        System.out.println("[Broken] Cannot reload while broken");
    }

    @Override
    public ChargeType getChargeType() {
        return ChargeType.NONE;
    }
}
