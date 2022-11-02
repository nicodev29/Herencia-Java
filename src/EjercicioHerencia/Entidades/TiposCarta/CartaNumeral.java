package EjercicioHerencia.Entidades.TiposCarta;
import EjercicioHerencia.Entidades.Palo;

public class CartaNumeral extends CartaConPalo {
    private char letra;

    public CartaNumeral(Palo palo, char letra) {
        super(palo);
        this.letra = letra;
    }

    public CartaNumeral(Palo palo) {
        super(palo);
    }

}
