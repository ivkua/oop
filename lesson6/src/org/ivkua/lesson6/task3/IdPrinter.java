package org.ivkua.lesson6.task3;

public class IdPrinter extends Thread{
    private final int id;

    public IdPrinter(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Thread " + id + " is started");
        while (!isInterrupted()){
            yield();
        }
        System.out.println("Thread " + id + " is stopped");
    }


}
