package Extra3.Entidades;

import java.util.Scanner;

public class Hotel extends Alojamiento{

    private Scanner leer = new Scanner(System.in);

    protected int cantHabitaciones;
    protected int numCamas;
    protected int cantPisos;
    public Integer precioHabitacion;

    public Hotel (){
        super();
    }

    public Hotel(String nombre, String direccion, String localidad, String gerente, int cantHabitaciones,
                 int numCamas, int cantPisos) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
    }

    public void crearHotel(){
        System.out.println("Ingrese la cantidad de habitaciones: ");
        this.cantHabitaciones = leer.nextInt();
        System.out.println("Ingrese la cantidad de camas: ");
        this.numCamas = leer.nextInt();
        System.out.println("Ingrese la cantidad de pisos: ");
        this.cantPisos = leer.nextInt();
    }



    public void calcularPrecioHabitacion (){
        this.precioHabitacion = 50 + (this.cantHabitaciones*this.cantHabitaciones*this.numCamas);
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "cantHabitaciones=" + getCantHabitaciones() +
                ", numCamas=" + getNumCamas() +
                ", cantPisos=" + getCantPisos() +
                ", precioHabitacion=" + getPrecioHabitacion() +
                ", nombre='" + getNombre() + '\'' +
                ", direccion='" + getDireccion() + '\'' +
                ", localidad='" + getLocalidad() + '\'' +
                ", gerente='" + getGerente() + '\'' +
                '}';
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }
    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }
    public int getNumCamas() {
        return numCamas;
    }
    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }
    public int getCantPisos() {
        return cantPisos;
    }
    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }
    public Integer getPrecioHabitacion() {
        return precioHabitacion;
    }
    public void setPrecioHabitacion(Integer precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    protected void mostrarAlojamiento() {
    }

    protected void mostrarHotel() {
    }
}
