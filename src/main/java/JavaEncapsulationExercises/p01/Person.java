package JavaEncapsulationExercises.p01;

public class Person {
/*
1. Write a Java program to create a class called Person with private instance variables name, age. and country.
Provide public getter and setter methods to access and modify these variables.
*/

    private String name;
    private int age;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
