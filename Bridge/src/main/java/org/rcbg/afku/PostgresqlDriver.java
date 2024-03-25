package org.rcbg.afku;

public class PostgresqlDriver implements IDatabase{
    @Override
    public void sendQuery(String query) {
        System.out.println("[PostgreSQL] Executing query: " + query);
    }
}
