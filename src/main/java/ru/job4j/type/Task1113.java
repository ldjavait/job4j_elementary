package ru.job4j.type;

import java.util.Scanner;

/**
 * Написать код, реализующий преобразование исходной валюты по указанному "банковскому курсу".
 */
public class Task1113 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dollars = input.nextInt();
        double transferRate = input.nextDouble();
        double rslCurrency = transferRate * dollars;
        System.out.printf("%.2f", rslCurrency);
    }
}
