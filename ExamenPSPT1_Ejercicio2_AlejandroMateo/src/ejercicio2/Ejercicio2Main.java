package ejercicio2;

public class Ejercicio2Main {

	public static void main(String[] args) {
		
		Programador progra = new Programador();
		progra.setNombre("Jaime");
		progra.setSueldoBase(120);
		
		JefeDeProyecto jefePro = new JefeDeProyecto();
		jefePro.setNombre("Jorge");
		jefePro.setSueldoBase(150.6);
		
		Director dire = new Director();
		dire.setNombre("Ale");
		dire.setSueldoBase(170.9);
		dire.setIncentivos(40);
		
		Thread t1 = new Thread(progra, "Programador");
		Thread t2 = new Thread(jefePro, "Jefe de Proyecto");
		Thread t3 = new Thread(dire, "Director");
		
		try {
			System.out.println("Esperando a arrancar los hilos");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t3.start();
	}

}
