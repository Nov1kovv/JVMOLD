package org.example.basic;

public class Method {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.getAge();
        person1.name = "John";
        person1.speak();
    }
}

class Person{
    String name;
    int age;

    public int getAge() {
        return age + 6;
    }

    void speak(){
        System.out.println("Hello");
    }
    }
