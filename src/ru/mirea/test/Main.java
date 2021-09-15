package ru.mirea.test;

import ru.mirea.task1.opt1.TestTask1;
import ru.mirea.task1.opt1.TestTask1;
import ru.mirea.task2.TestTask2;
import ru.mirea.task4.TestTask4;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Hi");
        TestTask1 test1 = new TestTask1();
        TestTask2 test2 = new TestTask2();
        TestTask4 test4 = new TestTask4();
        test1.Mass();
        test2.Test();
        test4.Test();
    }
}
