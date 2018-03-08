package org.ivkua.lesson1.task3;

/* Написать класс «автомобиль», который должен
уметь заводится, глушить мотор, ехать и держать
необходимую скорость. */

public class Main {
    public static void main(String[] args) {
        Car toyotaCamry = new Car();
        toyotaCamry.startUp();
        toyotaCamry.keepSpeed(120);
        toyotaCamry.getSpeed();
        toyotaCamry.stop();
        toyotaCamry.keepSpeed(50);
        toyotaCamry.shutDown();
    }
}
