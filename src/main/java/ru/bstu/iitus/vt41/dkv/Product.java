package ru.bstu.iitus.vt41.dkv;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public abstract class Product {
    protected String brand;
    protected int cost;

    public abstract String toString();

    public abstract void init(Scanner scanner);

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

abstract class Milky extends Product {
    protected Calendar eatDate;

    public Calendar getEatDate() {
        return eatDate;
    }

    public boolean canBuyByDate(Calendar date) {
        return eatDate.compareTo(date) >= 0;
    }
}

class Cheese extends Milky {
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

abstract class Electronics extends Product {
    protected String model;
    protected String serialNumber;

    public String getModel() {
        return model;
    }
    public boolean equalsSerialNumber(String _serialNumber) {
        return serialNumber.equals(_serialNumber);
    }
}

class TV extends Electronics {
    private float diagonalSize;

    @Override
    public void init(Scanner scanner) {
        System.out.print("Brand: ");
        brand = scanner.next();
        System.out.print("Model: ");
        model = scanner.next();
        System.out.print("Serial number: ");
        serialNumber = scanner.next();
        System.out.print("Diagonal size: ");
        diagonalSize = scanner.nextFloat();
        System.out.print("Cost: ");
        cost = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Телевизор [ " + brand +  " " + model +  ", " + serialNumber +  ", " +  diagonalSize + "\" ] " +
                cost + " руб.";
    }
}

class Camera extends Electronics {
    private float resolution;

    @Override
    public void init(Scanner scanner) {
        System.out.print("Brand: ");
        brand = scanner.next();
        System.out.print("Model: ");
        model = scanner.next();
        System.out.print("Serial number: ");
        serialNumber = scanner.next();
        System.out.print("Resolution: ");
        resolution = scanner.nextFloat();
        System.out.print("Cost: ");
        cost = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Камера [ " + brand +  " " + model +  ", " + serialNumber +  ", " +  resolution + " Мп ] " +
                cost + " руб.";
    }
}
