package ru.job4j.type;

import java.util.Scanner;

/**
 * Написать код, который преобразовывает полученное значение градусов Фаренгейта в градусы Цельсия.
 * Значение градусов Фаренгейта принимается вводом с клавиатуры с помощью класса Scanner в виде целого числа.
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fahrenheit = input.nextInt();
        double celsius = (double) (5 * (fahrenheit - 32)) / 9;
        String rsl = String.format("%.1f", celsius, System.lineSeparator()).replace(',', '.');
        System.out.printf(rsl);
    }
}
