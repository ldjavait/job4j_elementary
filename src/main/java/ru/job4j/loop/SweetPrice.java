package ru.job4j.loop;

/**
 * Дано целое число price — цена 1 кг конфет. Вывести стоимость 1, 2, 3, 4, 5 кг конфет.
 */
public class SweetPrice {
    public static void out(int price) {
        for (int i = 1; i <= 5; i++) {
            int rsl = price * i;
            System.out.println(rsl);
        }
    }

    public static void main(String[] args) {
        out(10);
    }
}
