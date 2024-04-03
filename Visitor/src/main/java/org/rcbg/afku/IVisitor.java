package org.rcbg.afku;

import org.rcbg.afku.estates.Block;
import org.rcbg.afku.estates.House;
import org.rcbg.afku.estates.Skyscraper;

public interface IVisitor {
    public void visit(Skyscraper skyscraper);
    public void visit(House house);
    public void visit(Block block);
}
