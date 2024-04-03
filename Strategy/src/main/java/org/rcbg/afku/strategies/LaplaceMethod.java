package org.rcbg.afku.strategies;

public class LaplaceMethod implements ICircuitResolvingStrategy {

    @Override
    public String resolve(String circuitSchema) {
        System.out.println("Analyzing Circuit: " + circuitSchema);
        System.out.println("Convertering circuit to frequency domain");
        System.out.println("Calculating impulse response");
        System.out.println("Convertering back to time domain");
        System.out.println("Done!");
        return "[Resolved circuit with Laplace method: " + circuitSchema + "]";
    }
}
