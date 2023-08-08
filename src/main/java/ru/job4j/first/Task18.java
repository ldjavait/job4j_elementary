package ru.job4j.first;

import java.util.Scanner;

/**
 * Дана сторона квадрата a. Найти его периметр.
 * Дан радиус окружности r. Найти длину окружности и площадь круга.*
 * Результат каждого вычисления выводите в новой строке с точностью до десятых.
 * *при расчётах используйте вызов Math.PI
 */
public class Task18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double r = input.nextDouble();
        double p = 4 * a;
        double c = 2 * (Math.PI) * r;
        double s = Math.PI * Math.pow(r, 2);
        String out = String.format("%.1f%n%.1f%n%.1f",
                p, c, s);
        System.out.println(out);
    }
}
