package ru.job4j.array;

public class MatrixFind {
    public static void find(int[][] array, int el) {
        System.out.println("Find el : " + el);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int val = array[i][j];
                if (val == el) {
                    System.out.println("i : " + i + " , j : " + j);
                }
             }
        }
    }

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {3, 2, 1},
                {2, 3, 1}
        };
        MatrixFind.find(array, 3);
    }
}
