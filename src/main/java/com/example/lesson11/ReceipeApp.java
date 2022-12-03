package com.example.lesson11;

public class ReceipeApp {
    public static void main(String[] args) {
        Receipe r1 = new Receipe();
        r1.caterory = "soupe";
        r1.origin = "France";
        r1.difficulty = 1;
        r1.duration = 75;   // minutes
        r1.ingredients = "4 oignons, 3 pommes de terre, 1 bouillon cube, 1.5 litre d'eau, du poivre, du sel, du beurre," +
                " du gruyère rapé et des croutons";

        Receipe r2 = new Receipe();
        r2.caterory = "dessert";
        r2.origin = "France Vaucluse";
        r2.difficulty = 1;
        r2.duration = 65;
        r2.ingredients = "1 pâte brisée, 50g de beurre, 100g de sucre, 750g de mirabelles dénoyautées et 1 oeuf";

        System.out.println(r1.equals(r2));
    }
}
