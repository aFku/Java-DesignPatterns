package org.rcbg.afku;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class SecuredFileManagerProxy implements IFileManager{

    private FileManagerLib fileLib;
    private String passwordFile = "password.secret";
    private String secredPassword = "VeRySeCrEtPaSsWoRd";

    public SecuredFileManagerProxy(FileManagerLib fileLib){
        this.fileLib = fileLib;
    }

    private boolean checkPassword() throws IOException {
        return readPassword().equals(this.secredPassword);
    }

    private String readPassword() throws IOException {
        InputStream in = SecuredFileManagerProxy.class.getClassLoader().getResourceAsStream(this.passwordFile);
        return new String(in.readAllBytes(), StandardCharsets.UTF_8);
    }


    @Override
    public String readFileContent() throws IOException {
        if(checkPassword()){
            System.out.println("Access to file granted");
        } else {
            System.out.println("Access denied");
            return null;
        }

        String content = this.fileLib.readFileContent();

        System.out.println("File closed");
        return content;
    }
}
