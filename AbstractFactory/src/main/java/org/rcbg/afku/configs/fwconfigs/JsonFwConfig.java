package org.rcbg.afku.configs.fwconfigs;

import org.rcbg.afku.utils.Traffic;

public class JsonFwConfig extends AbstractFwConfig {

    public JsonFwConfig(String sourceAddress, String destinationAddress, int destinationPort, Traffic direction) {
        super(sourceAddress, destinationAddress, destinationPort, direction);
    }

    @Override
    public String getConfigAsString() {
        String template = "{'source': %s, 'destination': %s, 'port': %d, 'direction': %s}";
        return String.format(template, this.sourceAddress, this.destinationAddress,
                this.destinationPort, this.direction.toString());
    }
}
