package ru.job4j.array;

public class RollBackArray {
    public static int[] rollback(int[] array) {
        int[] rsl = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            rsl[i] = array[array.length - i - 1];
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4};
        for (int i : input) {
            System.out.println(i);
        }
        for (int i : rollback(input)) {
            System.out.println(i);
        }
    }
}
