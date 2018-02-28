package org.ivkua.lesson6.task4;

import org.ivkua.lesson6.task3.IdPrinter;

public class Make50Threads extends Thread{
    @Override
    public void run() {
        IdPrinter[] idPrinters = new IdPrinter[50];
        for (int i = 0; i < idPrinters.length; i++) {
            IdPrinter idPrinter = new IdPrinter();
            idPrinters[i] = idPrinter;
            idPrinter.start();
        }

        for (IdPrinter idPrinter : idPrinters) {
            idPrinter.interrupt();
        }
        System.out.println("All threads of " + getId() + " thread is interrupted.");
    }
}
