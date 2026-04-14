package parcialpokemon;

/**
 *
 * @author qwefg
 */
public abstract class Pokemon {

	private String nombre;
	private Tipo familia;
	private int evolucion;
	private int hp;
	private int energia_ataque;
	private int xp;

	public Pokemon() {
		this.hp = 100;
		this.energia_ataque = 100;
		this.xp = 0;
	}

	public Pokemon(String nombre, Tipo familia, int evolucion, int hp, int energia_ataque, int xp) {
		this.nombre = nombre;
		this.familia = familia;
		this.evolucion = evolucion;
		this.hp = hp;
		this.energia_ataque = energia_ataque;
		this.xp = xp;
	}

	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	public Tipo getTipo() { return familia; }
	public void setTipo(Tipo familia) { this.familia = familia; }
	public int getEvolucion() { return evolucion; }
	protected void setEvolucion(int evolucion) { this.evolucion = evolucion; }
	public int gethp() { return hp; }
	protected void sethp(int hp) { this.hp = hp; }
	public int getpp() { return energia_ataque; }
	protected void setpp(int energia) { this.energia_ataque = energia_ataque; }
	public int getxp() { return xp; }
	public void actualizarxp(int exp) { this.xp += exp; }

	public int ataquePokemon (Pokemon p, int energia) {
		this.energia_ataque = this.energia_ataque - energia;
		p.hp = p.hp - energia;

		// xp para el pokemon que gano
		if (p.hp <=0) {
			p.hp = 0;
			return (energia + p.energia_ataque) * p.evolucion;
		}

		return 0;
	}

	public abstract boolean puedoEvolucionar();
	public abstract void siguienteNivel();

	public void evoluciona() {
		if (puedoEvolucionar()) {
		siguienteNivel();
		}
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " | Nivel: " + evolucion + " | HP: " + hp;
	}
}
