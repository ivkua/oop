package org.ivkua.lesson1.task1;

public class Rectangle {
    public static final String NAME = "Rectangle";

    private int widht;
    private int height;

    public Rectangle(int widht, int height) {
        this.widht = widht;
        this.height = height;
    }

    public int getWidht() {
        return widht;
    }

    public int getHeight() {
        return height;
    }

    public void setWidht(int widht) {
        this.widht = widht;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double square() {
        return height * widht;
    }

    public static Rectangle combine(Rectangle r1, Rectangle r2) {
        return new Rectangle(r1.widht + r2.widht, r1.height + r2.height);
    }
}
