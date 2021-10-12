package ru.mirea.task5.opt3;

public class FurnitureShop {
    public static void main(String [] args){
        furniture f1 = new bed(10000,500);
        furniture f2 = new table(5000,250);
        furniture f3 = new pillow(500,100);

        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(f3.toString());

        f1.setPrise(7000);
        System.out.println(f1.getPrise());

        f2.setVolume(400);
        System.out.println(f2.getVolume());
    }
}
