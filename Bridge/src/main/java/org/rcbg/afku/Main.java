package org.rcbg.afku;

public class Main {
    public static void main(String[] args) {
        // You can have ORM connection class for different kind of databases
        IDatabase[] drivers = new IDatabase[]{new MysqlDriver(), new PostgresqlDriver(), new OracleDriver()};
        for(IDatabase driver : drivers){
            MyReadORM ormRead = new MyReadORM(driver);
            ormRead.readObject();
        }

        // You can also have ORM with write feature for different databases
        for(IDatabase driver : drivers){
            MyReadWriteORM ormWrite = new MyReadWriteORM(driver);
            ormWrite.writeObject("Fancy object");
        }
    }
}