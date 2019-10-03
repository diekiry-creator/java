package ru.bstu.iitus.vt41.dkv;

import java.util.Scanner;

abstract class Product {
    protected String brand;
    protected int cost;

    public abstract String toString();

    public abstract int init(Scanner scanner);

    public int getCost() {
        return cost;
    }

    public boolean canBuyByCost(int money) {
        return money >= cost;
    }

}

abstract class Toy extends Product {
    protected int ageRating;

    public int getRating() {
        return ageRating;
    }

    public boolean canBuyByAge(int age) {
        return age >= ageRating;
    }
}

class Rubika extends Toy {
    private String form;

    @Override
    public int init(Scanner scanner) {
        System.out.print("Brand: ");
        brand = scanner.next();
        System.out.print("Form: ");
        form = scanner.next();
        System.out.print("Age rating: ");
        ageRating = scanner.nextInt();
        System.out.print("Cost: ");
        cost = scanner.nextInt();
        return 0;
    }

    @Override
    public String toString() {
        return "Игрушка Кубик Рубика [ " +
                brand + ", " + form  + ", " + ageRating + "+ ] " +
                cost + " руб.";
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product product = new Rubika();

        product.init(scanner);

        System.out.println(product.toString());
    }
}
