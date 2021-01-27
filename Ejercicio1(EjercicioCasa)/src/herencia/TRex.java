package herencia;

public class TRex extends Animal {
	
	
	@Override
	public void comer(Object comida) {
		if (comida instanceof Animal) {
			
			Animal a = (Animal) comida;
			
			System.out.println("Rico. soy un trex " + nombre + " y me voy a comer al "
			+ a.getClass().getSimpleName() + " que se llama " + a.getNombre());
			
		} else {
			System.out.println("Solo como animales");
		}
		
	}
	
	
}
