package org.rcbg.afku;

import org.rcbg.afku.states.Unloaded;

public class Main {
    public static void main(String[] args) {
        // Initialize cannon
        Cannon cannon = new Cannon(new Unloaded());

        // Check how behave unloaded cannon;
        System.out.println("[UNLOADED] Can shoot: " + cannon.canShoot());
        System.out.println("[UNLOADED] Charge: " + cannon.getChargeType().name());
        cannon.shoot();
        cannon.reload(ChargeType.LASER);

        // After reload state changed to Loaded
        System.out.println("[LOADED] Can shoot: " + cannon.canShoot());
        System.out.println("[LOADED] Charge: " + cannon.getChargeType().name());
        cannon.reload(ChargeType.LASER);
        cannon.reload(ChargeType.PROJECTILE);
        cannon.shoot();
        System.out.println("[UNLOADED] Can shoot: " + cannon.canShoot());

        // After shooting state changed to Unloaded. Check how it works while disabled
        cannon.disableCannon();
        System.out.println("[DISABLED] Can shoot: " + cannon.canShoot());
        System.out.println("[DISABLED] Charge: " + cannon.getChargeType().name());
        cannon.reload(ChargeType.EM);
        cannon.shoot();

        // Check how works while broken
        cannon.brakeCannon();
        System.out.println("[BROKEN] Can shoot: " + cannon.canShoot());
        System.out.println("[BROKEN] Charge: " + cannon.getChargeType().name());
        cannon.reload(ChargeType.PLASMA);
        cannon.shoot();
    }
}