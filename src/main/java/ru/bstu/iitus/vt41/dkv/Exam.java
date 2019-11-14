package ru.bstu.iitus.vt41.dkv;

import java.util.Scanner;

public class Exam extends Product {
    protected int mark;

    public void init(Scanner scanner) {
        System.out.print("Предмет: ");
        type = scanner.next();
        System.out.print("Оценка: ");
        mark = scanner.nextInt();
        System.out.print("Цена: ");
        cost = scanner.nextInt();
    }

    public String toString() {
        return cost + " руб." + ", " + type + ", " + mark;
    }

    public boolean canBuyByCost(int money) {
        return true;
    }
}
