package ru.mirea.task12.opt1;

public class Student {
    protected int ID, age;
    protected String name;
    public Student(int age, int ID, String name){
        this.age = age;
        this.ID = ID;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
