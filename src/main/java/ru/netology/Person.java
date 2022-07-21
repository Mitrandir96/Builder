package ru.netology;

import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public Person(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }


    public boolean hasAge() {
        if (age == 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean hasAddress() {
        if (!address.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public String getsurname() {
        return surname;
    }

    public int getage() {
        return age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (hasAge() == true) {
            this.age++;
        }
    }
    @Override
    public String toString() {
        return "имя: " + name + ", фамилия: " + surname + ", возраст: " + age + ", адрес места жительства: "
        + address;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, surname);

    }

    @Override
    public boolean equals(Object obj) {
        Person o = (Person) obj;
        return name.equals(o.name) && surname.equals(o.surname);
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(this.surname)
                .setAge(0)
                .setAddress(this.address);
    }





}
