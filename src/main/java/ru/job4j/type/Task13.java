package ru.job4j.type;

import java.util.Scanner;

/**
 * Даны два действительных числа a и b, вывести их сумму, разность, произведение,
 * частное - результат каждого вычисления вывести в новую строку.
 */
public class Task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }
}
