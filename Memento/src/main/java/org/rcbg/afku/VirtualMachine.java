package org.rcbg.afku;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class VirtualMachine {
    private String vmName;
    private int vCpu;
    private int memory; // MB
    private int storage; // GB
    private boolean networkConnection;
    private List<String> rootContent = new ArrayList<>();

    public VirtualMachine(String name, int vCpu, int memory, int storage, boolean networkConnection) {
        this.vmName = name;
        this.vCpu = vCpu;
        this.memory = memory;
        this.storage = storage;
        this.networkConnection = networkConnection;
        this.rootContent.add("/bin");
        this.rootContent.add("/var");
        this.rootContent.add("/etc");
    }

    public void setVmName(String vmName) {
        this.vmName = vmName;
    }

    public void setVCpu(int vCpu) {
        this.vCpu = vCpu;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setNetworkConnection(boolean networkConnection) {
        this.networkConnection = networkConnection;
    }


    public void addRootContent(String element) {
        this.rootContent.add(element);
    }

    public void removeRootContent(String element){
        this.rootContent.remove(element);
    }

    @Override
    public String toString(){
        String template = """
                [Virtual Machine State]
                Name: %s
                vCPU: %d
                RAM: %d
                Storage: %d
                Network connection: %b
                Root content: %s
                """;
        return String.format(template, this.vmName, this.vCpu, this.memory, this.storage, this.networkConnection, this.rootContent.toString());
    }

    // Memento methods
    public VmSnapshot createSnapshot(String name){
        System.out.println(String.format("Creating snapshot for VM: %s with name: %s", this.vmName, name));
        return new VmSnapshot(name);
    }

    public void restoreSnapshot(VmSnapshot snapshot){
        System.out.println(String.format("Restoring VM: %s with snapshot: %s", this.vmName, snapshot.getName()));
        this.vmName = snapshot.vmName;
        this.vCpu = snapshot.vCpu;
        this.memory = snapshot.memory;
        this.storage = snapshot.storage;
        this.networkConnection = snapshot.networkConnection;
        this.rootContent = snapshot.rootContent;
    }

    // Memento class
    public class VmSnapshot {
        private final String vmName;
        private final int vCpu;
        private final int memory;
        private final int storage;
        private final boolean networkConnection;
        private final List<String> rootContent = new ArrayList<>();
        private final Instant creationDate;
        private final String snapshotName;

        public VmSnapshot(String name){
            this.vmName = VirtualMachine.this.vmName;
            this.vCpu = VirtualMachine.this.vCpu;
            this.memory = VirtualMachine.this.memory;
            this.storage = VirtualMachine.this.storage;
            this.networkConnection = VirtualMachine.this.networkConnection;
            this.rootContent.addAll(VirtualMachine.this.rootContent);

            this.creationDate = Instant.now();
            this.snapshotName = name;
        }

        public Instant getCreationDate(){
            return this.creationDate;
        }

        public String getName(){
            return this.snapshotName;
        }
    }

}
