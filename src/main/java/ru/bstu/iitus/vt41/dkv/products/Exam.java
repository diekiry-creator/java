package ru.bstu.iitus.vt41.dkv.products;

import ru.bstu.iitus.vt41.dkv.Product;
import ru.bstu.iitus.vt41.dkv.Util;

import java.util.Scanner;

public class Exam extends Product {
    protected int mark;

    public void init(Scanner scanner) {
        System.out.print("Предмет: ");
        type = scanner.next();
        System.out.print("Оценка: ");
        mark = Util.readInt(scanner);
        System.out.print("Цена: ");
        cost = Util.readInt(scanner);
    }

    public String toString() {
        return cost + " руб." + ", " + type + ", " + mark;
    }

    public boolean canBuyByCost(int money) {
        return true;
    }
}
