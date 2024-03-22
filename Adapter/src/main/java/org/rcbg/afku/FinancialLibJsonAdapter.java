package org.rcbg.afku;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinancialLibJsonAdapter implements IFinancialLibJson{

    VeryUsefulFinancialLib adaptee = new VeryUsefulFinancialLib();


    private String extractValueFromPattern(String regex, String target){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(target);
        return matcher.find() ? matcher.group(2) : null;
    }

    @Override
    public String generateJsonFinancialReport() {
        String xmlReport = adaptee.generateXmlFinancialReport();
        String profit = extractValueFromPattern("(<profit>)([0-9]+)", xmlReport);
        String loss = extractValueFromPattern("(<loss>)([0-9]+)", xmlReport);
        String donates = extractValueFromPattern("(<donates>)([0-9]+)", xmlReport);
        return String.format("{'profit': %s, 'loss': %s, 'donates': %s}", profit, loss, donates);
    }
}
