package org.rcbg.afku;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        IFileManager fileManager;

        // You can read file content directly from service
        fileManager = new FileManagerLib();
        System.out.println("[NO PROXY]");
        System.out.println("File content: " + fileManager.readFileContent());

        System.out.println("\n\n");

        // But you can create Proxy that will control access to it
        fileManager = new SecuredFileManagerProxy(new FileManagerLib());
        System.out.println("[PROXY]");
        System.out.println("File content: " + fileManager.readFileContent());
    }
}