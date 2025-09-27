package Clases;

import java.util.Scanner;

public class Ejercicio7 {
    public static void ejercicio7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- 7. Conversión de Entero a Romano (1 al 10) ---");
        System.out.print("Ingrese un número entero del 1 al 10: ");

        if (!sc.hasNextInt()) {
            System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
            sc.next();
            return;
        }

        int numero = sc.nextInt();
        String romano;

        // Utilizando el condicional switch para la conversión directa hasta el 10
        switch (numero) {
            case 1:
                romano = "I";
                break;
            case 2:
                romano = "II";
                break;
            case 3:
                romano = "III";
                break;
            case 4:
                romano = "IV";
                break;
            case 5:
                romano = "V";
                break;
            case 6:
                romano = "VI";
                break;
            case 7:
                romano = "VII";
                break;
            case 8:
                romano = "VIII";
                break;
            case 9:
                romano = "IX";
                break;
            case 10:
                romano = "X";
                break;
            default:
                romano = "Número no válido. Debe estar entre 1 y 10.";
                break;
        }

        System.out.println("El número " + numero + " en Romano es: " + romano );
    }
}