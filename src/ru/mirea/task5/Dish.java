package ru.mirea.task5;

public abstract class Dish {
    protected Boolean clean;
    public abstract  void ToWashTheDishes();
    public abstract void UseDishes();
    public abstract String ReturnSize();
    public Boolean getClean() {
        return clean;
    }
}
