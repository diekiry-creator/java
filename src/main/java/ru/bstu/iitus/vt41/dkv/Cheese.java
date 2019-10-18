package ru.bstu.iitus.vt41.dkv;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Cheese extends Milky {
    private String name;

    @Override
    public void init(Scanner scanner) {
        System.out.print("Brand: ");
        brand = scanner.next();
        System.out.print("Name: ");
        name = scanner.next();
        System.out.print("Eat date [day.mouth.year]:\n ");
        int day  = scanner.nextInt();
        int mouth = scanner.nextInt();
        int year = scanner.nextInt();
        eatDate = new GregorianCalendar(year, mouth - 1, day);
        System.out.print("Cost: ");
        cost = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Сыр [ " +
                brand + ", " + name + ", " + eatDate.get(Calendar.DATE) + "." + (eatDate.get(Calendar.MONTH) + 1) + "." + eatDate.get(Calendar.YEAR) + " ] " +
                cost + " руб.";
    }
}
