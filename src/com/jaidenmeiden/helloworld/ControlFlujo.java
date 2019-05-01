package com.jaidenmeiden.helloworld;

public class ControlFlujo {

    public static void main(String[] args) {
        //Control de flujo
        int q = 5;
        int p = 4;

        System.out.println("Control de flujo");
        System.out.println();
        System.out.println("If/else");
        if (q > p) {
            System.out.println("Es mayor!");
        } else {
            System.out.println("No es mayor!");
        }

        //Cambio de variable
        p++;

        if (q > p) {
            System.out.println("Es mayor!");
        } else if(q == p){
            System.out.println("Es igual!");
        } else {
            System.out.println("No es mayor y tampoco es igual!");
        }

        System.out.println();
        System.out.println("Switch");

        int mes = 12;
        String[] monthName = {"January", "February",
                "March", "April", "May", "June", "July",
                "August", "September", "October", "November",
                "December"};

        switch (mes) {
            case 1:
                System.out.println(monthName[mes - 1]);
                break;
            case 2:
                System.out.println(monthName[mes - 1]);
                break;
            case 3:
                System.out.println(monthName[mes - 1]);
                break;
            case 4:
                System.out.println(monthName[mes - 1]);
                break;
            case 5:
                System.out.println(monthName[mes - 1]);
                break;
            case 6:
                System.out.println(monthName[mes - 1]);
                break;
            case 7:
                System.out.println(monthName[mes - 1]);
                break;
            case 8:
                System.out.println(monthName[mes - 1]);
                break;
            case 9:
                System.out.println(monthName[mes - 1]);
                break;
            case 10:
                System.out.println(monthName[mes - 1]);
                break;
            case 11:
                System.out.println(monthName[mes - 1]);
                break;
            case 12:
                System.out.println(monthName[mes - 1]);
                break;
            default:
                System.out.println("No existe ese mes!");
                break;
        }

        System.out.println();

    }
}
