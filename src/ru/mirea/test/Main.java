package ru.mirea.test;

import ru.mirea.task1.opt1.TestTask1;
import ru.mirea.task2.TestTask2;
import ru.mirea.task3.TestTask3;
import ru.mirea.task4.TestTask4;
import ru.mirea.task5.TestTask5;
import ru.mirea.task6.TestTask6;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Hi");
        TestTask1 test1 = new TestTask1();
        TestTask2 test2 = new TestTask2();
        TestTask3 test3 = new TestTask3();
        TestTask4 test4 = new TestTask4();
        TestTask5 test5 = new TestTask5();
        TestTask6 test6 = new TestTask6();
        test1.Mass();
        test2.Test();
        test3.Test();
        test4.Test();
        test5.Test();
        test6.Test();
    }
}
