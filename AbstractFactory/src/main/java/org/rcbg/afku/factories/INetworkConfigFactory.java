package org.rcbg.afku.factories;

import org.rcbg.afku.configs.fwconfigs.AbstractFwConfig;
import org.rcbg.afku.configs.kubeconfigs.AbstractKubeConfig;

public interface INetworkConfigFactory {
    public AbstractFwConfig getFwConfig();
    public AbstractKubeConfig getKubeConfig();
}
