package org.rcbg.afku;


import org.rcbg.afku.configs.fwconfigs.AbstractFwConfig;
import org.rcbg.afku.configs.kubeconfigs.AbstractKubeConfig;
import org.rcbg.afku.factories.INetworkConfigFactory;
import org.rcbg.afku.factories.JsonNetworkConfigFactory;
import org.rcbg.afku.factories.XmlNetworkConfigFactory;
import org.rcbg.afku.factories.YamlNetworkConfigFactory;

public class Main {
    public static void main(String[] args) {
        // Test clientCode with JSON
        clientCode(new JsonNetworkConfigFactory(), "JSON");

        // Test clientCode with YAML
        clientCode(new YamlNetworkConfigFactory(), "YAML");

        // Test clientCode with XML
        clientCode(new XmlNetworkConfigFactory(), "XML");
    }

    public static void clientCode(INetworkConfigFactory configFactory, String fileType){
        System.out.println(String.format("**********[%s]**********", fileType));
        AbstractKubeConfig kubeConfig = configFactory.getKubeConfig();
        AbstractFwConfig fwConfig = configFactory.getFwConfig();
        System.out.println("[KUBECONFIG]");
        System.out.println(kubeConfig.getConfigAsString());
        System.out.println("[FWCONFIG]");
        System.out.println(fwConfig.getConfigAsString());
        System.out.println("\n\n\n");
    }
}