package org.rcbg.afku;

public class MyReadWriteORM extends MyReadORM{
    public MyReadWriteORM(IDatabase driver) {
        super(driver);
    }

    public void writeObject(String object){
        this.driver.sendQuery("<Query for saving object '" + object + "'>");
    }
}
