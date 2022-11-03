package Ejercicio2;
import Ejercicio2.Entidades.Lavarropas;
import Ejercicio2.Entidades.Televisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String respuesta;

        do {
            System.out.println();
            System.out.println("Que quieres crear? 1. Lavarropas 2. Televisor 3. Salir");
            respuesta = leer.nextLine();

            if (respuesta.equals("1")) {
                Lavarropas lavarropas = new Lavarropas();
                lavarropas.crearLavarropas();
                lavarropas.precioFinal();
                System.out.println(lavarropas);
                System.out.println();

            } else if (respuesta.equals("2")) {
                Televisor televisor = new Televisor();
                televisor.crearTelevisor();
                televisor.precioFinal();
                System.out.println(televisor);
                System.out.println();
            }
        } while (!respuesta.equals("3"));

    }
}
