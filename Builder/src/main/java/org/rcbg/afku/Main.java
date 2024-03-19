package org.rcbg.afku;

public class Main {
    public static void main(String[] args) {
        // Create House builder
        HouseBuilder houseBuilder = new HouseBuilder();

        // Get normal house with steps prepared in Director
        HouseDirector.makeNormalHouse(houseBuilder);
        House normalHouse = houseBuilder.getProduct();

        // Get modern house with steps prepared in Director
        HouseDirector.makeModernHouse(houseBuilder);
        House modernHouse = houseBuilder.getProduct();

        // Create brochure builder
        HouseBrochureBuilder houseBrochureBuilder = new HouseBrochureBuilder();

        // Get brochure for normal house
        HouseDirector.makeNormalHouse(houseBrochureBuilder);
        HouseBrochure normalBrochure = houseBrochureBuilder.getProduct();

        // Get brochure for modern house
        HouseDirector.makeModernHouse(houseBrochureBuilder);
        HouseBrochure modernBrochure = houseBrochureBuilder.getProduct();

        // Test
        System.out.println("Normal Type:");
        System.out.println("House Spec: " + normalHouse.getHouseSpecification());
        System.out.println("Brochure: " + normalBrochure.getBrochure());

        System.out.println("\n\n");

        System.out.println("Modern Type:");
        System.out.println("House Spec: " + modernHouse.getHouseSpecification());
        System.out.println("Brochure: " + modernBrochure.getBrochure());

    }
}