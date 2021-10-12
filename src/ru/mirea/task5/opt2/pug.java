package ru.mirea.task5.opt2;

public class pug extends Dog {
    public pug(int age, String name){
        this.age = age;
        this.name = name;
    }
    @Override
    public void feed() {
        this.hungry = false;
    }

    @Override
    public String getAge() {
        return " pug age " + this.age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return " pud name " + this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void hungry() {
        this.hungry = true;
    }

    @Override
    public String toString() {
        return "pug{" +
                "hungry=" + hungry +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
