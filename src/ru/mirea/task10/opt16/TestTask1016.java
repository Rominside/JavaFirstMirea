package ru.mirea.task10.opt16;

import java.util.Scanner;

public class TestTask1016 {
    public static void main(String [] args){
        foo(0, 0);
    }
    public static void foo(int max, int count){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if(N > 0){
            if (N > max){
                foo(N, 1);
            }
            else if(N == max) {
                foo(max, ++count);
            }
            else {
                foo(max, count);
            }
        }
        else {
            System.out.println(count);
        }
    }
}
