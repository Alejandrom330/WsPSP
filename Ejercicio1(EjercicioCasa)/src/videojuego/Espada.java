package videojuego;

public class Espada extends Arma {
	
	public void usar() {
		System.out.println("Clink!");
	}
	public Espada(String tipo) {
		super();
		setTipo(tipo);
	}
}
