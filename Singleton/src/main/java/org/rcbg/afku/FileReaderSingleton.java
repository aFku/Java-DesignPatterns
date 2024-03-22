package org.rcbg.afku;


import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class FileReaderSingleton {

    private static volatile FileReaderSingleton instance;

    private String fileName;

    private FileReaderSingleton(String fileName){
        this.fileName = fileName;
    }

    public static FileReaderSingleton getInstance(String fileName){

        FileReaderSingleton instanceRef = instance;
        if(instanceRef != null){
            return instanceRef;
        }
        synchronized (FileReaderSingleton.class){
            if(instance == null){
                instance = new FileReaderSingleton(fileName);
            }
            return instance;
        }
    }

    private String getFileContent(){
        InputStream streamContent = FileReaderSingleton.class.getResourceAsStream(this.fileName);
        return new BufferedReader(new InputStreamReader(streamContent, StandardCharsets.UTF_8)).lines().collect(Collectors.joining("\n"));
    }

    public String getField(String field){
        String content = getFileContent();
        JSONObject obj = new JSONObject(content);
        return obj.getString(field);
    }

    //Only for testing and presentation purpose
    public static void clearInstance(){
        instance = null;
    }
}
