package org.rcbg.afku.configs.kubeconfigs;

public class JsonKubeConfig extends AbstractKubeConfig {

    public JsonKubeConfig(String namespace, String apiServerIp, String userCertPath, String context) {
        super(namespace, apiServerIp, userCertPath, context);
    }

    @Override
    public String getConfigAsString() {
        String template = "{'namespace': %s, 'apiServerIp': %s, 'userCertPath': %s, 'context': %s}";
        return String.format(template, this.namespace, this.apiServerIp,
                this.userCertPath, this.context);
    }
}
