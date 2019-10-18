package ru.bstu.iitus.vt41.dkv;

import java.util.Scanner;

public abstract class Product {
    protected String brand;
    protected int cost;

    public abstract String toString();

    public abstract void init(Scanner scanner);

    public int getCost() {
        return cost;
    }

    public boolean canBuyByCost(int money) {
        return money >= cost;
    }

}

