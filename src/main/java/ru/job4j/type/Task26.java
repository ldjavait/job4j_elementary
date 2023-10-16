package ru.job4j.type;

public class Task26 {
    public static void transform(int number) {
        int num1, num2;
        num1 = number % 100 / 10;
        num2 = number % 10;
        int rsl = Integer.parseInt(num2 + "" + num1);
        System.out.println(rsl + 8);
    }

    public static void main(String[] args) {
        transform(37);
    }
}
