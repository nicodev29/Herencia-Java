package Ejercicio2.Entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicioCreadorElectrodomesticos  {
    public void ServicioCreadorElectrodomesticos(){


        Scanner leer = new Scanner(System.in);
        String respuesta;

        ArrayList<Electrodomesticos> listaElectrodomesticos = new ArrayList<>();

        do {
            System.out.println();
            System.out.println("Que quieres crear?");
            System.out.println("1. Lavarropas 2. Televisor 3. Salir");
            respuesta = leer.nextLine();

            if (respuesta.equals("1")) {
                Lavarropas lavarropas = new Lavarropas();
                lavarropas.crearLavarropas();
                listaElectrodomesticos.add(lavarropas);

            } else if (respuesta.equals("2")) {
                Televisor televisor = new Televisor();
                televisor.crearTelevisor();
                listaElectrodomesticos.add(televisor);
            }

        } while (!respuesta.equals("3") && listaElectrodomesticos.size() < 4);
        System.out.println("Saliendo...");

        for (int i = 0 ; i < listaElectrodomesticos.size() ; i++) {
            listaElectrodomesticos.get(i).precioFinal();
            System.out.println(listaElectrodomesticos.get(i));
        }

        float total_lavadora = 0;
        float total_televisor = 0;
        String nombre;
        for (int i = 0; i < listaElectrodomesticos.size(); i++) {
            nombre = listaElectrodomesticos.get(i).getClass().getSimpleName();
            total_lavadora = total_lavadora + (nombre.equals("Lavarropas") ? listaElectrodomesticos.get(i).getPrecio() : 0);
            total_televisor = total_televisor + (nombre.equals("Televisor") ? listaElectrodomesticos.get(i).getPrecio() : 0);
        }
        System.out.println("El total de Lavarropas es: " + total_lavadora);
        System.out.println("El total de Televisores es: " + total_televisor);
        System.out.println("EL total general es: " + (total_lavadora + total_televisor));
    }

    }

