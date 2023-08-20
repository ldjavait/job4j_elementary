package ru.job4j.algorithms;

/**
 * Алгоритм поиска минимального элемента в массиве.
 * Решение поиска минимума сводится к выбору предполагаемого максимума.
 * Далее мы последовательно сравниваем эту переменную с каждым элементом в массиве.
 * Если элемент в массиве меньше, чем наша переменная, то в переменную записываем этот элемент.
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
}
