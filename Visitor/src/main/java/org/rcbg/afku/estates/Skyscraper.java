package org.rcbg.afku.estates;

import org.rcbg.afku.EstateTaxCalculator;
import org.rcbg.afku.IVisitor;

public class Skyscraper extends Estate{
    public Skyscraper(double area, boolean antique) {
        super(area, antique);
    }

    @Override
    public void accept(IVisitor calculator){
        calculator.visit(this);
    }
}
