package ejemploEmpleados;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class principal {

    public static void main(String[] args) {

        Empelados Nico_El_Mejor_Empleado = new Empelados("Nicolas", 29,3500,1992,12,29);
        Jefes Joha_La_Peor_Jefa_2005 = new Jefes("Joha", 15, 1500,1994,10,8);


        //Creamos un objeto tipo Jefes2, que contiene todo lo de las clases anteriores
        Jefes2 jefeExtra = new Jefes2("Extra", 12, 150,1999,12,15);

        //invocamos en la instancia a cualquier metodo que hayamos declarado en
        //la clase super, y esta lo va a poder utilizar por la herencia en cadena.
        jefeExtra.getDatosEmpleado();


    }
}

// CLASE EMPLEADOS = CLASE SUPER / PADRE, A PARTIR DE ESTA VIENEN LAS DE ABAJO.
class Empelados {
    private final String nombre; // palabra reservada final porq el nombre del empleado no cambia, es una constante!
    private int Id;
    private double sueldo;
    private static int IdSiguiente=1; // El static hace referencia a que es un atributo de LA CLASE!
    GregorianCalendar fechaAlta;

    public Empelados(String nombre, int id, double sueldo, int año , int mes, int dia) {
        this.nombre = nombre;
        Id = id;
        this.sueldo = sueldo;
        fechaAlta = new GregorianCalendar(año, mes, dia);
    }

    public String getDatosEmpleado (){

        return "El empleado " + nombre + " tiene el siguiente identificador: " + IdSiguiente +
                " tiene el siguiente sueldo: " + sueldo + " y se dio de alta en la siguiente fecha "
                + getFechaAlta();
    }

    public static String getIdSiguiente (){

        return "El ID del siguiente empleado sera: " + IdSiguiente;
    }

    public double getSueldo (){

        return sueldo;
    }

    public GregorianCalendar getFechaAlta (){

        return fechaAlta;
    }

    public void setSubeSueldo (double porcentajeSube){

        double aumento = sueldo * porcentajeSube/100;
        sueldo+=aumento;

    }
}


// CLASE EMPLEADOS, QUE HEREDA DE LA CLASE SUPER, Y ADEMAS TIENE UN METODO PROPIO, INCENTIVO
class Jefes extends Empelados{
    public Jefes(String nombre, int id, double sueldo, int año, int mes, int dia) {
        super(nombre, id, sueldo, año, mes, dia);
    }
    private double incentivo;

    //METODO PROPIO DE LA CLASE Jefes, QUE NO LO TIENE LA CLASE SUPER/PADRE.
    public void setIncentivo (double aumento){
        incentivo=aumento;
    }

    public double getIntentivoSueldo (){

        double SueldoJefe = super.getSueldo();
        return SueldoJefe+incentivo;

    }
}


//Herencia en cadena, SIEMPRE tenemos que generar el constructor del
// la super clase primeramente creada, sino nos tira error.
class Jefes2 extends Jefes {
    public Jefes2(String nombre, int id, double sueldo, int año, int mes, int dia) {
        super(nombre, id, sueldo, año, mes, dia);
    }

    //metodo solo de Jefes2, que lo hereda Jefes3 por herencia, abajo
    // ya que es "public", si lo ponemos como private no podria ser herenciado a Jefes3.
    public void Sumar (){

    }

}

class Jefes3 extends Jefes2 {

    public Jefes3(String nombre, int id, double sueldo, int año, int mes, int dia) {
        super(nombre, id, sueldo, año, mes, dia);
    }


}

//Con la palabra final delante de la clase, metemos un freno a la herencia
// la clase Jefes4 no puede ser herencia para otras clases siguientes.
// hereda lo de Jefes3, pero Jefes4, luego no puede "herenciar" a otra clase.
final class Jefes4 extends Jefes3{

    public Jefes4(String nombre, int id, double sueldo, int año, int mes, int dia) {
        super(nombre, id, sueldo, año, mes, dia);
    }
}