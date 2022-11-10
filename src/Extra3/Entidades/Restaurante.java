package Extra3.Entidades;
import java.util.Scanner;

public class Restaurante {

    public String nombre;
    private int capacidad;

    final static Scanner leer = new Scanner(System.in);

    public Restaurante(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public static Restaurante crearRestaurante (){
        System.out.println("Ingrese el nombre del restaurante");
        String nombre = leer.nextLine();
        System.out.println("Ingrese la capacidad del restaurante");
        int capacidad = leer.nextInt();
        return new Restaurante(nombre, capacidad);
    }

    public int valorAgregado() {

        if (this.capacidad < 30) {
            return 10;
        } else if (this.capacidad > 30 && this.capacidad < 50) {
            return 30;
        }else {
            return 50;
        }
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "nombre='" + nombre + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }

}


