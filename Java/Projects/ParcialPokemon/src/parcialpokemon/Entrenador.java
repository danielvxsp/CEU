package parcialpokemon;
import java.util.ArrayList;
/**
 *
 * @author qwefg
 */
public class Entrenador {
    
    private String nombre;
    private ArrayList<Pokemon> equipo;

    public Entrenador() {
        this.nombre = "Entrenador Novato";
        this.equipo = new ArrayList<>();
    }

    public void anadePokemon(Pokemon p) {
        equipo.add(p);
    }

    public void eliminaPokemon(int s) {
        equipo.removeIf(p -> p.gethp() < s);
    }

    public void ataca(String n, Pokemon p, int energia) {
        for (Pokemon miP : equipo) {
            if (miP.getNombre().equals(n)) {
                int expGanada = miP.ataquePokemon(p, energia);
                miP.actualizarxp(expGanada);
                miP.evoluciona();
                break;
            }
        }
    }

    public String pokemonPorFamilias() {
        int f = 0, a = 0, e = 0;
        
        for (Pokemon p : equipo) {
            if (p.getTipo() == Tipo.FUEGO) f++;
            else if (p.getTipo() == Tipo.AGUA) a++;
            else if (p.getTipo() == Tipo.ELECTRICO) e++;
        }
        
        return "fuego: " + f + ", agua: " + a + ", eléctrico: " + e;
    }
}
