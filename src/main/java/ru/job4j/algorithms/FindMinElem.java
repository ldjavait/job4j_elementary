package ru.job4j.algorithms;

/**
 * Алгоритм поиска минимального элемента в массиве.
 */
public class FindMinElem {
    public static int min(int[] array) {
        int minValue = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minValue;
    }

    public static void main(String[] args) {
        int[] array = new int[]{12, 65, 3, 76, 31, 56, 90, 44, 2};
    }
}
