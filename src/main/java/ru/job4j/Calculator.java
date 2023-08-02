package ru.job4j;

public class Calculator {
    public static int plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        plus(12, 12);
    }
}
