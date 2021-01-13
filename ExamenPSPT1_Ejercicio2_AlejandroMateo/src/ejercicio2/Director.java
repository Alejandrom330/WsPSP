package ejercicio2;

public class Director extends Trabajador implements Runnable {
	
	private double incentivos;
	
	public Director() {
		super();
	}

	public Director(double incentivos) {
		super();
		this.incentivos = incentivos;
	}

	public double getIncentivos() {
		return incentivos;
	}

	public void setIncentivos(double incentivos) {
		this.incentivos = incentivos;
	}

	@Override
	public String toString() {
		return "Director [incentivos=" + incentivos + "]";
	}
	
	@Override
	public void run() {
		System.out.println("\nArrancando el hilo: " + Thread.currentThread().getName());
		String nombre = getNombre();
		double salario = getSueldoBase();
		
		System.out.println("Hola mi nombre es: " + nombre + " y tengo un "
				+ "salario de: " + salario + "€. Trabajo como Director y "
						+ "tengo unos incentivos de " + incentivos + "€");
		System.out.println("Fin del hilo: " + Thread.currentThread().getName());
	}
}
