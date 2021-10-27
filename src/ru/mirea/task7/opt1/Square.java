package ru.mirea.task7.opt1;

public class Square extends Rectangle {
    public Square(){

    }
    public Square(double side){
        this.width = side;
    }
    public Square(double side, String color, Boolean filled){
        this.width = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide(){
        return this.width;
    }
    public void setSide(double width){
        this.width = width;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
