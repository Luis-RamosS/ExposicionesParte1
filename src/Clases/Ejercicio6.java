package Clases;

import java.util.Scanner;

public class Ejercicio6 {

    private static double saldo = 1000.00;

    public static void ejercicio6() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\nSaldo actual: $" + String.format("%.2f", saldo));
            System.out.println("Seleccione una opción:");
            System.out.println("1. Consultar dinero");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Opción: ");


            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.printf("Tu saldo actual es: $%.2f%n", saldo);
                        break;
                    case 2:
                        System.out.print("Ingrese la cantidad a depositar (máx. $1000.00): $");
                        if (sc.hasNextDouble()) {
                            double cantidad = sc.nextDouble();

                            if (cantidad < 0) {
                                System.err.println("Error: No puede depositar una cantidad negativa.");
                            }

                            else if (cantidad > 1000.00) {
                                System.err.println("Error: La cantidad máxima a depositar en una sola transacción es $1000.00.");
                            }
                            else {
                                saldo += cantidad;
                                System.out.printf("Depósito exitoso. Nuevo saldo: $%.2f%n", saldo);
                            }
                        } else {
                            System.err.println("Error: Cantidad no válida.");
                            sc.next();
                        }
                        sc.nextLine();
                        break;
                    case 3:
                        System.out.print("Ingrese la cantidad a retirar: $");
                        if (sc.hasNextDouble()) {
                            double cantidad = sc.nextDouble();

                            if (cantidad < 0) {
                                System.err.println("Error: No puede retirar una cantidad negativa.");
                            }

                            else if (cantidad > saldo) {
                                System.err.println("Error: Saldo insuficiente. No se puede retirar esa cantidad.");
                            }
                            else {
                                saldo -= cantidad;
                                System.out.printf("Retiro exitoso. Nuevo saldo: $%.2f%n", saldo);
                            }
                        } else {
                            System.err.println("Error: Cantidad no válida.");
                            sc.next();
                        }
                        sc.nextLine();
                        break;
                    case 4:
                        System.out.println("Gracias por usar nuestros servicios. ¡Hasta pronto!");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, ingrese un número del 1 al 4.");
                        break;
                }
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                sc.next();
                opcion = 0;
            }
        }
    }
}