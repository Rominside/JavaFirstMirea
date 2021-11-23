package ru.mirea.task13.opt2;

import java.util.LinkedList;

public class TestLinked extends LinkedList<TestClass132> {
    public TestLinked(TestClass132 [] TestMass){
        for (int i = 0; i < 3; i++){
            this.addLast(TestMass[i]);
        }

        this.addFirst(new TestClass132(0,"Object0"));
        this.addLast(new TestClass132(4,"Object4"));
        for (TestClass132 i : this){
            System.out.println(i.toString());
        }
        System.out.println("GetFirst" + this.getFirst().getObjectName());
        System.out.println("GetLast" + this.getLast().getObjectName());

        this.removeFirst();
        this.removeLast();
        for (TestClass132 i : this){
            System.out.println(i.toString());
        }
    }

    public static void main(String [] args){
        TestClass132[] TestMass = new TestClass132 [3];
        TestMass[0] = new TestClass132(1,"Object1");
        TestMass[1] = new TestClass132(2,"Object2");
        TestMass[2] = new TestClass132(3,"Object3");

        new TestLinked(TestMass);
    }
}
