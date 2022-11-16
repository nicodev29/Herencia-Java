package Extra2.Entidades;

import java.util.Scanner;
public class Oficinas2 extends Edificio2{

    private Scanner leer = new Scanner(System.in);

    private String nombre;
    protected int numOficinas;
    protected int numPisos;
    protected int personasPorOficina;
    private int superficie;
    private int volumen;
    private int personasTotal;


    public Oficinas2(int ancho, int alto, int largo) {
        super(ancho, alto, largo);

    }

    public Oficinas2() {

    }

    public void datosOficinas2 (){
        System.out.println("Ingresa los datos del edificio de oficinas");
        System.out.println("Nombre del edificio: ");
        nombre = leer.nextLine();
        System.out.println("Numero de oficinas: ");
        numOficinas = leer.nextInt();
        System.out.println("Numero de pisos: ");
        numPisos = leer.nextInt();
        System.out.println("Numero de personas por oficina: ");
        personasPorOficina = leer.nextInt();

    }

    @Override
    public void calcularSuperficie() {
        System.out.println();
        System.out.println("Calculando superficie");
        System.out.println("Ingresa las medidas del edificio de oficinas: ");
        System.out.println("Ancho: ");
        ancho = leer.nextInt();
        System.out.println("Largo: ");
        largo = leer.nextInt();
        superficie = ancho * largo;
    }

    @Override
    public void calcularVolumen() {
        System.out.println();
        System.out.println("Calculando volumen");
        System.out.println("Ingresa el alto del edificio de oficinas: ");
        alto = leer.nextInt();
        volumen = ancho * alto * largo;

    }

    public void calcularPersonas() {
        personasTotal = numOficinas * personasPorOficina*numPisos;
    }

    public void datosFinal() {
        System.out.println("Nombre del edificio: " + nombre);
        System.out.println("Numero de oficinas: " + numOficinas);
        System.out.println("Numero de pisos: " + numPisos);
        System.out.println("Numero de personas por oficina: " + personasPorOficina);
        System.out.println("Personas maximas por piso: " + (numOficinas * personasPorOficina));
        System.out.println("Personas maximas totales dentro del edificio: " + personasTotal);
        System.out.println("Superficie: " + superficie + " m2");
        System.out.println("Volumen: " + volumen + " m3");
        System.out.println();

    }
}
