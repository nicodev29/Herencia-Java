package Extra3.Entidades;

import java.util.Scanner;
public abstract class Alojamiento {
    private Scanner leer = new Scanner(System.in);

    public String nombre;
    public String direccion;
    public String localidad;
    public String gerente;
    public int descuento;

    public Alojamiento (String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
        this.descuento = descuento;

    }

    public void crearAlojamiento(){
        System.out.println("Ingresa el nombre del Hotel");
        nombre = leer.nextLine();
        System.out.println("Ingrese la direccion del Hotel");
        direccion = leer.nextLine();
        System.out.println("Ingrese la localidad del Hotel");
        localidad = leer.nextLine();
        System.out.println("Ingrese el nombre del Gerente");
        gerente = leer.nextLine();
    }

    public int getDescuento() {
        return descuento;
    }
    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    public Alojamiento() {
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getLocalidad() {
        return localidad;
    }
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    public String getGerente() {
        return gerente;
    }
    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
    @Override
    public String toString() {
        return "Alojamiento{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", gerente='" + gerente + '\'' +
                '}';
    }
    public Integer getPrecioHabitacion() {
        return getPrecioHabitacion();
    }

}
