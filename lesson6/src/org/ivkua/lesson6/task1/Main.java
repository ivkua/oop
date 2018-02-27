package org.ivkua.lesson6.task1;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(100, 200);
        counter.start();

        try {
            Thread.sleep(500);
            counter.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("Main thread have done");
    }
}
