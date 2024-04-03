package org.rcbg.afku;


public class Main {
    public static void main(String[] args) {
        String pythonCode = "Working python code";
        String javaCode = "Working java code";
        String jsCode = "Working javascript code";

        BaseCodeValidator codeValidator;

        // Check python code
        codeValidator = new PythonCodeValidator();
        codeValidator.loadCode(pythonCode);
        codeValidator.validate();
        System.out.println();

        // Check java code
        codeValidator = new JavaCodeValidator();
        codeValidator.loadCode(javaCode);
        codeValidator.validate();
        System.out.println();

        // Check JS code
        codeValidator = new JavascriptCodeValidator();
        codeValidator.loadCode(jsCode);
        codeValidator.validate();
    }
}