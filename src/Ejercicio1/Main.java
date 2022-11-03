package Ejercicio1;
import Ejercicio1.Entidades.Animal;
import Ejercicio1.Entidades.Caballo;
import Ejercicio1.Entidades.Gato;
import Ejercicio1.Entidades.Perro;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ejercicio 1 Herencia");
        System.out.println();

        Perro perro1 = new Perro("Tina", "Balanceado", 7, "Caniche");
        perro1.Alimentar();
        Animal perro2 = new Perro("Pancho", "Balanceado", 4, "Golden");
        perro2.Alimentar();
        Animal gato1 = new Gato("Leopa", "Leopa", 3, "Tigresito");
        gato1.Alimentar();
        Animal caballo1 = new Caballo ("PonyGrande", "Alfafa", 9, "Carreras");
        caballo1.Alimentar();;

    }
}
