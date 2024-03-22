package org.rcbg.afku;

public class Main {
    public static void main(String[] args) {

        IOpenable door = createPass(Place.WALL);
        testPass(door);

        IOpenable hatch = createPass(Place.CEILING);
        testPass(hatch);

    }

    private static IOpenable createPass(Place place){
        AbstractPassManager passManager;
        if(place == Place.WALL){
            passManager = new DoorCreator();
        } else if (place == Place.CEILING) {
            passManager = new HatchCreator();
        } else { throw new RuntimeException("BAD PLACE"); }

        IOpenable pass = passManager.createPass();
        System.out.println(String.format("[PASS: %s] PASS OPEN AFTER CREATION: %b", pass.getUuid(), passManager.checkIfOpened(pass)));
        return pass;
    }

    private static void testPass(IOpenable pass){
        pass.open();
        pass.close();
    }
}