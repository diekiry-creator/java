package ru.bstu.iitus.vt41.dkv;

import ru.bstu.iitus.vt41.dkv.products.Camera;
import ru.bstu.iitus.vt41.dkv.products.Cheese;
import ru.bstu.iitus.vt41.dkv.products.Rubika;
import ru.bstu.iitus.vt41.dkv.products.TV;

import javax.xml.transform.Result;
import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList;

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
                productType = ProductType.valueOf(tmp);
                productList.add(productType.factoryMethod());
                productList.getLast().init(scanner);
            } catch (RuntimeException e) {
                System.out.print("Товар отстутствует.\n");
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
