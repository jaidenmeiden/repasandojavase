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
            System.out.println("d es igual " + d);
            d++;
        }while (d < 1);

        System.out.println();
        System.out.println("For");

        for(int f = 1; f <= 5; f++) {
            System.out.println("f es igual " + f);
        }

        System.out.println();
        System.out.println("For with array");

        int[] numeros = new int[5];
        for(int c = 1; c <= 5; c++) {
            numeros[c - 1] = c;
            System.out.println("numero[" + (c - 1) + "]: " + numeros[c - 1]);
        }

        System.out.println();
        System.out.println("For/each");

        for (int val: numeros) {
            System.out.println(val);
        }

    }
}
