package Ejercicio2.Entidades;
import java.util.Scanner;

public class Lavarropas extends Electrodomesticos{
    private Scanner leer = new Scanner(System.in);
    private int carga;

    public Lavarropas(){
    };

    public void crearLavarropas(){
        System.out.println("Creando un lavarropas:");
        creandoElectrodomesticos();
        System.out.println("Ingresa la carga que soporta el lavarropas: ");
        this.carga = leer.nextInt();
    }

    public void precioFinal() {
        super.precioFinal();
        precio = 1000 + this.precio + ((30 < this.carga) ? 500 : 0);
    }


    @Override
    public String toString() {
        return "Lavarropas{" +
                "Precio=" + getPrecio() +
                ", Color='" + getColor() + '\'' +
                ", ConsumoEnergetico=" + getConsumoEnergetico() +
                ", Peso=" + getPeso() +
                ", Carga=" + getCarga() +
                '}';
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return this.consumoEnergetico;
    }

    public void setConsumo(char consumo) {
        this.consumoEnergetico = consumo;
    }

    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getCarga() {
        return this.carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }



}

