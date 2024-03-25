package org.rcbg.afku;

public class MysqlDriver implements IDatabase{
    @Override
    public void sendQuery(String query) {
        System.out.println("[MySQL] Executing query: " + query);
    }
}
