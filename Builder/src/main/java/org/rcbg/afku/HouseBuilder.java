package org.rcbg.afku;

public class HouseBuilder implements IHouseFamilyBuilder {

    private House house;

    public HouseBuilder(){
        this.reset();
    }

    @Override
    public IHouseFamilyBuilder withWalls(String walls) {
        this.house.setWalls(walls);
        return this;
    }

    @Override
    public IHouseFamilyBuilder withRoof(String roof) {
        this.house.setRoof(roof);
        return this;
    }

    @Override
    public IHouseFamilyBuilder withSwimmingPool(String swimmingPool) {
        this.house.setSwimmingPool(swimmingPool);
        return this;
    }

    @Override
    public IHouseFamilyBuilder withGarden(String garden) {
        this.house.setGarden(garden);
        return this;
    }

    public House getProduct(){
        return this.house;
    }

    @Override
    public void reset() {
        this.house = new House();
    }
}
