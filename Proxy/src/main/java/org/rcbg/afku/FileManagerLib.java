package org.rcbg.afku;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class FileManagerLib implements IFileManager{

    private final String fileName = "example.txt";

    @Override
    public String readFileContent() throws IOException {
        InputStream in = FileManagerLib.class.getClassLoader().getResourceAsStream(this.fileName);
        return new String(in.readAllBytes(), StandardCharsets.UTF_8);
    }
}
