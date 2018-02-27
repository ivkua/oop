package org.ivkua.lesson6.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock(10000);
        clock.start();

        Scanner scanner = new Scanner(System.in);

        while (true){
            String exit = scanner.nextLine();
            if (exit.equalsIgnoreCase("exit")){
                clock.interrupt();
                break;
            }
        }
    }
}
