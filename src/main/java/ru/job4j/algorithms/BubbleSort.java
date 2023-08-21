package ru.job4j.algorithms;

/**
 * Алгоритм состоит из повторяющихся проходов по сортируемому массиву.
 * За каждый проход элементы последовательно сравниваются попарно и,
 * если порядок в паре неверный, выполняется перестановка элементов.
 * Проходы по массиву повторяются до тех пор,
 * пока на очередном проходе не окажется, что обмены больше не нужны, что означает — массив отсортирован.
 * При каждом проходе алгоритма по внутреннему циклу очередной наибольший элемент массива ставится на
 * своё место в конце массива рядом с предыдущим «наибольшим элементом»,
 * а наименьший элемент перемещается на одну позицию к началу массива
 * («всплывает» до нужной позиции, как пузырёк в воде — отсюда и название алгоритма).
 */
public class BubbleSort {
    public static void bubbleSort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
    }
}