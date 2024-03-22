package org.rcbg.afku.configs.fwconfigs;

import org.rcbg.afku.utils.Traffic;

public class YamlFwConfig extends AbstractFwConfig {

    public YamlFwConfig(String sourceAddress, String destinationAddress, int destinationPort, Traffic direction) {
        super(sourceAddress, destinationAddress, destinationPort, direction);
    }

    @Override
    public String getConfigAsString() {
        String template = "source: %s\ndestination: %s\nport: %d\ndirection: %s";
        return String.format(template, this.sourceAddress, this.destinationAddress,
                this.destinationPort, this.direction.toString());
    }
}
