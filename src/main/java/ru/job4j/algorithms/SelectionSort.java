package ru.job4j.algorithms;

/**
 * Находим номер минимального значения в текущем списке.
 * Производим обмен этого значения со значением первой неотсортированной позиции
 * (обмен не нужен, если минимальный элемент уже находится на данной позиции).
 * Теперь сортируем хвост списка, исключив из рассмотрения уже отсортированные элементы.
 */
public class SelectionSort {
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = min(array, i, array.length);
            int tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;
        }
    }

    private static int min(int[] array, int start, int end) {
        int minIndex = start;
        int minValue = array[start];
        for (int i = start + 1; i < end; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int[] array = new int[]{64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        for (int i : array) {
            System.out.println(i);
        }
        selectionSort(array);
        System.out.println("*******************");
        for (int i : array) {
            System.out.println(i);
        }
    }
}
