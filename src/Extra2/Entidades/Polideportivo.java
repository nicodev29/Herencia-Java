package Extra2.Entidades;

public class Polideportivo extends Edificio {
    private String nombre;
    private Boolean techado;

    @Override
    public void calcularSuperficie() {
        System.out.println("La superficie del " + getNombre()+  " es: " + (getAncho() * getLargo() + " m2"));
    }
    @Override
    public void calcularVolumen() {
        System.out.println("El volumen del " + getNombre()+  " es: " + (getAncho() * getLargo() * getAlto() + " m2"));
    }

    public Polideportivo(int ancho, int largo, int alto, String nombre, Boolean techado) {
        super(ancho, largo, alto);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Boolean getTechado() {
        return techado;
    }
    @Override
    public void calcularPersonas() {

    }
}


