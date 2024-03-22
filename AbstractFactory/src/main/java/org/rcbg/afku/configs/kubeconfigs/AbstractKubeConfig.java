package org.rcbg.afku.configs.kubeconfigs;

public abstract class AbstractKubeConfig {

    protected String namespace;
    protected String apiServerIp;
    protected String userCertPath;
    protected String context;

    public AbstractKubeConfig(String namespace, String apiServerIp, String userCertPath, String context) {
        this.namespace = namespace;
        this.apiServerIp = apiServerIp;
        this.userCertPath = userCertPath;
        this.context = context;
    }

    public abstract String getConfigAsString();
}
