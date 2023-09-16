package ru.job4j.type;

/**
 * Отделить цифры данного числа друг от друга и вывести их в консоль в одну строку через пробел.
 */
public class Task21 {
    public static void separate(int number) {
        int num1, num2, num3;
        num3 = number % 1000 / 100;
        num2 = number % 100 / 10;
        num1 = number % 10;
        System.out.println(num3 + " " + num2 + " " + num1);
    }
}
