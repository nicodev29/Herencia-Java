package Extra3.Entidades;
import java.util.Scanner;

public enum GYM {

    A("A"), B("B");
    private final String clase;
    static final Scanner leer = new Scanner(System.in);
    GYM(String texto) {
        this.clase = texto;
    }
    public int valorAgregado (){
        return this.clase.equals("A") ? 50 : 30;
    }
    public static GYM elegirGym () {

        System.out.println("Elige el tipo de GYM");
        for (GYM gym : GYM.values()) {
            System.out.println(gym);
        }
        System.out.println();
        return GYM.valueOf(leer.nextLine());
    }

}
