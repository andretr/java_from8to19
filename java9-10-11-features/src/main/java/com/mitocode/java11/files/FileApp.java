package com.mitocode.java11.files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileApp {

    private void m1(){
        Path filePath = Paths.get("D:/", "test", "test.txt");

        try {
            Files.writeString(filePath, "Hello Coders", StandardOpenOption.APPEND);

            String content = Files.readString(filePath);

            System.out.println(content);
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        FileApp app = new FileApp();
        app.m1();
    }
}
