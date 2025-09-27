package Clases;

import java.util.Scanner;

public class Ejercicio2 {
    public static void ejercicio2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero del 1 al 12: ");


        int mes = sc.nextInt();
        String nombreMes;

        switch (mes) {
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Número no válido. Debe estar entre 1 y 12.";
                break;
        }
        if(mes<1||mes>12 ) {
            System.out.println(nombreMes);
        }
        else{
            System.out.println("El mes es: " + nombreMes);
        }

    }
}