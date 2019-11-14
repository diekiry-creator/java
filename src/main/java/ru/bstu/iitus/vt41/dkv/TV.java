package ru.bstu.iitus.vt41.dkv;

import java.util.Scanner;

public class TV extends Electronics {
    private float diagonalSize;

    public void init(Scanner scanner) {
        type = "Телевизор";
        System.out.print("Бренд: ");
        brand = scanner.next();
        System.out.print("Модель: ");
        model = scanner.next();
        System.out.print("Серийный номер: ");
        serialNumber = scanner.next();
        System.out.print("Размер диагонали: ");
        diagonalSize = scanner.nextFloat();
        System.out.print("Цена: ");
        cost = scanner.nextInt();
    }

    public String toString() {
        return super.toString() +  diagonalSize + "\"";
    }
}
