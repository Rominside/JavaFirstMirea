package ru.mirea.task3.opt3;

public class Book {
    public String title;
    public String author;
    private int numberOfPages;
    private int yearOfWriting;

    public Book(String title, int numberOfPages, int yearOfWriting){
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

    public void setYearOfWriting(int yearOfWriting) {
        this.yearOfWriting = yearOfWriting;
    }

    public int getYearOfWriting() {
        return yearOfWriting;
    }

    public Book(String title){
        this.title = title;
        this.numberOfPages = 0;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
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

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
