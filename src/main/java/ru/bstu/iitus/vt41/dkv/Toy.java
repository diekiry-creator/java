package ru.bstu.iitus.vt41.dkv;

import java.util.Scanner;

public class Toy extends Product {
    protected int ageRating;

    public void init(Scanner scanner) {
        System.out.print("Бренд: ");
        brand = scanner.next();
        System.out.print("Тип: ");
        type = scanner.next();
        System.out.print("Возрастное ограничение: ");
        ageRating = scanner.nextInt();
        System.out.print("Цена: ");
        cost = scanner.nextInt();
    }

    public String toString() {
        return cost + " руб." + ",  " + brand + ", " + type  + ", " + ageRating + " ] ";
    }

    public boolean canBuyByCost(int money) {
        return money >= cost;
    }

    public boolean canBuyByAge(int age) {
        return age >= ageRating;
    }
}
