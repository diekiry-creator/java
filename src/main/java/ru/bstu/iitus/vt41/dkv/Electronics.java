package ru.bstu.iitus.vt41.dkv;

import java.util.Scanner;

public abstract class Electronics extends Product {
    protected String model;
    protected String serialNumber;

    public void init(Scanner scanner) {
        System.out.print("Бренд: ");
        brand = scanner.next();
        System.out.print("Тип: ");
        type = scanner.next();
        System.out.print("Модель: ");
        model = scanner.next();
        System.out.print("Серийный номер: ");
        serialNumber = scanner.next();
        System.out.print("Цена: ");
        cost = scanner.nextInt();
    }

    public String toString() {
        return cost + " руб." + ", " + type + ", " + brand +  " " + model +  ", " + serialNumber +  ", ";
    }

    public boolean canBuyByCost(int money) {
        return money >= cost;
    }

    public boolean equalsSerialNumber(String _serialNumber) {
        return serialNumber.equals(_serialNumber);
    }
}
