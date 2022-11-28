package com.example.lesson11;

public class Sumer {
    private int sum = 0;

    public void add(int value) {
        sum += value;
    }

    public void add(String value) {
        sum += Integer.parseInt(value);
    }

    public int get() {
        return sum;
    }

    public String getString() {
        return "" + sum;
    }
}
