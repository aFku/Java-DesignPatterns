package org.rcbg.afku.configs.fwconfigs;

import org.rcbg.afku.utils.Traffic;

public abstract class AbstractFwConfig {
    protected String sourceAddress;
    protected String destinationAddress;
    protected int destinationPort;
    protected Traffic direction;

    public AbstractFwConfig(String sourceAddress, String destinationAddress, int destinationPort, Traffic direction) {
        this.sourceAddress = sourceAddress;
        this.destinationAddress = destinationAddress;
        this.destinationPort = destinationPort;
        this.direction = direction;
    }

    public abstract String getConfigAsString();
}
