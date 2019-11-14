package ru.bstu.iitus.vt41.dkv;

import java.util.Scanner;

public abstract class Product {
    protected String brand;
    protected String type;
    protected int cost;

    public abstract void init(Scanner scanner);

    public int getCost() {
        return cost;
    }

    public abstract boolean canBuyByCost(int money);

}

