package org.rcbg.afku;

public class OracleDriver implements IDatabase{
    @Override
    public void sendQuery(String query) {
        System.out.println("[Oracle] Executing query: " + query);
    }
}
