package ru.mirea.task5.opt3;

public class table extends furniture {
    public table(double prise, double volume){
        this.prise = prise;
        this.volume = volume;
    }
    @Override
    public String getPrise() {
        return "table prise " + this.prise;
    }

    @Override
    public String getVolume() {
        return " table volume " + this.volume + "m^3";
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
        return "table{" +
                "volume=" + volume +
                ", prise=" + prise +
                '}';
    }
}
