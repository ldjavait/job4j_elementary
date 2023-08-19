package ru.job4j.array;

/**
 * Идти надо только до середины массива,
 * ибо если продолжать до конца массива,
 * то при проходе от array.length / 2 до array.length элементы повторно обменяются местами,
 * в результате чего получится исходный порядок.
 */
public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
