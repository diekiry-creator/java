package ru.bstu.iitus.vt41.dkv;

import java.util.Calendar;
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
        System.out.print("Срок годности [день.месяц.год]:\n");
        int day  = scanner.nextInt();
        int mouth = scanner.nextInt();
        int year = scanner.nextInt();
        eatDate = new GregorianCalendar(year, mouth - 1, day);
        System.out.print("Цена: ");
        cost = scanner.nextInt();
    }

    public String toString() {
        return super.toString() + ", " + cheeseName;
    }
}
