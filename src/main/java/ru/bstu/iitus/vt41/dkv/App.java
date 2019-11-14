package ru.bstu.iitus.vt41.dkv;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList;

@Log4j2
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Количество товаров: ");
        int numProducts = Util.readInt(scanner);

        LinkedList<Product> productList = new LinkedList<Product> ();
        String tmp = "";

        int minCost = Integer.MAX_VALUE;
        int minCostIndex = 0;
        ProductType productType;
        System.out.println("Товары: " + Arrays.toString (ProductType.values ()));
        for (int i = 0; i < numProducts; i++) {
            System.out.print("* Наименование товара: ");
            tmp = scanner.next();
            try {
                productList.add(ProductType.valueOf(tmp).factoryMethod());
                productList.getLast().init(scanner);
            } catch (Exception e) {
                System.out.print("Неверное наименование товара.\n");
                log.error("Введено неверное наименование товара: " + tmp);
            }

            if (minCost > productList.get(0).getCost()) {
                minCost = productList.get(0).getCost();
                minCostIndex = i;
            }
        }
        scanner.close ();

        System.out.print("Самый дешевый товар: " + productList.get (minCostIndex).toString ());
    }
}
