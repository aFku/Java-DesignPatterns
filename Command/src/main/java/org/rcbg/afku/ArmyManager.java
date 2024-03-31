package org.rcbg.afku;

public class ArmyManager {

    public void armyAttack(String peace){
        System.out.println(String.format("Army is attacking with peace %s", peace));
    }

    public void armyRetreat(String distance){
        System.out.println(String.format("Army is retreating at distance %s", distance));
    }

    public void armyRegroup(String formation){
        System.out.println(String.format("Army is regrouping into formation %s", formation));
    }
}
