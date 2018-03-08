package org.ivkua.lesson1.task1;

/*Написать класс Circle (круг) по аналогии с
Rectangle и метод, который будет возвращать его
площадь.*/

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 6);
        Circle circle = new Circle(3);
        System.out.println("Rectangle's square " + rectangle.square());
        System.out.println("Cirle's square " + circle.square());
    }
}
