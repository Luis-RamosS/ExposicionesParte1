package Clases;

import java.util.Scanner;

public class Ejercicio5 {
    public static void ejercicio5() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione la mascota que desea adoptar:");
        System.out.println("1. Perro");
        System.out.println("2. Gato");
        System.out.println("3. Hámster");
        System.out.print("Ingrese un número del 1 al 3: ");


        int eleccion = sc.nextInt();

        switch (eleccion) {
            case 1:
                System.out.println("Mensaje de Adopción: Has adoptado un/una perro. ¡Felicidades!");
                break;
            case 2:
                System.out.println("Mensaje de Adopción: Has adoptado un/una gato. ¡Felicidades!");
                break;
            case 3:
                System.out.println("Mensaje de Adopción: Has adoptado un/una hamster. ¡Felicidades!");
                break;
            default:
                System.out.println("Opción no válida. Por favor, ingrese un número del 1 al 3.");
                break;
        }



    }
}