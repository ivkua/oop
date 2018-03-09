package org.ivkua.lesson2.coffee;

/* Придумать любую свою иерархию классов  */

public class Main {
    public static void main(String[] args) {
        Espresso espresso = new Espresso();
        espresso.addSugar(2);
        System.out.println(espresso.getCoffee());

        Americano americano = new Americano();
        americano.addCinnamon();
        americano.addSugar(2);
        americano.addMilk();
        System.out.println(americano.getCoffee());
    }
}
