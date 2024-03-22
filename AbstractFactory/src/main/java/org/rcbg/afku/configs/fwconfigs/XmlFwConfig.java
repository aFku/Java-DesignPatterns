package org.rcbg.afku.configs.fwconfigs;

import org.rcbg.afku.utils.Traffic;

public class XmlFwConfig extends AbstractFwConfig {

    public XmlFwConfig(String sourceAddress, String destinationAddress, int destinationPort, Traffic direction) {
        super(sourceAddress, destinationAddress, destinationPort, direction);
    }

    @Override
    public String getConfigAsString() {
        String template = "<?xml version='1.0'>\n" +
                "<config>\n" +
                "<source>%s</source>\n" +
                "<destination>%s</destination>\n" +
                "<port>%d</port>\n" +
                "<direction>%s</direction>\n" +
                "</config>";
        return String.format(template, this.sourceAddress, this.destinationAddress,
                this.destinationPort, this.direction.toString());
    }
}
