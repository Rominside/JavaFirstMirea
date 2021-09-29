package ru.mirea.task1.opt5;

import java.util.Scanner;

public class TestTask5 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = 1;
        for (int i = 1; i <= n;i++)
        {
            k = k * i;
        }
        System.out.println(k);
    }
}
