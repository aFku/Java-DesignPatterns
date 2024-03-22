package org.rcbg.afku;

import java.util.UUID;

public class Door implements IOpenable{

    private boolean isOpen = false;
    UUID uuid = UUID.randomUUID();

    @Override
    public void open() {
        if(!isOpen) {
           System.out.println(String.format("[DOOR %s] Opening doors", uuid.toString()));
           this.isOpen = true;
        } else {
            throw new RuntimeException("[DOOR %s] Already opened");
        }
    }

    @Override
    public void close() {
        if(isOpen) {
            System.out.println(String.format("[DOOR %s] Closing doors", uuid.toString()));
            this.isOpen = false;
        } else {
            throw new RuntimeException("[DOOR %s] Already closed");
        }
    }

    @Override
    public boolean isOpen() {
        return this.isOpen;
    }

    public String getUuid() {
        return uuid.toString();
    }
}
