package ru.job4j.type;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int centimeters = input.nextInt();
        double inches = (double) centimeters / 2.54;
        String rsl = String.format("%.2f", inches, System.lineSeparator()).replace(',', '.');
        System.out.printf(rsl);
    }
}
