package ru.mirea.task5.opt2;

public class germanShepherd extends Dog {
    public germanShepherd(int age, String name){
        this.name = name;
        this.age = age;
    }
    @Override
    public void feed() {
         this.hungry = false;
    }

    @Override
    public String getAge() {
        return " german shepherd age " + this.age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return " german shepherd age " + this.name;
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
        return "german shepherd{" +
                "hungry=" + hungry +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
