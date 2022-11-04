package Ejercicio4;
import java.util.Scanner;

public class ServicioCreador implements CalculadorDeFormas {
    @Override
    public void calcularPerimetro() {

    }
    @Override
    public void calcularArea() {

    }
    public void creadorFormas (){

        Scanner leer = new Scanner(System.in);
        System.out.println();
        System.out.println("Que figura quieres calcular?");
        System.out.println("1. Circulo");
        System.out.println("2. Rectangulo");
        String respuesta = leer.nextLine();

        if (respuesta.equals("1")) {
            Circulo circulo = new Circulo();
            circulo.calcularPerimetro();
            circulo.calcularArea();
        } else if (respuesta.equals("2")) {
            Rectangulo rectangulo = new Rectangulo();
            rectangulo.calcularPerimetro();
            rectangulo.calcularArea();
        } else {
            System.out.println("Opcion no valida");
        }
    }
}





