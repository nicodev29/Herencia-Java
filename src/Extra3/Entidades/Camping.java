package Extra3.Entidades;

public class Camping extends ExtraHotelero{

    protected int cantCarpas;
    protected int cantBaños;
    protected boolean restaurante;

    public Camping(String nombre, String direccion, String localidad, String gerente, boolean privado, int metrosCuadrados) {
        super(nombre, direccion, localidad, gerente, privado, metrosCuadrados);
        this.cantCarpas = cantCarpas;
        this.cantBaños = cantBaños;
        this.restaurante = restaurante;
    }

    public int getCantCarpas() {
        return cantCarpas;
    }
    public void setCantCarpas(int cantCarpas) {
        this.cantCarpas = cantCarpas;
    }
    public int getCantBaños() {
        return cantBaños;
    }
    public void setCantBaños(int cantBaños) {
        this.cantBaños = cantBaños;
    }
    public boolean isRestaurante() {
        return restaurante;
    }
    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }
    @Override
    public String toString() {
        return "Camping{" +
                "cantCarpas=" + cantCarpas +
                ", cantBaños=" + cantBaños +
                ", restaurante=" + restaurante +
                '}';
    }

}
