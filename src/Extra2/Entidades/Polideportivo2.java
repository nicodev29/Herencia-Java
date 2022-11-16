package Extra2.Entidades;
import java.util.Scanner;

public class Polideportivo2 extends Edificio2{
    private Scanner leer = new Scanner(System.in);

    protected String nombre;
    protected boolean techado;
    protected String resp;
    protected int superficie;
    protected int volumen;

    public Polideportivo2(int ancho, int alto, int largo,String nombre, boolean techado) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;

    }

    public Polideportivo2() {
        super();
    }
    public void datosPolideportivo() {
        System.out.println("Ingrese el nombre del polideportivo");
        nombre = leer.nextLine();
        System.out.println("El polideportivo es techado?");
         resp = leer.nextLine();
    }

    @Override
    public void calcularSuperficie() {
        System.out.println();
        System.out.println("Calculando superficie");
        System.out.println("Ingresa las medidas del polideportivo: ");
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
        System.out.println("Ingresa el alto del polideportivo: ");
        alto = leer.nextInt();
        volumen = ancho * alto * largo;
    }
    public void datosFinal() {
        System.out.println();
        System.out.println("Nombre del polideportivo: " + nombre);
        System.out.println("El polideportivo es techado? " + resp);
        System.out.println("Superficie: " + superficie + " m2" );
        System.out.println("Volumen: " + volumen + " m3");
        System.out.println();
    }
}