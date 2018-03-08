package org.ivkua.lesson1.task1;

public class Circle {
    public static final String NAME = "Circle";

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double square() {
        return radius * radius * Math.PI;
    }

    public static Circle combine(Circle c1, Circle c2) {
        return new Circle(c1.radius + c2.radius);
    }
}
