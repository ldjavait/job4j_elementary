package ru.job4j.type;

public class Task24 {
    public static void separate(int number) {
        int num1, num2;
        num2 = number % 10;
        num1 = number % 100 - num2;
        System.out.println(num1 + "+" + num2);
    }
}
