package org.rcbg.afku.configs.kubeconfigs;

public class XmlKubeConfig extends AbstractKubeConfig {

    public XmlKubeConfig(String namespace, String apiServerIp, String userCertPath, String context) {
        super(namespace, apiServerIp, userCertPath, context);
    }

    @Override
    public String getConfigAsString() {
        String template = "<?xml version='1.0'>\n" +
                "<config>\n" +
                "<namespace>%s</namespace>\n" +
                "<apiServerIp>%s</apiServerIp>\n" +
                "<userCertPath>%s</userCertPath>\n" +
                "<context>%s</context>\n" +
                "</config>";
        return String.format(template, this.namespace, this.apiServerIp,
                this.userCertPath, this.context);
    }
}
