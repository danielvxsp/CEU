package parcialpokemon;

/**
 *
 * @author qwefg
 */
public class Charmander extends Pokemon {
    
    public Charmander(String nombre, int evolucion, int salud, int energia, int exp) {
        super(nombre, Tipo.FUEGO, evolucion, salud, energia, exp);
    }

    @Override
    public int ataquePokemon(Pokemon p, int energia) {
        int expBase = super.ataquePokemon(p, energia);
        return expBase * this.getEvolucion();
    }

    @Override
    public boolean puedoEvolucionar() {
        return this.getxp() >= 100;
    }

    @Override
    public void siguienteNivel() {
        int nivelesSubidos = getxp() / 100;
        
        setEvolucion(getEvolucion() + nivelesSubidos);
        
        actualizarxp(-(nivelesSubidos * 100));
    }
}
