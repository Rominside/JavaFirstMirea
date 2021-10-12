package ru.mirea.task5.opt3;

public class pillow extends furniture{
    public pillow(double volume, double prise){
        this.prise = prise;
        this.volume = volume;
    }
    @Override
    public String getPrise() {
        return " pillow prise " + this.prise;
    }

    @Override
    public String getVolume() {
        return " pillow volume " + this.volume + "m^3";
    }

    @Override
    public void setPrise(double prise) {
        this.prise = prise;
    }

    @Override
    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "pillow{" +
                "volume=" + volume +
                ", prise=" + prise +
                '}';
    }
}
