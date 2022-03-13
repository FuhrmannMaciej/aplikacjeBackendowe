package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("src/com/company/file6"))){
            int i = 1;
            while (scanner.hasNextLine()) {
                System.out.println(i + ". " + scanner.nextLine());
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
