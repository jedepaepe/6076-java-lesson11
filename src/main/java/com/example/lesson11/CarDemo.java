package com.example.lesson11;

public class CarDemo {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Mercèdes";
        c1.model = "class A";
        c1.licensePlate = "2 AVE 412";
        c1.color = "blue";
        c1.buyPrice = 35233.45;

        Car c2 = new Car();
        c2.brand = "Mercèdes";
        c2.model = "class A";
        c2.licensePlate = "2 AVE 412";
        c2.color = "blue";
        c2.buyPrice = 35233.45;

        System.out.println(c1 == c2);
        boolean b = c1.licensePlate.equals(c2.licensePlate);
        System.out.println(b);
        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c1));
    }
}
