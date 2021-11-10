package ru.mirea.task10.opt17;

import java.util.Scanner;

public class TestTask1017 {
    public static void main(String[] args) {
        foo(0);
    }

    public static void foo(int max) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (N > 0) {
            if (N > max) {
                foo(N);
            }
            else {
                foo(max);
            }
        }
        else {
            System.out.println(max);
        }
    }
}