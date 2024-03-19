package org.rcbg.afku;

public class HouseBrochureBuilder implements IHouseFamilyBuilder{

    private HouseBrochure houseBrochure;

    public HouseBrochureBuilder(){
        this.reset();
    }

    @Override
    public IHouseFamilyBuilder withWalls(String walls) {
        this.houseBrochure.setWalls(walls);
        return this;
    }

    @Override
    public IHouseFamilyBuilder withRoof(String roof) {
        this.houseBrochure.setRoof(roof);
        return this;
    }

    @Override
    public IHouseFamilyBuilder withSwimmingPool(String swimmingPool) {
        this.houseBrochure.setSwimmingPool(swimmingPool);
        return this;
    }

    @Override
    public IHouseFamilyBuilder withGarden(String garden) {
        this.houseBrochure.setGarden(garden);
        return this;
    }

    public HouseBrochure getProduct() {
        return this.houseBrochure;
    }

    @Override
    public void reset() {
        this.houseBrochure = new HouseBrochure();
    }
}
