package org.rcbg.afku.verifylib;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConfigVerifyLib {

    public boolean verifyConfig(ConfigObj config){
        return verifyIp(config.getSource()) && verifyIp(config.getDestination()) && verifyPort(config.getPort());
    }

    private boolean verifyIp(String address){
        Pattern pattern = Pattern.compile("^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$");
        Matcher matcher = pattern.matcher(address);
        return matcher.find();
    }

    private boolean verifyPort(int port){
        return port > 0 && port <= 65535;
    }
}
