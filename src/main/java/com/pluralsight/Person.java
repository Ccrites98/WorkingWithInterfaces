package com.pluralsight;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Person extends Comparable<Person> {
    protected String firstName, lastName;
    protected int age;
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public int compareTo(Person other) {
        return this.lastName.compareTo(other.getLastName());
    }
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
    public static void main(String[] args) {
        List<Person> myFamily = new ArrayList<>();
        // Only the most wholesome, totally not controversial people.
        myFamily.add(new Person("Claude", "Vorilhon", 77));
        myFamily.add(new Person("Joseph", "Smith", 35));
        myFamily.add(new Person("Roch", "Theriault", 63));
        myFamily.add(new Person("L. Ron", "Hubbard", 74));
        myFamily.add(new Person("Homer", "Simpson", 36));
        myFamily.add(new Person("Taylor", "Brandon R.", 24));
        Collections.sort(myFamily);
        for (Person person : myFamily) {
            System.out.println(person);
        }}}
