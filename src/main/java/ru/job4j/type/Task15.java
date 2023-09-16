package ru.job4j.type;

/**
 * Дописать метод, чтобы он возвращал 3 следующих числа так,
 * чтобы разница между каждым числом и следующим за ним составляла 2.
 * Например: для входящего числа 6 нужно вывести числа 8, 10, 12.
 * Решить упражнение нужно только c помощью арифметических операций,
 * то есть без помощи циклов и подобных средств языка Java.
 */
public class Task15 {
    public static String increaseBy2(int number) {
        int a, b, c;
        a = number + 2;
        b = a + 2;
        c = b + 2;
        return a + ", " + b + ", " + c;
    }

    public static void main(String[] args) {
        System.out.println(increaseBy2(6));
    }
}
