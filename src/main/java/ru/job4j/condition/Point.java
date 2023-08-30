package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow(that.x - this.x, 2) + pow(that.y - this.y, 2) + pow(that.z - this.z, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 2);
        Point b = new Point(0, 2);
        double distance = a.distance(b);
        System.out.println(distance);
        Point one = new Point(1, 2, 3);
        Point two = new Point(4, 5, 6);
        double dist = one.distance3d(two);
        System.out.println(dist);
    }
}
