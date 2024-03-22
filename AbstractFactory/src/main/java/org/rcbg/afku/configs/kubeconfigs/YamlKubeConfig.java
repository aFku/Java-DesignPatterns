package org.rcbg.afku.configs.kubeconfigs;

public class YamlKubeConfig extends AbstractKubeConfig {

    public YamlKubeConfig(String namespace, String apiServerIp, String userCertPath, String context) {
        super(namespace, apiServerIp, userCertPath, context);
    }

    @Override
    public String getConfigAsString() {
        String template = "namespace: %s\napiServerIp: %s\nuserCertPath: %s\ncontext: %s";
        return String.format(template, this.namespace, this.apiServerIp,
                this.userCertPath, this.context);
    }
}
