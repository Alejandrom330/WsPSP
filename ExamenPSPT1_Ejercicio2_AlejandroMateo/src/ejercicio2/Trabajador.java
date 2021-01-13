package ejercicio2;

public class Trabajador {
	
	private String nombre;
	private double sueldoBase;
	
	public Trabajador() {
		super();
	}

	public Trabajador(String nombre, double sueldoBase) {
		super();
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", sueldoBase=" + sueldoBase + "]";
	}
	
	
}
