package ru.mirea.task7.opt2;

public class TestTask72 {
    public static void main(String [] args){
        Movable m1 = new MovableCircle(3,3,3,3,5);
        System.out.println(m1.toString());
        m1.moveDown();
        m1.moveLeft();
        System.out.println(m1.toString());

        Movable m2 = new MovableRectangle(5,5,4,4,8,8);
        System.out.println(m2.toString());
        m2.moveUp();
        m2.moveRight();
        System.out.println(m2.toString());
    }
}
