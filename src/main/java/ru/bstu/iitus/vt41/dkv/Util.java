package ru.bstu.iitus.vt41.dkv;

import java.util.GregorianCalendar;
import java.util.Scanner;

public interface Util {
    static int readInt (Scanner scanner) {
        while (!scanner.hasNextInt ()) {
            scanner.next ();
            System.out.println ("Введите целое число!");
        }
        return scanner.nextInt ();
    }

    static float readFloat (Scanner scanner) {
        while (!scanner.hasNextFloat ()) {
            scanner.next ();
            System.out.println ("Введите число!");
        }
        return scanner.nextFloat ();
    }
}