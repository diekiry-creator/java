package ru.bstu.iitus.vt41.dkv;

import java.util.Scanner;

public class Rubika extends Toy {
    private String form;

    public void init(Scanner scanner) {
        type = "Кубик-Рубика";
        System.out.print("Бренд: ");
        brand = scanner.next();
        System.out.print("Форма: ");
        form = scanner.next();
        System.out.print("Возрастное ограничение: ");
        ageRating = scanner.nextInt();
        System.out.print("Цена: ");
        cost = scanner.nextInt();
    }

    public String toString() {
        return super.toString() + ", " + form;
    }
}
