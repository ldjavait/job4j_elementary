package ru.job4j.obj;

public class Task14 {
    private String name = "Petr";

    public void getFullName() {
        final String surname = "Arsentev";

        class Nested {
            public void printFullName() {
                System.out.println(name + " " + surname);
            }
        }
    }
}