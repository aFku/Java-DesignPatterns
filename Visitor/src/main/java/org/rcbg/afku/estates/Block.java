package org.rcbg.afku.estates;

import org.rcbg.afku.EstateTaxCalculator;
import org.rcbg.afku.IVisitor;

public class Block extends Estate{
    public Block(double area, boolean antique) {
        super(area, antique);
    }

    @Override
    public void accept(IVisitor calculator){
        calculator.visit(this);
    }
}
