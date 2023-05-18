package ejercicioaerolineas;

import java.util.Scanner;

public class EjercicioAerolineas {

    public static void main(String[] args) {
        // Crear la matriz vuelos
        int vuelos[][] = new int[6][3];

        // Cargar
        Scanner teclado = new Scanner(System.in);

        for (int f = 0; f < 6; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese la cantidad de asientos para el destino: " + f + " horario: " + c);
                vuelos[f][c] = teclado.nextInt();
            }
        }

        // Venta de asientos
        Scanner teclado2 = new Scanner(System.in);
        String band = "";
        int destino, horario, asientos;

        while (!band.equalsIgnoreCase("finish")) {
            System.out.println("Ingresa en N° de destino");
            destino = teclado.nextInt();
            System.out.println("Ingresa el horario de vuelo");
            horario = teclado.nextInt();
            System.out.println("Ingresa la cantidad de asientos");
            asientos = teclado.nextInt();

            if ((destino >= 0 && destino <= 5) && (horario >= 0 && horario <= 2)) {
                if (vuelos[destino][horario] >= asientos) {
                    System.out.println("Su reserva fue realizada con éxito");
                    vuelos[destino][horario] -= asientos;
                } else {
                    System.out.println("Disculpe, no se puede completar su operación dado que no hay asientos disponibles");
                }
            } else {
                System.out.println("Información incorrecta, solo puede ingresar destinos del 0 al 5 y horarios del 0 al 2");
            }

            System.out.println("¿Desea continuar reservando?. Ingrese finish para terminar o cualquier otro valor para seguir");
            band = teclado2.next();
        }
    }

}
