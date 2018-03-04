package org.ivkua.lesson5.task3;

import java.util.Scanner;

/* Написать программу, которая считает текстовый файл, заменит в нем все
   слова “Hello” на “1234” и запишет изменения в тот-же файл.*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter path of file: ");
        String path = scanner.nextLine();
        Replacer replacer = new Replacer("Hello", "1234");
        while (true) {
            try {
                replacer.replace(path);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
