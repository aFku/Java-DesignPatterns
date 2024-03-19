package org.rcbg.afku;

public class HouseDirector {

    public static void makeModernHouse(IHouseFamilyBuilder builder){
        builder.reset();
        builder.withWalls("3");
        builder.withRoof("Leaking material");
        builder.withGarden("completely dead");
        builder.withSwimmingPool("Huge");
    }

    public static void makeNormalHouse(IHouseFamilyBuilder builder){
        builder.reset();
        builder.withWalls("4");
        builder.withRoof("tiles");
        builder.withGarden("very nice");
        builder.withSwimmingPool("normal size");
    }
}
