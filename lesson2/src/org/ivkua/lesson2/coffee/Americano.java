package org.ivkua.lesson2.coffee;

public class Americano extends Coffee {
    private final static String NAME = "Americano";
    private boolean milk = false;

    public void addMilk(){
        milk = true;
    }

    public void addSugar(int piece){
        super.addSugar(piece);
    }

    public void addCinnamon(){
        super.addCinnamon();
    }

    public String getCoffee(){
        StringBuilder coffee = new StringBuilder();
        coffee.append("Here is your " + NAME).append(super.getCoffee());
        if(!getCinnamon() && getSugar() == 0){
            if (milk){
                coffee.append(" with: milk");
            }
        } else {
            if (milk){
                coffee.append(", milk");
            }
        }
        String getCoffee = coffee.toString();
        return getCoffee;
    }
}