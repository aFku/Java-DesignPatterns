package org.rcbg.afku;

import java.util.Random;

public abstract class BaseCodeValidator {

    private String code;

    public void loadCode(String code){
        this.code = code;
    }

    public boolean isCode(){
        if(this.code != null){
            System.out.println("Content is a code");
            return true;
        } else {
            System.out.println("Content is not a code");
            return false;
        }
    }

    public abstract void formatCode();

    public abstract void checkSyntax();

    public int rateCleanCode(){
        return new Random().nextInt(1, 10);
    }

    public void validate(){
        if(this.isCode()){
            this.formatCode();
            this.checkSyntax();
            int rate = this.rateCleanCode();
            System.out.println("Code validated. Rate: " + rate);
        }
        System.out.println("Done!");
    }
}
