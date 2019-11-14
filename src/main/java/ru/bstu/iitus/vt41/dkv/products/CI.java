package ru.bstu.iitus.vt41.dkv.products;

import lombok.Getter;
import lombok.Setter;
import ru.bstu.iitus.vt41.dkv.Util;

import java.util.Scanner;

@Getter
@Setter
public class CI extends Exam {
    private String senseiName;

    public void init(Scanner scanner) {
        type ="Интерфейсы вычислительных систем";
        System.out.print("Имя сенсея: ");
        type = scanner.next();
        System.out.print("Оценка: ");
        mark = Util.readInt(scanner);
        System.out.print("Цена: ");
        cost = Util.readInt(scanner);
    }

    public String toString() {
        return super.toString() + " - " + senseiName;
    }
}
