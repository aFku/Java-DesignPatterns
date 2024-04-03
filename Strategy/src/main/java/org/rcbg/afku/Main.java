package org.rcbg.afku;


import org.rcbg.afku.strategies.DifferentialEquationMethod;
import org.rcbg.afku.strategies.LaplaceMethod;

public class Main {
    public static void main(String[] args) {
        // We have a program to resolve issue with undetermined state in electrical circuits
        // Let's prepare circuit scheme

        String circuit = "< Very complicated LRC circuit with 2 constant voltage sources >";

        // Create our resolver
        CircuitResolver resolver = new CircuitResolver();

        // Use differential method
        resolver.setStrategy(new DifferentialEquationMethod());
        System.out.println("Using Differential method to resolve problem!");
        resolver.resolveCircuit(circuit);

        System.out.println();

        // Now use Laplace method
        resolver.setStrategy(new LaplaceMethod());
        System.out.println("Using Laplace method to resolve problem!");
        resolver.resolveCircuit(circuit);
    }
}