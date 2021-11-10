package ru.mirea.task10.opt10;
import java.util.Scanner;

public class TestTask1010 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.println(foo(N,0));
    }
    public static int foo(int N, int i){
        if (N == 0) {
            return i;
        }
        else {
            return foo(N / 10, i * 10 + N % 10);
        }
    }
}
