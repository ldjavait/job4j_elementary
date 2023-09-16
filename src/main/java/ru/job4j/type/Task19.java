package ru.job4j.type;

/**
 * Написать код, который считает сумму всех денег, они теперь есть у Вас и преобразует их в евро.
 */
public class Task19 {
    public static void sumAndConvert(double money, double gift, double ratio) {
        double euro = (money + gift) * ratio;
        System.out.printf("%.2f", euro);
    }
}
