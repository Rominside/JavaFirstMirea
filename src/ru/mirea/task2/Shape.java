package ru.mirea.task2;

public class Shape {
    private double volume;
    private String title;

    public Shape(double volume, String title)
    {
        this.title = title;
        this.volume = volume;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getTitle() {
        return title;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "volume=" + volume +
                ", title='" + title + '\'' +
                '}';
    }
}
