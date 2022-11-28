package com.example.lesson11;

public class Point {
    double x;
    double y;

    public boolean equals(Point point) {
        return x == point.x && y == point.y;
    }

    public double distance(Point point) {
        double deltaX = x - point.x;
        double deltaY = y - point.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
