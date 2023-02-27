package javaoop.exercises._3;

public class Student {
    private String name;
    private String surname;
    private int age;
    private char sex;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        if (name != null) {
            this.name = name;
        }else{
            System.out.println("Alert! Invalid name!");
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Alert! Invalid age!");
        } else {
            this.age = age;
        }
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
        if (sex == 'M' || sex == 'F') {
            this.sex = sex;
        }else{
            System.out.println("Alert! Invalid char!");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
