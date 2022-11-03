package Ejercicio1.Entidades;

public class Caballo extends Animal{

    protected String nombre;
    protected String alimento;
    protected String raza;
    protected int edad;

    public Caballo (String nombre, String alimento, int edad, String raza){
        super(nombre, alimento, edad, raza);
        this.nombre = nombre;
        this.alimento = alimento;
        this.raza = raza;
        this.edad = edad;
    }

    public void Alimentar(){
        System.out.println("Alimentando al caballo "+ this.nombre + " de raza " + this.raza + " con " + this.alimento);
    }

}

