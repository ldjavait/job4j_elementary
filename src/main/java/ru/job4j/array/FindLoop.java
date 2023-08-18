package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int elem) {
        int rsl = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == elem) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 7, 3};
        System.out.println(indexOf(arr, 7));
    }
}
