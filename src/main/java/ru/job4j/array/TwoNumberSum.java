package ru.job4j.array;

import java.util.Arrays;

public class TwoNumberSum {
    /**
     * @param array  массив
     * @param target число, которому должна быть ровна сумма индексов элементов массива.
     * @return массив из двух индексов элементов массива array, которые в сумме равны числу target.
     * Если такой суммы нет – метод должен вернуть массив нулевой длины.
     */
    public static int[] getIndexes(int[] array, int target) {
        Arrays.sort(array);
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] == target) {
                return new int[]{i, j};
            } else if (array[i] + array[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[0];
    }
}
