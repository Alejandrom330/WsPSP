package videojuego.entidad;

public class Guerrero extends Personaje {

	private int fuerza;

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	@Override
	public void atacar(Personaje p) {
		if (this.getArma() instanceof Espada) {
			System.out.println("ESTOCADA");
			this.getArma().usar();
			p.setVida(p.getVida() - 20);

		} else if (this.getArma() instanceof Arco) {
			System.out.println("ARCAZO");
			this.getArma().usar();
			p.setVida(p.getVida() - 20);

		} else {
			p.setVida(p.getVida() - 10);
		}

	}

}
