package ru.bstu.iitus.vt41.dkv;

public abstract class Toy extends Product {
    protected int ageRating;

    public int getRating() {
        return ageRating;
    }

    public boolean canBuyByAge(int age) {
        return age >= ageRating;
    }
}
