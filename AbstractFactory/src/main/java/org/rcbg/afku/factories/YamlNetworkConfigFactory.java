package org.rcbg.afku.factories;

import org.rcbg.afku.configs.fwconfigs.AbstractFwConfig;
import org.rcbg.afku.configs.fwconfigs.YamlFwConfig;
import org.rcbg.afku.configs.kubeconfigs.AbstractKubeConfig;
import org.rcbg.afku.configs.kubeconfigs.YamlKubeConfig;
import org.rcbg.afku.utils.Traffic;

public class YamlNetworkConfigFactory implements INetworkConfigFactory{
    @Override
    public AbstractFwConfig getFwConfig() {
        return new YamlFwConfig("192.168.1.123", "127.0.0.1", 443, Traffic.INBOUND);
    }

    @Override
    public AbstractKubeConfig getKubeConfig() {
        return new YamlKubeConfig("default", "192.168.43.252", "/etc/kube/certs/admin.cert", "minikube");
    }
}
