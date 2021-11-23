package ru.mirea.task12.opt2;

public class Student {
    protected int age;
    protected int [] score;
    protected int scoreSum;
    protected String name;
    public Student(int age, int [] score, String name){
        this.age = age;
        this.score = score;
        this.name = name;
        if (score != null && score.length > 0)
        {
            for (int point : score){
                this.scoreSum += point;
            }
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getScoreSum() {
        return scoreSum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", score=" + score +
                ", name='" + name + '\'' +
                '}';
    }
    public static void main(String [] args){
        Student [] students = {
                new Student(19,new int[]{3,4,6},"Roman"),
                new Student(20,new int[]{2,5,1},"Kirill"),
                new Student(21, new int[]{3,2,1}, "Oleg")
        };

        // new QuickSort(students,);
    }
}
