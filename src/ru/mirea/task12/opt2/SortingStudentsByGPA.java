package ru.mirea.task12.opt2;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getScoreSum(), o2.getScoreSum());
    }
}
