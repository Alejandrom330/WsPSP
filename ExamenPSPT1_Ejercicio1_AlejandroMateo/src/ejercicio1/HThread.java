package ejercicio1;

public class HThread extends Thread {
	
	private String palabra;

	public HThread(String palabra) {
		super();
		this.palabra = palabra;
	}
	
	@Override
	public void run() {
		System.out.println("\nArrancando el hilo: " + Thread.currentThread().getName());
		
		int numLetras = palabra.length();
		
		System.out.println("La palabra: " + palabra + ", tiene " + numLetras + " letras");
		System.out.println("Fin del hilo: " + Thread.currentThread().getName());
	}
}
