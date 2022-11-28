package com.example.lesson11;

public class PointUse {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 1;
        p1.y = 2;

        Point p2 = new Point();
        p2.x = 1;
        p2.y = 2;
        boolean p1EqualsP2 = p1.equals(p2);
        System.out.println("p1 == p2 ? " + p1EqualsP2);
        System.out.println("distance entre p1 et p2 = " + p1.distance(p2));

        Point p3 = new Point();
        p3.x = 1;
        p3.y = 5;
        boolean p3EqualsP2 = p3.equals(p2);
        System.out.println("p3 == p2 ? " + p3EqualsP2);
        System.out.println("distance entre p3 et p2 = " + p3.distance(p2));
    }
}
