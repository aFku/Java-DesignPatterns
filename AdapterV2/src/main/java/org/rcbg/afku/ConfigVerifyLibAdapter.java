package org.rcbg.afku;

import org.rcbg.afku.verifylib.ConfigObj;
import org.rcbg.afku.verifylib.ConfigVerifyLib;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConfigVerifyLibAdapter implements IVerifyConfig{

    private ConfigVerifyLib adaptee = new ConfigVerifyLib();

    @Override
    public boolean checkIfCorrect(String config) {
        return adaptee.verifyConfig(prepareConfigObject(config));
    }

    private ConfigObj prepareConfigObject(String config){
        String source = extractField("(<source>)((?:[0-9]{1,3}\\.){3}[0-9]{1,3})", config);
        String destination = extractField("(<destination>)((?:[0-9]{1,3}\\.){3}[0-9]{1,3})", config);
        String port = extractField("(<port>)([0-9]+)", config);
        return new ConfigObj(source, destination, Integer.parseInt(port));
    }

    private String extractField(String regex, String data){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data);
        return matcher.find() ? matcher.group(2) : null;
    }
}
