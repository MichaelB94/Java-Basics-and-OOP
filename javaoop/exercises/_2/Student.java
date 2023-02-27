package javaoop.exercises._2;

public class Student {
    String name;
    Integer age;
    public Student(String name, Integer age) {
        System.out.println("Constructing!");
        this.name = name;
        this.age = age;
        System.out.println("Constructed!");
    }
    public Student(String name){
        System.out.println("Constructing!");
        this.name = name;
        System.out.println("Constructed!");
    }
    public Student(int age){
        System.out.println("Constructing!");
        this.age = age;
        System.out.println("Constructed!");
    }
    public Student(){}
}

