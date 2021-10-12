package ru.mirea.task5.opt3;

public class bed extends furniture{
    public bed(double prise, double volume){
        this.prise = prise;
        this.volume = volume;
    }
    @Override
    public String getPrise() {
        return " bed prise " + this.prise;
    }

    @Override
    public String getVolume() {
        return " bed volume " + this.volume + "m^3";
    }

    @Override
    public void setPrise(double prise) {
        this.prise =prise;
    }

    @Override
    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "bed{" +
                "volume=" + volume +
                ", prise=" + prise +
                '}';
    }
}
