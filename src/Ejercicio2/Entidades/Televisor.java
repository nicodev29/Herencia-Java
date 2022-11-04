package Ejercicio2.Entidades;
import java.util.Scanner;

public class Televisor extends Electrodomesticos {
    private Scanner scanner = new Scanner(System.in);
    protected int resolucion;
    protected String sintonizador;


    public Televisor (){
    }

    public Televisor(float precio, String color, char consumoEnergetico, int peso, int resolucion, String sintonizador) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = (int) precio;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void consumoEnergetico(char consumo) {
        this.consumoEnergetico = consumo;
    }

    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getResolucion() {
        return this.resolucion;
    }

    public void crearTelevisor() {
        System.out.println("Creando un Televisor");
        creandoElectrodomesticos();
        System.out.println("Ingrese las pulgadas del televisor");
        this.resolucion = Integer.parseInt(scanner.nextLine());
        System.out.println("Tiene sintonizador? (si / no)");
        this.sintonizador = scanner.nextLine();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        precio = 1000 + (float) (this.precio +
                (this.resolucion > 40 ? this.precio * 0.3 : 0))
                + (this.sintonizador.equals("si") ? 500 : 0);
    }

    @Override
    public String toString() {
        return "{" +
                " precio='" + getPrecio() + "'" +
                ", color='" + getColor() + "'" +
                ", consumo=" + getConsumoEnergetico() +
                ", peso='" + getPeso() + "'" +
                ", resolución='" + getResolucion() + "'" +
                "}";
    }



}

