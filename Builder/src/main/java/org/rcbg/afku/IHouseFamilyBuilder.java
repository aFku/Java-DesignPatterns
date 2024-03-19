package org.rcbg.afku;

public interface IHouseFamilyBuilder {
    public IHouseFamilyBuilder withWalls(String walls);
    public IHouseFamilyBuilder withRoof(String roof);
    public IHouseFamilyBuilder withSwimmingPool(String swimmingPool);
    public IHouseFamilyBuilder withGarden(String garden);
    public void reset();
}
