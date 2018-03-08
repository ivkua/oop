package org.ivkua.lesson1.task2;

/* Написать класс, который умеет считать
количество созданных объектов этого класса
(static). */

public class Main {
    public static void main(String[] args) {
        new Cat(3, "Kally");
        new Cat(3, "Kally");
        new Cat(2, "Nick");
        if ( Cat.getCounter() == 0) {
            System.out.println("There are no cats");
        } else if (Cat.getCounter() == 1) {
            System.out.println("There is 1 cat");
        } else {
            System.out.println("There are " + Cat.getCounter() + " cats");
        }
    }
}
