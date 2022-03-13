package com.company;

import java.io.FileInputStream;
import java.io.IOException;

public class Main1 {

    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("src/com/company/file1")){
            int text;
            while ((text = inputStream.read()) != -1){
                System.out.print((char)text);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
