package ru.bstu.iitus.vt41.dkv.products;

import ru.bstu.iitus.vt41.dkv.Product;
import ru.bstu.iitus.vt41.dkv.Util;

import java.util.Scanner;

public class Toy extends Product {
    protected int ageRating;

    public void init(Scanner scanner) {
        System.out.print("Бренд: ");
        brand = scanner.next();
        System.out.print("Тип: ");
        type = scanner.next();
        System.out.print("Возрастное ограничение: ");
        ageRating = Util.readInt(scanner);
        System.out.print("Цена: ");
        cost = Util.readInt(scanner);
    }

    public String toString() {
        return cost + " руб." + ",  " + brand + ", " + type  + ", " + ageRating;
    }

    public boolean canBuyByCost(int money) {
        return money >= cost;
    }

    public boolean canBuyByAge(int age) {
        return age >= ageRating;
    }
}
