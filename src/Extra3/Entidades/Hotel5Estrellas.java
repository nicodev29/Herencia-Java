package Extra3.Entidades;
import java.util.Scanner;

public class Hotel5Estrellas extends Hotel4Estrellas{

    private static final Scanner leer = new Scanner(System.in);
    protected int cantSalonConferencia;
    protected int cantSuites;
    public int limusina;
    public GYM gimnasio;
    public Restaurante restaurante;

    protected int descuento;

    public Hotel5Estrellas (){
        super();
    }

    public void crearHotel5Estrellas(){
        System.out.println("Creando Hotel 5 Estrellas");
        super.crearAlojamiento();
        super.crearHotel();
        System.out.println("Tiene Gimnasio? SI - NO ");
        String respuesta = leer.next();
        if (respuesta.equals("si")){
            this.gimnasio = GYM.elegirGym();
        }
        System.out.println("Tiene Restaurante? SI - NO ");
        respuesta = leer.nextLine();
        if (respuesta.equals("si")) {
            this.restaurante = Restaurante.crearRestaurante();
        }
        System.out.println("Ingrese la cantidad de salones de conferencia");
        this.cantSalonConferencia = leer.nextInt();
        System.out.println("Ingrese la cantidad de suites");
        this.cantSuites = leer.nextInt();
        System.out.println("Ingrese la cantidad de limusinas");
        this.limusina = leer.nextInt();
        generarDescuento();

    }
    public void generarDescuento () {
        System.out.println("TIENE DESCUENTO?");
        String respuesta = leer.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("Ingrese el descuento: ");
            this.descuento = leer.nextInt();
            System.out.println("El descuento es de: " + this.descuento);
        }else {
            System.out.println("No tiene descuento");
        }
    }

    public void cantLimusinas (){
        System.out.println("Ingrese la cantidad de limusinas");
        this.limusina = leer.nextInt();
    }
    public void calcularPrecioHabitacion (){
        this.precioHabitacion = this.getPrecioHabitacion() + this.getGimnasio().valorAgregado() + this.getRestaurante().valorAgregado() + this.getLimusina();
    }


    public int getCantSalonConferencia() {
        return cantSalonConferencia;
    }
    public void setCantSalonConferencia(int cantSalonConferencia) {
        this.cantSalonConferencia = cantSalonConferencia;
    }
    public int getCantSuites() {
        return cantSuites;
    }
    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }
    public int getLimusina() {
        return limusina;
    }
    public void setLimusina(int limusina) {
        this.limusina = limusina;
    }
    public GYM getGimnasio() {
        return gimnasio;
    }
    public void setGimnasio(GYM gimnasio) {
        this.gimnasio = gimnasio;
    }
    public Restaurante getRestaurante() {
        return restaurante;
    }
    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Hotel5Estrellas{" +
                "cantSalonConferencia=" + getCantSalonConferencia() +
                ", cantSuites=" + getCantSuites() +
                ", limusina=" + getLimusina() +
                ", gimnasio=" + getGimnasio() +
                ", restaurante=" + getRestaurante() +
                ", descuento=" + getDescuento() +
                ", cantHabitaciones=" + getCantHabitaciones() +
                ", numCamas=" + getNumCamas() +
                ", cantPisos=" + getCantPisos() +
                ", precioHabitacion=" + getPrecioHabitacion() +
                ", nombre='" + getNombre() + '\'' +
                ", direccion='" + getDireccion() + '\'' +
                ", localidad='" + getLocalidad() + '\'' +
                ", gerente='" + getGerente() + '\'' +
                '}';
    }
}
