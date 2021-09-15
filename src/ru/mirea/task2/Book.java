package ru.mirea.task2;

import java.lang.*;

public class Book {
    private String title;
    private int numberOfPages;

    public Book(String title, int numberOfPages){
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

    public Book(String title){
        this.title = title;
        this.numberOfPages = 0;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
