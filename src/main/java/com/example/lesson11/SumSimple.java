package com.example.lesson11;

public class SumSimple {
    public static void main(String[] args) {
        // juste parce c'est fatiguant de configurer IntelliJ
        if (args.length == 0) {
            args = new String[] { "10", "5", "100" };
        }

        int sum = 0;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }
        System.out.println(sum);
    }
}
