package org.ivkua.lesson6.task3;

public class Main {
    public static void main(String[] args) {
        IdPrinter[] idPrinters = new IdPrinter[100];
        for (int i = 0; i < idPrinters.length; i++) {
            IdPrinter idPrinter = new IdPrinter();
            idPrinters[i] = idPrinter;
            idPrinter.start();
        }

        for (IdPrinter idPrinter : idPrinters) {
            idPrinter.interrupt();
        }
        System.out.println("IdPrinters were interrupted");
    }
}
