package org.rcbg.afku;

public class JavaCodeValidator extends BaseCodeValidator{
    @Override
    public void formatCode() {
        System.out.println("Formatting Java code");
    }

    @Override
    public void checkSyntax() {
        System.out.println("Checking syntax for Java code");
    }
}
