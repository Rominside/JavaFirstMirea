package ru.mirea.task5.opt3;

public abstract class furniture {
    protected double volume;
    protected double prise;

    public abstract String getVolume();

    public abstract String getPrise();

    public abstract void setVolume(double volume);

    public abstract void setPrise(double prise);

    public abstract String toString();
}