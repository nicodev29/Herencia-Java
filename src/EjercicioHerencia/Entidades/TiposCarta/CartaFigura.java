package EjercicioHerencia.Entidades.TiposCarta;
import EjercicioHerencia.Entidades.Palo;

public class CartaFigura extends CartaConPalo{

    private int numero;

    public CartaFigura(Palo palo, int numero) {
        super(palo);
        this.numero = numero;
    }

    public CartaFigura(Palo palo) {
        super(palo);
    }

}
