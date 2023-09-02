package ru.job4j.type;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inches = input.nextInt();
        double centimeters = (double) inches * 2.54;
        String rsl = String.format("%.2f", centimeters, System.lineSeparator()).replace(',', '.');
        System.out.printf(rsl);
    }
}
