package org.ivkua.lesson6.task3;

public class IdPrinter extends Thread{

    @Override
    public void run() {
        System.out.println("Thread " + getId() + " is started");
        while (!isInterrupted()){
            yield();
        }
        System.out.println("Thread " + getId() + " is stopped");
    }


}
