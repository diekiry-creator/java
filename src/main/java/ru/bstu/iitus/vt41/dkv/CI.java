package ru.bstu.iitus.vt41.dkv;

import java.util.Scanner;

public class CI extends Exam {
    private String senseiName;

    public void init(Scanner scanner) {
        type ="Интерфейсы вычислительных систем";
        System.out.print("Имя сенсея: ");
        type = scanner.next();
        System.out.print("Оценка: ");
        mark = scanner.nextInt();
        System.out.print("Цена: ");
        cost = scanner.nextInt();
    }

    public String toString() {
        return super.toString() + " - " + senseiName;
    }
}
