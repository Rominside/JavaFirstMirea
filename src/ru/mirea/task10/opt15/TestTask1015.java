package ru.mirea.task10.opt15;
import java.util.Scanner;

public class TestTask1015 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        foo(N);
    }
    public static void foo(int N){
        System.out.println(N % 10);
        if (N > 9){
            foo(N / 10);
        }
    }
}
