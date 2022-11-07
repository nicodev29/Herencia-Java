package Extra2.Entidades;

public class EdificioDeOficinas extends Edificio{

    private String nombre;
    protected int numOficinas;
    protected int numPisos;
    protected int personasPorOficina;

    @Override
    public void calcularSuperficie() {
        System.out.println("La superficie de " + getNombre() +  " es: " + (getAncho() * getLargo() + " m2"));
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen de " + getNombre() + " es: " + (getAncho() * getLargo() * getAlto() + " m2"));
    }

    public void calcularPersonas() {
        System.out.println("La cantidad de personas que caben en " + getNombre() + " son: " + (getNumOficinas() * getNumPisos() * getPersonasPorOficina() + " personas"));
    }

    //constructor con parametros de la clase padre y de la clase hija
    public EdificioDeOficinas(int ancho, int largo, int alto, String nombre, int numOficinas, int numPisos, int personasPorOficina) {
        super(ancho, largo, alto);
        this.nombre = nombre;
        this.numOficinas = numOficinas;
        this.numPisos = numPisos;
        this.personasPorOficina = personasPorOficina;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    public int getPersonasPorOficina() {
        return personasPorOficina;
    }

    public void setPersonasPorOficina(int personasPorOficina) {
        this.personasPorOficina = personasPorOficina;
    }

}


