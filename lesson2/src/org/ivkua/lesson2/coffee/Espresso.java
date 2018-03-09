package org.ivkua.lesson2.coffee;

public class Espresso extends Coffee {
    private final static String NAME = "Espresso";

    public void addSugar(int piece) {
        super.addSugar(piece);
    }

    public void addCinnamon() {
        super.addCinnamon();
    }

    public int getSugar() {
        return super.getSugar();
    }

    public boolean getCinnamon() {
        return super.getCinnamon();
    }

    public String getCoffee() {
        return "Here is your " + NAME + super.getCoffee();
    }
}
