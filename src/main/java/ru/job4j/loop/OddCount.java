package ru.job4j.loop;

/**
 * Даны два целых положительных числа a и b (b > a). Найти количество нечетных чисел в диапазоне [a, b].
 */
public class OddCount {
    public static int count(int a, int b) {
        int rsl = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 1) {
                rsl++;
                System.out.println(rsl);
            }
        }
        return rsl;
    }
}
