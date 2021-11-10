package ru.mirea.task10.opt14;
import java.util.Scanner;

public class TestTask1014 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        foo(N);
    }
    public static void foo(int N){
        if (N > 9) {
            foo(N / 10);
        }
        System.out.println(N % 10);
    }
}
