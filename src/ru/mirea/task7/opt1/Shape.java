package ru.mirea.task7.opt1;

public abstract class Shape {
    protected String color;
    protected Boolean filled;
    public Shape(){

    }
    public Shape(String color, Boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor()
    {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Boolean isFilled(){
        return this.filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
