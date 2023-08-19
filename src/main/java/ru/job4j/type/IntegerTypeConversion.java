package ru.job4j.type;

/**
 * Сделать приведение типов
 */
public class IntegerTypeConversion {
    public static void main(String[] args) {
        int num = 1;
        long numUpper = num;
        short numLower = (short) num;
        System.out.println(numUpper);
        System.out.println(numLower);
    }
}
