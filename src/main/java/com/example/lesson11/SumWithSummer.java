package com.example.lesson11;

public class SumWithSummer {
    public static void main(String[] args) {
        // juste parce c'est fatiguant de configurer IntelliJ
        if (args.length == 0) {
            args = new String[] { "10", "5", "100" };
        }

        Sumer sumer = new Sumer();
        for (String arg : args) {
            sumer.add(arg);
        }
        System.out.println(sumer.get());
    }
}
