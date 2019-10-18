package ru.bstu.iitus.vt41.dkv;

import java.util.Scanner;

public class Camera extends Electronics {
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
