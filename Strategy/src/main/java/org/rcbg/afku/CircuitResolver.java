package org.rcbg.afku;

import org.rcbg.afku.strategies.ICircuitResolvingStrategy;

public class CircuitResolver {

    ICircuitResolvingStrategy strategy;

    public void setStrategy(ICircuitResolvingStrategy strategy) {
        this.strategy = strategy;
    }

    public void resolveCircuit(String circuit){
        String result = strategy.resolve(circuit);
        System.out.println("Result of resolving: " + result);
    }
}
