package ru.bstu.iitus.vt41.dkv;

import java.util.Scanner;

public class Rubika extends Toy {
    private String form;

    @Override
    public void init(Scanner scanner) {
        System.out.print("Brand: ");
        brand = scanner.next();
        System.out.print("Form: ");
        form = scanner.next();
        System.out.print("Age rating: ");
        ageRating = scanner.nextInt();
        System.out.print("Cost: ");
        cost = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Кубик Рубика [ " +
                brand + ", " + form  + ", " + ageRating + "+ ] " +
                cost + " руб.";
    }
}
