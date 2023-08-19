package ru.job4j.array;

/**
 * Заполнить массив значениями от 1 до 6, при этом:
 * Разбить значения на 3 массива.
 * В первом должен быть 1 элемент, втором - 2 элемента, третьем - 3 элемента.
 */
public class NonSquareArray {
    public static void main(String[] args) {
        int[][] array = {{1}, {2, 3}, {4, 5, 6}};
        for (int[] ints : array) {
            System.out.println(ints.length);
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
    }
}
