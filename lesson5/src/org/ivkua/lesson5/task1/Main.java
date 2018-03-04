package org.ivkua.lesson5.task1;

import java.io.File;
import java.util.Scanner;

/*1. Модифицировать проект FindFiles так, чтобы программа искала в каталоге
все файлы с расширениями из списка.*/

public class Main {
    public static void main(String[] args) {
        String[] extensions = new String[]{"txt", "iml", "docx", "jpg", "pdf"};
        ExtensionFilter extensionFilter = new ExtensionFilter(extensions);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter path: ");
            String path = scanner.nextLine();
            File file = new File(path);
            if (!file.exists()){
                System.out.println("Wrong path");
                continue;
            }
            if (!file.isDirectory()){
                System.out.println("Directory required");
                continue;
            }

            String[] list = file.list(extensionFilter);
            for (String s : list) {
                System.out.println(s);
            }
            break;
        }
    }
}
