package videojuego.entidad;

public class Curandero extends Personaje {

	private int sabiduria;

	public int getSabiduria() {
		return sabiduria;
	}

	public void setSabiduria(int sabiduria) {
		this.sabiduria = sabiduria;
	}

	@Override
	public void atacar(Personaje p) {
		if (this.getArma() instanceof Rezos) {
			System.out.println("Rezando a dios");
			this.getArma().usar();
			p.setVida(p.getVida() - 18);

		} else {;
			this.getArma().usar();
			p.setVida(p.getVida() - 9);
		}
	}

	@Override
	public String toString() {
		return super.toString() + "\t Sabiduría: " + sabiduria;
	}

}
