package Extra3.Entidades;

import java.util.Scanner;

public class Residencias extends ExtraHotelero{

    private Scanner leer = new Scanner(System.in);
    private int cantHabitaciones;
    private String descuento;
    private boolean campoDeportivo;

    public Residencias(String nombre, String direccion, String localidad, String gerente, boolean privado, int metrosCuadrados) {
        super(nombre, direccion, localidad, gerente, privado, metrosCuadrados);
    }

    public Residencias() {
        super();
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }
    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }
    public String isDescuento() {
        return descuento;
    }
    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }
    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }
    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencias{" +
                "cantHabitaciones=" + cantHabitaciones +
                ", descuento=" + descuento +
                ", campoDeportivo=" + campoDeportivo +
                '}';
    }

}
