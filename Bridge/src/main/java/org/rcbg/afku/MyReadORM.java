package org.rcbg.afku;

public class MyReadORM {

    protected IDatabase driver;

    public MyReadORM(IDatabase driver){
        this.driver = driver;
    }

    public void readObject(){
        driver.sendQuery("<Query for reading ORM Object>");
    }
}
