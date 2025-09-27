package Clases;

import java.util.Scanner;

public class Ejercicio4 {
    public static void ejercicio4() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un color (Rojo, Verde, Azul): ");

        String color = sc.nextLine().toLowerCase().trim();
        String mensaje;

        switch (color) {
            case "rojo":
            case "verde":
            case "azul":
                mensaje = "¡'" + color + "' es un color primario de la luz!";
                break;
            default:
                mensaje = "'" + color + "' no es un color primario de la luz (Rojo, Verde, Azul).";
                break;
        }
        System.out.println(mensaje);
    }
}