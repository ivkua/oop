package org.ivkua.lesson2.coffee;

public abstract class Coffee {
    private String NAME;
    private int sugar;
    private boolean cinnamon = false;

    public void addSugar(int piece){
        sugar = piece;
    }

    public void addCinnamon(){
        cinnamon = true;
    }

    public int getSugar(){
        return sugar;
    }
    public boolean getCinnamon(){
        return cinnamon;
    }

    public String getCoffee() {
        StringBuilder coffee = new StringBuilder();
        if(sugar > 0){
            coffee.append(" with: " + sugar + " sugar");
            if(cinnamon){
                coffee.append(", cinnamon");
            }
        } else {
            if (cinnamon) {
                coffee.append("with: cinnamon");
            }
        }
        String getCoffee = coffee.toString();
        return getCoffee;
    }
}
