package org.rcbg.afku;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<VirtualMachine.VmSnapshot> snapshotsHistory = new ArrayList<>();

        VirtualMachine virtualMachine = new VirtualMachine("Magical VM", 4, 2048, 150, false);
        System.out.println(virtualMachine);

        // Save first state
        snapshotsHistory.add(virtualMachine.createSnapshot("Start vm"));

        // Change something and save next state
        virtualMachine.setVCpu(8);
        virtualMachine.setNetworkConnection(true);
        snapshotsHistory.add(virtualMachine.createSnapshot("Internet enabled"));

        // Change something and save next state
        virtualMachine.addRootContent("/mnt");
        virtualMachine.addRootContent("/opt");
        snapshotsHistory.add(virtualMachine.createSnapshot("Mount points"));

        // Brake machine
        virtualMachine.setVCpu(0);
        virtualMachine.setMemory(0);
        virtualMachine.removeRootContent("/etc");
        System.out.println("\nEnding state - machine broken");
        System.out.println(virtualMachine);

        // Restore all snapshots
        Collections.reverse(snapshotsHistory);
        for(VirtualMachine.VmSnapshot snapshot : snapshotsHistory){
            virtualMachine.restoreSnapshot(snapshot);
            System.out.println(virtualMachine);
        }
    }
}