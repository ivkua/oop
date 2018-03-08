package org.ivkua.lesson1.task2;

public class Cat {
    private int age;
    private String name;
    private static int counter = 0;

    public Cat(int age, String name) {
        counter++;
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCounter() {
        return counter;
    }
}
