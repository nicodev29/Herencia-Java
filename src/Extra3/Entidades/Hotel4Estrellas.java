package Extra3.Entidades;
import java.util.Scanner;
public class Hotel4Estrellas extends Hotel{
    private Scanner leer = new Scanner(System.in);

    public Hotel4Estrellas (){
        super();
    }
    public GYM gimnasio;
    public Restaurante restaurante;

    public void calcularPrecioHabitacion (){
        super.calcularPrecioHabitacion();
        this.precioHabitacion = this.precioHabitacion + this.gimnasio.valorAgregado() + this.restaurante.valorAgregado();
    }

    public void crearHotel4Estrellas(){
        System.out.println("Creando Hotel 4 Estrellas");
        super.crearAlojamiento();
        super.crearHotel();
        System.out.println("Tiene Gimnasio? SI - NO ");
        String respuesta = leer.nextLine();
        if (respuesta.equals("si")){
            this.gimnasio = GYM.elegirGym();
        }
        System.out.println("Tiene Restaurante? SI - NO ");
        respuesta = leer.nextLine();
        if (respuesta.equals("si")) {
            this.restaurante = Restaurante.crearRestaurante();
        }
        generarDescuento();
    }

    public void generarDescuento () {
        System.out.println("TIENE DESCUENTO?");
        String respuesta = leer.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("Ingrese el descuento: ");
            int descuento = leer.nextInt();
            System.out.println("El descuento es de: " + descuento);
        }else {
            System.out.println("No tiene descuento");
        }
    }

    @Override
    public String toString() {
        return "Hotel4Estrellas{" +
                "leer=" + leer +
                ", gimnasio=" + gimnasio +
                ", restaurante=" + restaurante +
                ", cantHabitaciones=" + cantHabitaciones +
                ", numCamas=" + numCamas +
                ", cantPisos=" + cantPisos +
                ", precioHabitacion=" + precioHabitacion +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", gerente='" + gerente + '\'' +
                '}';
    }
}
