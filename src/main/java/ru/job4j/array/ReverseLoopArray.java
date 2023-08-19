package ru.job4j.array;

public class ReverseLoopArray {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Элементы массива в обратном порядке: ");
        for (int i = 0; i < num.length; i++) {
            int el = num[num.length - i - 1];
            System.out.println(el);
        }
    }
}
