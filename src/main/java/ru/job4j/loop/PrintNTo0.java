package ru.job4j.loop;

/**
 * Выведите на консоль числа от N до 0. N не входит. В этом упражнении используйте цикл for c index
 */
public class PrintNTo0 {
    public static void out(int n) {
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
