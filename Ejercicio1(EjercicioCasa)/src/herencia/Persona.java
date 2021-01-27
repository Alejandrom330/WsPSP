package herencia;


// vamos a hacer esta clase javabean
//una clase con estructura javabean es una clase
//que tiene sus atributos con visibilidad private
//y tiene metodos accesores y modificadores public

//es una estructura ampliamente utilizada en frameworks java
//como puede ser spring
public class Persona {
	
	private String nombre;
	private int edad;
	private double peso;
	
	//persona tiene una relacion de composicion con Direccion
	//si responde a la pregunta "has a" "tiene un" es esta relacion
	//ese tipo de relacion va como atributo de clase
	
	//Que hace java con los contructores
	//si no creais constructores java crea el constructor por defecto

	public Persona() {
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}
