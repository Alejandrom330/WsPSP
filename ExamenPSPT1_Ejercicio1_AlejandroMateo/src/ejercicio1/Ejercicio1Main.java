package ejercicio1;

import java.util.Scanner;

public class Ejercicio1Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe la primera palabra");
		String palabra = sc.nextLine().trim();
		
		HThread hilo1 = new HThread(palabra);
		hilo1.setName("Primera palabra");
		
		System.out.println("Escribe la segunda palabra");
		palabra = sc.nextLine().trim();
		
		HThread hilo2 = new HThread(palabra);
		hilo2.setName("Segunda palabra");
		
		System.out.println("Escribe la tercera palabra");
		palabra = sc.nextLine().trim();
		
		HThread hilo3 = new HThread(palabra);
		hilo3.setName("Tercera palabra");
		
		System.out.println("Escribe la cuarta palabra");
		palabra = sc.nextLine().trim();
		
		HThread hilo4 = new HThread(palabra);
		hilo4.setName("Cuarta palabra");
		
		System.out.println("Escribe la quinta palabra");
		palabra = sc.nextLine().trim();
		
		HThread hilo5 = new HThread(palabra);
		hilo5.setName("Quinta palabra");
		
		try {
			System.out.println("\nEsperando a arrancar los hilos");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		hilo1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		hilo2.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		hilo3.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		hilo4.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		hilo5.start();
		
		sc.close();
	}

}
