package com.example.lesson11;

public class SqrtCalc {
    public static double sqrt(double value) {
        double result = 1;
        int count = 0;
        while (Math.abs(result - value / result) > 1./1_000_000 && count < 8) {
            result = (result + value / result) / 2;
            System.out.println(result + " " + Math.abs((result - value / result)));
            ++count;
         }
        return result;
    }

    public static void main(String[] args) {
        sqrt(4);
        sqrt(9);
        sqrt(16);
    }
}
