package ru.mirea.task3.opt3;

public class TestTask33 {
    public static void main(String[] args )
    {
        Book b1 = new Book("Book_1", 350, 1994);
        System.out.println(b1.toString());

        b1.setAuthor("Dostoevski");
        b1.setTitle("Crime and Punishment");
        b1.setNumberOfPages(300);
        b1.setYearOfWriting(1866);

        System.out.println(b1.toString());
        System.out.println(b1.getTitle());
        System.out.println(b1.getAuthor());
    }
}
