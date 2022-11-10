package Extra3.Entidades;

public class ExtraHotelero extends Alojamiento {

    public boolean privado;
    protected int metrosCuadrados;

    //constructor con parámetros de la clase padre
    public ExtraHotelero(String nombre, String direccion, String localidad, String gerente, boolean privado, int metrosCuadrados) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }

    public ExtraHotelero() {

    }

    public boolean isPrivado() {
        return privado;
    }
    public void setPrivado(boolean privado) {
        this.privado = privado;
    }
    public boolean getPrivado() {
        return this.privado;
    }
    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }
    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        return "ExtraHotelero{" +
                "privado=" + privado +
                ", metrosCuadrados=" + metrosCuadrados +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", gerente='" + gerente + '\'' +
                '}';
    }
}
