package ru.job4j.io;

/**
 * Напишите класс, который присваивает переменной х значение 6, а затем выводит на экран:
 * в первой строке ― это значение, во второй ― квадрат этого значения, в третьей ― куб этого значения.
 */
public class Task17 {
    public static void main(String[] args) {
        byte x = 6;
        System.out.println(x);
        System.out.println(Math.pow(x, 2));
        System.out.println(Math.pow(x, 3));
    }
}
