package Extra2.Servicios;
import Extra2.Entidades.*;

import java.util.ArrayList;
import java.util.Scanner;

public class CreadorEdificios2 {

    private Scanner leer = new Scanner(System.in);
    public void creandoEdificios () {

        ArrayList<Edificio2> edificios = new ArrayList<>();

        int opcion;

        do {
            System.out.println("Que edificio quieres crear?");
            System.out.println("1. Polideportivo");
            System.out.println("2. Edificio de oficinas");
            System.out.println("3. Salir");
            opcion = leer.nextInt();

            if (opcion == 1) {
                Polideportivo2 polideportivo = new Polideportivo2();
                polideportivo.datosPolideportivo();
                polideportivo.calcularSuperficie();
                polideportivo.calcularVolumen();
                edificios.add(polideportivo);
            }
            if (opcion == 2) {
                Oficinas2 oficinas2 = new Oficinas2();
                oficinas2.datosOficinas2();
                oficinas2.calcularSuperficie();
                oficinas2.calcularVolumen();
                oficinas2.calcularPersonas();
                edificios.add(oficinas2);
            }

        }while (opcion != 3 && edificios.size() < 1);

        for (Edificio2 edificio : edificios) {
            if (edificio instanceof Polideportivo2) {
                edificio.datosFinal();
            }
        }

        for (Edificio2 edificio : edificios) {
            if (edificio instanceof Oficinas2) {
                edificio.datosFinal();
            }
        }
    }
}
