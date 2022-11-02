package EjercicioHerencia.Entidades.TiposCarta;
import EjercicioHerencia.Entidades.Palo;

public abstract class CartaConPalo extends Carta {
    private Palo palo;

    public CartaConPalo (Palo palo) {
        this.palo = palo;
    }

}