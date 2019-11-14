package ru.bstu.iitus.vt41.dkv.products;

import ru.bstu.iitus.vt41.dkv.Util;
import ru.bstu.iitus.vt41.dkv.products.Electronics;

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
        diagonalSize = Util.readFloat(scanner);
        System.out.print("Цена: ");
        cost = Util.readInt(scanner);
    }

    public String toString() {
        return super.toString() +  diagonalSize + "\"";
    }
}
