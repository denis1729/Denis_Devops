package org.gradle;

public class Person {
    private final String name;
    private final String lastName;
    private final String id;
    private final String gender;
    private final int age;

    public Person(String name, String lastName, int age, String id, String gender) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
