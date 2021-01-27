package videojuego;

public class Arco extends Arma {
	
	public void usar() {
		System.out.println("piu!");
	}
	public Arco(String tipo) {
		super();
		setTipo(tipo);
	}
}
