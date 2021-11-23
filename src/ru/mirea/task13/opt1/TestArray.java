package ru.mirea.task13.opt1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class TestArray extends ArrayList<TestClass131> {
    public TestClass131 IndexOf(){
        for(TestClass131 iterator : this){
            if(iterator.getObjectName() == "TestMass1"){
                return iterator;
            }
        }
        return null;
    }
    public TestArray(TestClass131[] TestMass){
        for (int i = 0; i < 3; i++)
        {
            this.add(new TestClass131(i,"TestObject" + i));
        }
        this.addAll(1,Arrays.asList(TestMass));
        for (TestClass131 i : this) {
            System.out.println(i.toString());
        }
        Iterator<TestClass131> iterator = this.iterator();
        System.out.println("Object 2 = " + this.get(2));
        System.out.println("First index TestMass1 = " + this.indexOf(IndexOf()));
        this.sort(Comparator.comparing(TestClass131::getObjectNumber));
        for (TestClass131 i : this) {
            System.out.println(i.toString());
        }
        System.out.println("Remove " + this.remove(3));
        for (TestClass131 i : this){
            System.out.println(i.toString());
        }
    }
    public static void main(String [] args){
        TestClass131[] TestMass = new TestClass131[2];
        TestMass[0] = new TestClass131(8,"TestMass1");
        TestMass[1] = new TestClass131(9,"TestMass1");

        new TestArray(TestMass);
        /*
        System.out.println("Objet 0 = " + list.get(0));
        System.out.println("First index 4 = " + list.indexOf("4"));
        System.out.println("Last index 4 = " + list.lastIndexOf("4"));

         */

    }
}
