package Extra3.Servicios;
import Extra3.Entidades.*;
import Extra3.Enum.MenuPrincipal;

import java.util.ArrayList;
import java.util.Scanner;


public class ServiciosMenu {

    static ArrayList<Alojamiento> alojamientos = new ArrayList<>();
    private static Scanner leer = new Scanner(System.in);
    public static void Menu() {
        String respuesta;
        System.out.println();
        System.out.println("Bienvenido al sistema de gestión de Hoteles");
        System.out.println();

        do {
            System.out.println("1. Alta de Alojamiento");
            System.out.println("2. Baja de Alojamiento");
            System.out.println("3. Mostrar todos los Alojamientos");
            System.out.println("4. Mostrar de mas caro a mas barato");
            System.out.println("5. Mostrar Hoteles con descuento");
            System.out.println("6. Volver al menu principal");
            System.out.println("7. Salir");
            respuesta = leer.nextLine();

            if (respuesta.equals("1")) {
                System.out.println("Que tipo de Alojamiento quieres dar de alta?");
                System.out.println("1. Hotel Cuatro Estrellas ");
                System.out.println("2. Hotel Cinco Estrellas");

                respuesta = leer.nextLine();
                if (respuesta.equals("1")) {
                    Hotel4Estrellas H4E = new Hotel4Estrellas();
                    H4E.crearHotel4Estrellas();
                    alojamientos.add(H4E);
                    System.out.println("Alojamiento agregado con exito");
                } else if (respuesta.equals("2")) {
                    Hotel5Estrellas H5E = new Hotel5Estrellas();
                    H5E.crearHotel5Estrellas();
                    alojamientos.add(H5E);
                    System.out.println("Alojamiento agregado con exito");
                }else {
                    System.out.println("Opcion incorrecta");
                }
            }
            //Baja de Alojamiento
            if (respuesta.equals("2")) {
                for (int i = 0; i < alojamientos.size(); i++) {
                    System.out.println(i + ". " + alojamientos.get(i).getNombre());
                }
                System.out.println("Ingresa el nombre del Alojamiento que quieras dar de baja");
                respuesta = leer.nextLine();
                for (int i = 0; i < alojamientos.size(); i++) {
                    if (alojamientos.get(i).getNombre().equals(respuesta)) {
                        alojamientos.remove(i);
                        System.out.println("Alojamiento dado de baja con exito");
                    }
                }
            }
            //mostrar alojamientos
            if (respuesta.equals("3")) {
                for (int i = 0; i < alojamientos.size(); i++) {
                    System.out.println(alojamientos.get(i));
                }
            }
            //ordenando alojamientos
            if (respuesta.equals("4")) {
                for (int i = 0; i < alojamientos.size(); i++)
                    alojamientos.stream()
                            .filter(x -> x instanceof Hotel)
                            .sorted((o1, o2) -> o2.getPrecioHabitacion().compareTo(o1.getPrecioHabitacion()))
                            .forEach(System.out::println);
            }
            //mostrar alojamientos con descuento
            if (respuesta.equals("5")) {
                for (int i = 0; i < alojamientos.size(); i++)
                   if (alojamientos.get(i).getDescuento() > 0) {
                       System.out.println(alojamientos.get(i));
                   }
            }

                else if (respuesta.equals("6")) {
                    MenuPrincipal.Menu();
                }

            } while (!respuesta.equals("7")) ;
                System.out.println("Gracias por usar el sistema");
    }
}