package Ejercicio1.Entidades;

public class Perro extends Animal{

    protected String alimento;
    protected String raza;
    protected String nombre;
    protected int edad;

    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
        this.nombre = nombre;
        this.alimento = alimento;
        this.raza = raza;
        this.edad = edad;
    }

    public void Alimentar(){
        System.out.println("Alimentando al perro " + this.nombre + " de raza " + this.raza + " con " + this.alimento);
    }

}
