package ru.mirea.task2;

public class TestTask2 {
    public  int Test()
    {
        Dog d1 = new Dog("Mike", 2);
        Dog d2 = new Dog("Helen", 7);
        Dog d3 = new Dog("Bob");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();

        Book b1 = new Book("Book_1", 150);
        Book b2 = new Book("Book_2" );
        b2.setNumberOfPages(170);
        System.out.println(b2.toString());

        Ball ba1 = new Ball("Football", 61);
        Ball ba2 = new Ball("Basketball");
        ba2.setSize(64);
        System.out.println(ba1.toString());

        return 0;
    }
}
