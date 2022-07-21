package ru.netology;

public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Олеся")
                .setSurname("Иванова")
                .setAge(30)
                .setAddress("Владивосток")
                .build();

        Person son = mom.newChildBuilder()
                .setName("Катя")
                .build();

        System.out.println("У " + mom + " есть дочь, " + son);

        System.out.println(mom.hasAge());

        try {
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }
}