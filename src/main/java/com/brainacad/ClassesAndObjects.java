package com.brainacad;

public class ClassesAndObjects {
    public static void main(String[] args){
        Person person1 = new Person();
        person1.name = "Роман";
        person1.age = 50;
        System.out.println("Меня зовут " + person1.name + "," + " мне " + person1.age + "лет");
        Person person2 = new Person();
        person1.name = "Боря";
        person1.age = 20;
        System.out.println("Меня зовут " + person1.name + "," + " мне " + person1.age + "лет");

    }
    }

    class Person {
        String name;
        int age;

    }


