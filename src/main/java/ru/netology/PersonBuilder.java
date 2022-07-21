package ru.netology;

public class PersonBuilder implements IPersonBuild {
    protected String name;
    protected String surname;
    protected int age;
    protected String address;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть меньше 0!");
        } else if (age > 0) {
            this.age = age;
        }
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public Person build() {
        if (name == null) {
            throw new IllegalStateException("Поле имени должно быть заполнено!");
        }
        if (surname == null) {
            throw new IllegalStateException("Поле фамилии должно быть заполнено!");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть меньше 0!");
        }
        Person person = new Person(name, surname, age);
        person.setAddress(address);
        return person;
    }
}
