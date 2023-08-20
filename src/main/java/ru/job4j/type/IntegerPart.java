package ru.job4j.type;

/**
 * Приведите вещественное число к целому.
 */
public class IntegerPart {
    public static void main(String[] args) {
        float floatNum = 2.6f;
        int integerNum = (int) floatNum;
        System.out.println(integerNum);
    }
}
