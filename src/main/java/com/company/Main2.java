package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        try (FileOutputStream outputStream = new FileOutputStream("src/com/company/file2")){
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();

            outputStream.write(text.getBytes(StandardCharsets.UTF_8));

            System.out.println(("Gotowe"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
