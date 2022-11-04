package Ejercicio4;
import java.util.Scanner;

public class Circulo implements CalculadorDeFormas {
    Scanner leer = new Scanner(System.in);
    private float radio;
    @Override
    public void calcularPerimetro() {
        System.out.println("Ingrese el radio del circulo");
        radio = leer.nextFloat();
        float perimetro = 2 * PI * radio;
        System.out.println();
        System.out.println("El perimetro del circulo es: " + perimetro);
    }

    @Override
    public void calcularArea() {
        float area = PI * radio * radio;
        System.out.println("El area del circulo es: " + area);
    }
}
