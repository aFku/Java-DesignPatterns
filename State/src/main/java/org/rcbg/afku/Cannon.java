package org.rcbg.afku;

import org.rcbg.afku.states.*;

public class Cannon {
    public BaseGunState cannonState;

    public Cannon(BaseGunState cannonState){
        this.cannonState = cannonState;
        this.cannonState.setContext(this);
    }

    public void changeState(BaseGunState cannonState){
        this.cannonState = cannonState;
        this.cannonState.setContext(this);
    }

    public boolean canShoot(){
        return this.cannonState.canShoot();
    }
    public void shoot(){
        this.cannonState.shoot();
    }
    public void reload(ChargeType chargeType){
        this.cannonState.reload(chargeType);
    }
    public ChargeType getChargeType(){
        return this.cannonState.getChargeType();
    }

    public void disableCannon(){
        Disabled disabled = new Disabled();
        this.changeState(disabled);
    }

    public void brakeCannon(){
        Broken broken = new Broken();
        this.changeState(broken);
    }

    public void enableCannon(){
        Unloaded unloaded = new Unloaded();
        this.changeState(unloaded);
    }
}
