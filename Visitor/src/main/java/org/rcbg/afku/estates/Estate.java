package org.rcbg.afku.estates;

import org.rcbg.afku.EstateTaxCalculator;
import org.rcbg.afku.IVisitor;

public abstract class Estate {

    private final double area;
    private final boolean antique;

    public Estate(double area, boolean antique) {
        this.area = area;
        this.antique = antique;
    }

    public double getArea() {
        return area;
    }

    public boolean isAntique() {
        return antique;
    }

    public abstract void accept(IVisitor calculator);
}
