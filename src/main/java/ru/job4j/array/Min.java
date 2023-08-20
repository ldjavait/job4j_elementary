package ru.job4j.array;

/**
 * Решение поиска минимума сводится к выбору предполагаемого максимума.
 * Далее мы последовательно сравниваем эту переменную с каждым элементом в массиве.
 * Если элемент в массиве меньше, чем наша переменная, то в переменную записываем этот элемент.
 */
public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
