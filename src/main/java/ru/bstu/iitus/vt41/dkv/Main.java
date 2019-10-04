package ru.bstu.iitus.vt41.dkv;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Количество товаров: ");
        int numProducts = scanner.nextInt();
        Product[] products = new Product[numProducts];

        int minCost = Integer.MAX_VALUE;
        int minCostPos = 0;
        for (int i = 0; i < numProducts; i++) {
            System.out.print("Категория товара: ");
            switch (scanner.nextInt()) {
                case 1: {
                    System.out.print("Вид игрушки: ");
                    switch (scanner.nextInt()) {
                        case 1:
                            products[i] = new Rubika();
                            break;
                        default:
                            break;
                    }
                    break;
                }
                case 2: {
                    System.out.print("Вид молочной продукции: ");
                    switch (scanner.nextInt()) {
                        case 1:
                            products[i] = new Cheese();
                            break;
                        default:
                            break;
                    }
                    break;
                }
                case 3: {
                    System.out.print("Вид техники: ");
                    switch (scanner.nextInt()) {
                        case 1:
                            products[i] = new TV();
                            break;
                        case 2:
                            products[i] = new Camera();
                            break;
                        default:
                            break;
                    }
                    break;
                }
                default:
                    break;
            }

            products[i].init(scanner);
            if (minCost > products[i].getCost())
            {
                minCost = products[i].getCost();
                minCostPos = i;
            }
        }
        System.out.print("Самый дешевый товар: " + products[minCostPos].toString());
    }
}
