package Ejercicio4;
import java.util.Scanner;

public class Rectangulo implements CalculadorDeFormas {
    Scanner leer = new Scanner(System.in);
    private int base;
    private int altura;
    @Override
    public void calcularPerimetro() {
        System.out.println("Ingrese la base del rectangulo");
        base = leer.nextInt();
        System.out.println("Ingrese la altura del rectangulo");
        altura = leer.nextInt();
        int perimetro = (base * 2) + (altura * 2);
        System.out.println();
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }
    @Override
    public void calcularArea() {
        int area = base * altura;
        System.out.println("El area del rectangulo es: " + area);
    }
}
