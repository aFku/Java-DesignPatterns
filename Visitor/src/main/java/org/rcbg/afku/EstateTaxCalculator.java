package org.rcbg.afku;

import org.rcbg.afku.estates.Block;
import org.rcbg.afku.estates.House;
import org.rcbg.afku.estates.Skyscraper;

public class EstateTaxCalculator implements IVisitor{

    @Override
    public void visit(House house){
        double tax = house.getArea() * 10;
        if(house.isAntique()){
            tax = tax / 2;
        }
        System.out.println(String.format("Tax for House (%f, %b): " + tax, house.getArea(), house.isAntique()));
    }

    @Override
    public void visit(Block block){
        double tax = block.getArea() * 100;
        if(block.isAntique()){
            tax = tax / 2;
        }
        System.out.println(String.format("Tax for Block of flats (%f, %b): " + tax, block.getArea(), block.isAntique()));
    }

    @Override
    public void visit(Skyscraper skyscraper){
        double tax = skyscraper.getArea() * 1000;
        System.out.println(String.format("Tax for Skyscraper (%f, %b): " + tax, skyscraper.getArea(), skyscraper.isAntique()));
    }
}
