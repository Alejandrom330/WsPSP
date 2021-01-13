package ejercicio2;

public class JefeDeProyecto extends Trabajador implements Runnable {
	
	@Override
	public void run() {
		System.out.println("\nArrancando el hilo: " + Thread.currentThread().getName());
		String nombre = getNombre();
		double salario = getSueldoBase();
		
		System.out.println("Hola mi nombre es: " + nombre + " y tengo un "
				+ "salario de: " + salario + "€. Trabajo como Jefe de"
						+ " Proyecto");
		System.out.println("Fin del hilo: " + Thread.currentThread().getName());
	}

}
