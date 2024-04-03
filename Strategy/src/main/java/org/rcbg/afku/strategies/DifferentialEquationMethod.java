package org.rcbg.afku.strategies;

public class DifferentialEquationMethod implements ICircuitResolvingStrategy {
    @Override
    public String resolve(String circuitSchema) {
        System.out.println("Analyzing Circuit: " + circuitSchema);
        System.out.println("Calculating Differential...");
        System.out.println("Doing pretty advanced math...");
        System.out.println("Burning PCB...");
        System.out.println("Done!");
        return "[Resolved circuit with differential method: " + circuitSchema + "]";
    }
}
