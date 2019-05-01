package com.jaidenmeiden.helloworld;

public class Bucles {
    public static void main(String[] args) {
        System.out.println("Bucles!");
        System.out.println();
        System.out.println("While");

        int e = 1;
        while (e <= 5) {
            System.out.println("e es igual " + e);
            e++;
        }

        System.out.println();
        System.out.println("Do/while");

        int d = 1;
        do {
            System.out.println("e es igual " + d);
            d++;
        }while (d < 1);

    }
}
