package ru.job4j.type;

/**
 * Построить новое значение, составленное из цифр входящего числа, но в обратном порядке.
 * Полученное значение нужно уменьшить на 20 и вывести в консоль.
 */
public class Task27 {
    public static void transform(int number) {
        int num1, num2, num3;
        num1 = number % 10;
        num2 = (number % 100 - num1) / 10;
        num3 = number % 1000 / 100;
        int rsl = Integer.parseInt(num1 + "" + num2 + "" + num3);
        System.out.println(rsl - 20);
    }
}
