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
        System.out.println(a * 4);
        System.out.println(Math.round(2 * Math.PI * r * 10) / 10.0);
        System.out.println(Math.round(Math.PI * Math.pow(r, 2) * 10) / 10.0);
    }
}
