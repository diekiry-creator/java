package ru.bstu.iitus.vt41.dkv.products;

import ru.bstu.iitus.vt41.dkv.Product;
import ru.bstu.iitus.vt41.dkv.Util;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Milky extends Product {
    protected Calendar eatDate;

    public boolean canBuyByDate(Calendar date) {
        return eatDate.compareTo(date) >= 0;
    }

    public void init(Scanner scanner) {
        System.out.print("Бренд: ");
        brand = scanner.next();
        System.out.print("Тип: ");
        type = scanner.next();
        System.out.print("Срок годности [день.месяц.год]:\n");
        System.out.print("день:\n"); int day  = Util.readInt(scanner);
        System.out.print("месяц:\n"); int mouth = Util.readInt(scanner);
        System.out.print("год:\n");int year = Util.readInt(scanner);
        eatDate = new GregorianCalendar(year, mouth - 1, day);
        System.out.print("Цена: ");
        cost = Util.readInt(scanner);
    }

    public boolean canBuyByCost(int money) {
        return money >= cost;
    }

    public String toString() {
        return cost + " руб."  + ", " + brand + ", " + ", " + type + ", " +
                eatDate.get(Calendar.DATE) + "." + (eatDate.get(Calendar.MONTH) + 1) + "." + eatDate.get(Calendar.YEAR);
    }
}
