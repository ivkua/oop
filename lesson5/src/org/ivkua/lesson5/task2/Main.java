package org.ivkua.lesson5.task2;

import java.util.Scanner;

/* 2. Написать рекурсивную ф-ю для вывода на экран всех файлов и каталогов, имя которых
длиннее 5 символов и вторая буква равна ‘A’. */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter path of directory to search: ");
        String path = scanner.nextLine();

        FileSearcher fileSearcher = new FileSearcher(new FilterMore5());
        while (true) {
            try {
                fileSearcher.search(path);
            } catch (IllegalArgumentException e) {
                System.out.println("Sorry, wrong " + e.getMessage());
                continue;
            }
            break;
        }
    }
}
