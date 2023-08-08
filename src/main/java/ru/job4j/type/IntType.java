package ru.job4j.type;

import java.util.Scanner;

/**
 * В Java есть 8 примитивных типов. Int описывает число от числа от - 2 в степени 31 до 2 в степени 31 минус 1.
 * Что бы объявить переменную нужно указать ее тип, а потом имя переменной.
 * Int age = 1;
 * Ниже приведен код. Программа получает от пользователя число в диапазоне int и выводит его на консоль.
 * Поправьте программу, чтобы она компилировалась.
 */
public class IntType {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        System.out.println(value);
    }
}
