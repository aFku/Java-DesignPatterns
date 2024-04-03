package org.rcbg.afku;

import org.rcbg.afku.estates.Block;
import org.rcbg.afku.estates.Estate;
import org.rcbg.afku.estates.House;
import org.rcbg.afku.estates.Skyscraper;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Estate> estates = new ArrayList<>();
        estates.add(new House(100, false));
        estates.add(new House(50, true));
        estates.add(new Block(123, true));
        estates.add(new Block(300, false));
        estates.add(new Skyscraper(1000, true));
        estates.add(new Skyscraper(1010, false));

        IVisitor calculator = new EstateTaxCalculator();

        for(Estate estate: estates){
            estate.accept(calculator);
        }
    }
}