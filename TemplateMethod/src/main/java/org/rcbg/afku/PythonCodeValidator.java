package org.rcbg.afku;

public class PythonCodeValidator extends BaseCodeValidator{
    @Override
    public void formatCode() {
        System.out.println("Formatting Python code");
    }

    @Override
    public void checkSyntax() {
        System.out.println("Checking syntax for Python code");
    }
}
