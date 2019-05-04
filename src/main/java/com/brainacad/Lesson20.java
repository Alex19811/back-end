package com.brainacad;

public class Lesson20 {
    public static void main(String[] args) {
        Human human1 = new Human("Bob", 15);

    }


    static class Human {
        private String name;
        private int age;

        public Human() {
            System.out.println("Привет из первого конструктора");
        }

        public Human(String name) {
            System.out.println("Привет из вторрого конструктора");
            this.name = name;
        }

        public Human(String name, int age) {
            System.out.println("Привет из третьего конструктора");
            this.name = name;
            this.age = age;

        }


        public void setName() {
            this.name = name;
        }

        public void setAge() {
            this.age = age;
        }

    }
}
