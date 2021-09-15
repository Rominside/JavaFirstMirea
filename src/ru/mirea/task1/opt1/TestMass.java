package ru.mirea.task1.opt1;

import java.lang.*;
import java.util.Scanner;
import java.lang.Math;

public class TestMass {
    public int Mass() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        double[] mass = new double [size];
        double summ = 0;
        for (int i = 0; i < size; i++)
        {
            mass[i] = Math.random()*10;
            summ = summ + mass[i];
        }
        System.out.println(summ);
        return 0;
    }
}
