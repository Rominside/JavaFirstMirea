package ru.mirea.task1.opt4;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class TestTask14 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mass = new int[n];
        Random random = new Random();
        for (int i = 0; i < n;i++)
        {
            if (i < n/2) {
                mass[i] = random.nextInt(10);
            }
            else
            {
                mass[i] = 0 + (int) (Math.random() * 10);
            }
            System.out.println("mass [" + i + "]" + mass[i]);
        }
        Arrays.sort(mass);
        for (int j = 0; j < n; j++)
        {
            System.out.println("mass [" + j + "]" + mass[j]);
        }
    }
}
