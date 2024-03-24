package org.rcbg.afku;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Prepare end devices
        EndDevice pc1 = new EndDevice("pc1");
        EndDevice pc2 = new EndDevice("pc2");
        EndDevice pc3 = new EndDevice("pc3");
        EndDevice pc4 = new EndDevice("pc4");

        // Prepare routers
        Router mainRouter = new Router("mainRouter");
        Router secondLayerRouter = new Router("secondLayerRouter");
        Router thirdLayerRouter1 = new Router("thirdLayerRouter1");
        Router thirdLayerRouter2 = new Router("thirdLayerRouter2");

        // Assembly network
        thirdLayerRouter1.addDevice(pc1);
        thirdLayerRouter1.addDevice(pc2);

        thirdLayerRouter2.addDevice(pc3);

        secondLayerRouter.addDevice(thirdLayerRouter1);
        secondLayerRouter.addDevice(thirdLayerRouter2);
        secondLayerRouter.addDevice(pc4);

        mainRouter.addDevice(secondLayerRouter);

        System.out.println("\n\n");

        System.out.println("UUID of devices in mainRouter's network: ");
        for(String uuid : mainRouter.gatherUUID().split(";;")){
            System.out.println(uuid);
        }
        System.out.println(String.format("Number of devices connected to mainRouter: %d", mainRouter.countConnected()));
    }
}