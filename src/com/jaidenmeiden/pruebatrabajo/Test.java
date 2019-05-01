package com.jaidenmeiden.pruebatrabajo;

public class Test {
    public static void main(String[] args) {
        System.out.println("Valor: " + metodoQuehaceAlgo(5));
        arreglos();
        System.out.println(metodoRaro());
    }

    public static int metodoQuehaceAlgo(int valor) {
        if (valor < 3) {
            return valor;
        } else {
            return metodoQuehaceAlgo(valor - 1) * metodoQuehaceAlgo(valor - 2);
        }
    }

    public static void arreglos() {
        int arreglo[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(arreglo[arreglo[arreglo[5]]]);
    }

    public static String metodoRaro() {
        int[] lista= {8,9,3};
        int n = lista.length;
        String[] simbolo = new String[n];
        int i,j,aux,izq, der, m;

        for (i = 1; i < n; i++){
            aux = lista[i];
            izq= 0;
            der = i - 1;
            while(izq <= der){
                m = ((izq + der) / 2);
                if(aux < lista[m]){
                    der = m - 1;
                    simbolo[i - 1] = "-";
                } else {
                    izq = m + 1;
                    simbolo[i - 1] = "+";
                }
            }
            j = i - 1;
            while (j >= izq){
                lista[j + 1] = lista[j];
                j = j - 1;
            }
            lista[izq] = aux;
        }
        simbolo[i - 1] = "$";

        String salida = "";
        for (i = 0; i < n; i++){
            salida += lista[i] + simbolo[i];
        }

        return salida;
    }
}
