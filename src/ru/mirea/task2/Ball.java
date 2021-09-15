package ru.mirea.task2;

public class Ball {
    private String kindOfSport;
    private double sizeCircle;

    public Ball(String kindOfSport, double sizeCircle){
        this.kindOfSport = kindOfSport;
        this.sizeCircle = sizeCircle;
    }

    public Ball(String kindOfSport){
        this.kindOfSport = kindOfSport;
        this.sizeCircle = 0;
    }

    public double getSize() {
        return sizeCircle;
    }

    public String getKindOfSport() {
        return kindOfSport;
    }

    public void setSize(double size) {
        this.sizeCircle = size;
    }

    public void setKindOfSport(String kindOfSport) {
        this.kindOfSport = kindOfSport;
    }

    public String toString() {
        return "Ball{" +
                "kindOfSport='" + kindOfSport + '\'' +
                ", size=" + sizeCircle +
                '}';
    }
}
