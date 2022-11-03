package Ejercicio2.Entidades;

import java.util.Scanner;

public class Electrodomesticos {

    Scanner leer = new Scanner(System.in);

    protected float precio;
    protected String color;
    protected char consumoEnergetico;
    protected int peso;

    public Electrodomesticos() {
    }

    public Electrodomesticos(float precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }


    public char comprobarConsumoEnergetico(char letra){
        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F'){
            return letra;
        }else{
            return 'F';
        }
    }

    public void comprobarColor (String color) {
        String colores_aceptados = color.toLowerCase();
            if (colores_aceptados.equals("negro")  ||
                colores_aceptados.equals("rojo")   ||
                colores_aceptados.equals("azul")   ||
                colores_aceptados.equals("blanco") ||
                colores_aceptados.equals("gris")) {
            this.color = colores_aceptados;
        } else {
            System.out.println("Ingresaste un color no valido, se asignara el color blanco");
            this.color = "blanco";
        }
    }

    public void pesoElectrodomestico(int peso){
        this.peso = peso;
    }


    public void creandoElectrodomesticos(){
        System.out.println("Ingrese el consumo: A - B - C - D");
        this.comprobarConsumoEnergetico(leer.next().charAt(0));
        System.out.println("Ingrese el color: ");
        leer.nextLine();
        this.comprobarColor(leer.nextLine());
        System.out.println("Ingrese el peso: ");
        this.pesoElectrodomestico(leer.nextInt());
    }

    public void precioFinal() {
        this.precio = this.precio +
                (this.consumoEnergetico == 'A' ? 1000 : 0) +
                (this.consumoEnergetico == 'B' ? 800 : 0) +
                (this.consumoEnergetico == 'C' ? 600 : 0) +
                (this.consumoEnergetico == 'D' ? 500 : 0) +
                (this.consumoEnergetico == 'E' ? 300 : 0) +
                (this.consumoEnergetico == 'F' ? 100 : 0) +
                (1 <= this.peso && this.peso <= 19 ? 100 : 0) +
                (20 <= this.peso && this.peso <= 49 ? 500 : 0) +
                (50 <= this.peso && this.peso <= 79 ? 800 : 0) +
                (80 <= this.peso ? 1000 : 0);
    }


    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomesticos{" +
                ", Precio=" + precio +
                ", Color='" + color + '\'' +
                ", ConsumoEnergetico=" + consumoEnergetico +
                ", Peso=" + peso +
                '}';
    }
}
