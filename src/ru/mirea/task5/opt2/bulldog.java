package ru.mirea.task5.opt2;

public class bulldog extends Dog{
    public bulldog(int age, String name){
        this.name = name;
        this.age = age;
    }
    @Override
    public void feed() {
        this.hungry = false;
    }

    @Override
    public String getAge() {
        return " bulldog age " + this.age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return " bulldog name " + this.name;
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
        return "bulldog{" +
                "hungry=" + hungry +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
