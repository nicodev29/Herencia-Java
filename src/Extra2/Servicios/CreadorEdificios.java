package Extra2.Servicios;
import Extra2.Entidades.Edificio;
import Extra2.Entidades.EdificioDeOficinas;
import Extra2.Entidades.Polideportivo;
import java.util.ArrayList;
public class CreadorEdificios {
    public CreadorEdificios() {

        ArrayList<Edificio> edificios = new ArrayList<>();

        edificios.add(new Polideportivo(25, 75, 25, "Polideportivo General Paz", true));
        edificios.add(new Polideportivo(30, 90, 25, "Polideportivo Altas cumbres", false));
        edificios.add(new EdificioDeOficinas(20, 15, 10, "Apple Park", 15, 5, 10));
        edificios.add(new EdificioDeOficinas(25, 20, 15, "Samsung Tower", 20, 10, 15));

        for (Edificio edificio : edificios) {
            if (edificio instanceof Polideportivo) {
                edificio.calcularSuperficie();
                edificio.calcularVolumen();

                if (((Polideportivo) edificio).getTechado()) {
                    System.out.println("El " + ((Polideportivo) edificio).getNombre() + " es techado");
                    System.out.println();
                } else {
                    System.out.println("El " + ((Polideportivo) edificio).getNombre() + " no es techado");
                    System.out.println();
                }
            }
        }

        //mostrar solo los edificios de oficinas
        for (Edificio edificio : edificios) {
            if (edificio instanceof EdificioDeOficinas) {
                edificio.calcularSuperficie();
                edificio.calcularVolumen();
                edificio.calcularPersonas();
                System.out.println();
            }
        }
    }
}
