package ru.bstu.iitus.vt41.dkv.products;

import ru.bstu.iitus.vt41.dkv.Util;

import java.util.Scanner;

public class Camera extends Electronics {
    private float resolution;

    public void init(Scanner scanner) {
        type = "Камера";
        System.out.print("Бренд: ");
        brand = scanner.next();
        System.out.print("Модель: ");
        model = scanner.next();
        System.out.print("Серийный номер: ");
        serialNumber = scanner.next();
        System.out.print("Разрешение: ");
        resolution = Util.readFloat(scanner);
        System.out.print("Цена: ");
        cost = Util.readInt(scanner);
    }

    public String toString() {
        return super.toString() +  resolution + " Мп";
    }
}
