package ru.bstu.iitus.vt41.dkv.products;

import ru.bstu.iitus.vt41.dkv.Util;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Cheese extends Milky {
    private String cheeseName;

    public void init(Scanner scanner) {
        type = "Сыр";
        System.out.print("Бренд: ");
        brand = scanner.next();
        System.out.print("Название сыра: ");
        cheeseName = scanner.next();
        System.out.print("Срок годности:\n");
        System.out.print("день:\n"); int day  = Util.readInt(scanner);
        System.out.print("месяц:\n"); int mouth = Util.readInt(scanner);
        System.out.print("год:\n");int year = Util.readInt(scanner);
        eatDate = new GregorianCalendar(year, mouth - 1, day);
        System.out.print("Цена: ");
        cost = Util.readInt(scanner);
    }

    public String toString() {
        return super.toString() + ", " + cheeseName;
    }
}
