package ru.bstu.iitus.vt41.dkv;

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
        resolution = scanner.nextFloat();
        System.out.print("Цена: ");
        cost = scanner.nextInt();
    }

    public String toString() {
        return super.toString() +  resolution + " Мп";
    }
}
