package herencia;

//cuando heredamos de una clase con metodos abstractos podemos hacer 2 cosas:
// 1- Declarar la clase como abstracta
// 2- Implementar los metodos abstractos
public class Pez extends Animal {
	
	private int numAletas;
	
	//CUando sobreescribimos un metodo le cabiamos el comportamiento por defecto de la clase padre
	//Para sobreescribir un metodo tenemos que hacerque tenga la misma firma del metodo padre
	//La firma es: 
	//1- el nombre
	//2- el numero de parametros de entrada
	//3- el tipo de los parametros de entrada
	
	public int getNumAletas() {
		return numAletas;
	}

	public void setNumAletas(int numAletas) {
		this.numAletas = numAletas;
	}

	@Override
	public void comer(Object comida) {
		if (comida instanceof Placton) {//tenemos que ver si la variable comida es de tipo placton 
			Placton p = (Placton) comida;//tenemos que hacer un cast para poder utilizar el metodo de la clase placton
			System.out.println("Lo como. Me llamo: " + nombre + " y voy a comer placton con " 
					+ p.getCalorias() + " calorias");
		} else {
			System.out.println("No gusta el " + comida.getClass().getSimpleName());
		}
		
	}
	
}
