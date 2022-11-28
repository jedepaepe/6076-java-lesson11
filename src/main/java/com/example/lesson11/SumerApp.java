package com.example.lesson11;

import java.util.Scanner;

public class SumerApp {
    public static void main(String[] args) {
        Sumer sumer = new Sumer();
        Scanner keyboard = new Scanner(System.in);
        String cmd;
        do {
            System.out.println("taper un entier pour l'ajouter au summer");
            System.out.println("taper R pour voir la somme");
            System.out.println("taper Q pour quitter l'application");
            cmd = keyboard.nextLine();
            switch (cmd.toUpperCase()) {
                case "R":
                    System.out.println("La somme est " + sumer.get());
                    break;
                case "Q":
                    break;
                default:
                    int value = Integer.parseInt(cmd);
                    sumer.add(value);
            }
            System.out.println();
        } while (! cmd.equals("Q"));
    }
}
