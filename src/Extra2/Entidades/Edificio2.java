package Extra2.Entidades;
public abstract class Edificio2 {
    protected int ancho;
    protected int alto;
    protected int largo;

    public Edificio2(int ancho, int alto, int largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public Edificio2() {

    }

    public abstract void calcularSuperficie ();
    public abstract void calcularVolumen ();
    public abstract void datosFinal ();

}
