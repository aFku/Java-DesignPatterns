package org.rcbg.afku;

public class JavascriptCodeValidator extends BaseCodeValidator{
    @Override
    public void formatCode() {
        System.out.println("Formatting JS code");
    }

    @Override
    public void checkSyntax() {
        System.out.println("Checking syntax for JS code");
    }
}
