package herencia;

public class Tiburon  extends Pez {
	
	@Override
	public void comer(Object comida) {
		if (comida instanceof Persona) {
			Persona p = (Persona) comida;
			System.out.println("Soy el tiburon mas " + nombre + " y me voy a comer a la persona "
					+ p.getNombre());
		} else {
			System.out.println("No gusta");
		}
		
		super.comer(comida);
		//El super se usa para llamar a la clase padre
	}
	
	
	
	
	
	
	
	
	
	
	
}
