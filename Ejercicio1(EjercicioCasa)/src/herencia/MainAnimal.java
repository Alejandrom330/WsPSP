package herencia;

import java.util.ArrayList;

public class MainAnimal {

	public static void main(String[] args) {
		//las clases abstractas no son instanciables
		//
		
		Tiburon t1 = new Tiburon();
		t1.setNombre("Pinocho");
		t1.setEdad(3);
		t1.setNumAletas(6);
		
		Payaso payaso = new Payaso();
		payaso.setNombre("Nemo");
		payaso.setEdad(1);
		payaso.setNumAletas(1);
		
		TRex tRex = new TRex();
		tRex.setNombre("Rex");
		tRex.setEdad(5);
		
		ArrayList<Animal> listaAnimal = new ArrayList<Animal>();
		listaAnimal.add(t1);
		listaAnimal.add(payaso);
		listaAnimal.add(tRex);
		
		Placton placton = new Placton();
		placton.setCalorias(150);
		
		for (Animal a : listaAnimal) {
			/*Gracias apolimorfismo, el metodo comer que se ejecutara sera el del animal
			 * al que esta apuntando
			 */
			a.comer(placton);
		}
	}

}
