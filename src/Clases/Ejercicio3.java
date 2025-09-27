package Clases;

import java.util.Scanner;

public class Ejercicio3 {
    public static void ejercicio3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un solo carácter (una letra): ");


        String entrada = sc.nextLine().toLowerCase().trim();


        char caracter = entrada.charAt(0);

        switch (caracter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("El carácter '" + caracter + "' es una **vocal**.");
                break;
            default:
                System.out.println("El carácter '" + caracter + "' es una **consonante**.");
                break;
        }
    }
}