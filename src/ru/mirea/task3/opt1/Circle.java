package ru.mirea.task3.opt1;

public class Circle {
    private double R;
    private double CentreX;
    private double CentreY;

    public Circle(double CenterX, double CenterY, double R)
    {
        this.CentreX = CenterX;
        this.CentreY = CenterY;
        this.R = R;
    }

    public double getCentreX() {
        return CentreX;
    }

    public double getR() {
        return R;
    }

    public double getCentreY() {
        return CentreY;
    }

    public void setCentreX(double centreX) {
        CentreX = centreX;
    }

    public void setCentreY(double centreY) {
        CentreY = centreY;
    }

    public void setR(double r) {
        R = r;
    }
}
