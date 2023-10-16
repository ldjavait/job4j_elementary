package ru.job4j.type;

/**
 * Вывести входящее число в консоль в одну строку в "полном виде", то есть в виде "сотни+десятки+единицы".
 */
public class Task25 {
    public static void separate(int number) {
        int num1, num2, num3;
        num2 = number % 10;
        num1 = number % 100 - num2;
        num3 = number % 1000 - num1 - num2;
        System.out.println(num3 + "+" + num1 + "+" + num2);
    }
}
