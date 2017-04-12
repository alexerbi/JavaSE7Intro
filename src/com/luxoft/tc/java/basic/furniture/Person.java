package com.luxoft.tc.java.basic.furniture;

/**
 * Created by alexjd on 11.04.2017.
 */
public class Person {
    private String name;
    private int age;

//alt + ins вызов конструктора


    public Person(String name) {
        this.name = name;
    }


    public Person(int age) {
        this.age = age;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person(55);
        int age = person.getAge();
        System.out.println(new Person(55).getAge());

    }


    @Override
    public String toString() {
        return "com.luxoft.tc.java.basic.furniture.chemistry.com.luxoft.tc.java.basic.furniture.Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
