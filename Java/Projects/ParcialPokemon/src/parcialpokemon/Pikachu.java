package parcialpokemon;

/**
 *
 * @author qwefg
 */
public class Pikachu extends Pokemon {
    
    public Pikachu() {
        super("Pikachu", Tipo.ELECTRICO, 10, 100, 100, 0);
    }

    @Override
    public boolean puedoEvolucionar() {
        return this.getxp() >= 200;
    }

    @Override
    public void siguienteNivel() {
        int nivelesSubidos = getxp() / 200;
        setEvolucion(getEvolucion() + nivelesSubidos);
        actualizarxp(-(nivelesSubidos * 200));
    }

    // Añadimos información extra a la representación en cadena de texto
    @Override
    public String toString() {
        // Llama al toString del padre y le concatena más texto
        return super.toString() + " | Clase: Pikachu (Eléctrico)";
    }
}
