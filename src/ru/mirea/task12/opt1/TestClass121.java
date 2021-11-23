package ru.mirea.task12.opt1;

import java.util.Arrays;
import java.util.Comparator;

public class TestClass121 {
    public static void main(String [] args){
        Student [] students = {
                new Student(19,3,"Roman"),
                new Student(20,2,"Kirill"),
                new Student(21, 1,"Denis")
        };

        Arrays.sort(students, Comparator.comparingInt(Student::getID));
        for (Student student :students)
        {
            System.out.println(student.toString());
        }
    }
}
