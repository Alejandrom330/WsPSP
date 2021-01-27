package ejercicioPrimos;

import java.util.Scanner;

public class MainPrimos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int num;
 
        System.out.print("Ingresa un numero 1: ");
        num = Integer.parseInt(sc.nextLine());
        
        PrimosRunnable hilo1 = new PrimosRunnable("numero 1", num);
		
		Thread t1 = new Thread(hilo1);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
		System.out.print("Ingresa un numero 2: ");
        num = Integer.parseInt(sc.nextLine());
        
        PrimosRunnable hilo2 = new PrimosRunnable("numero 2", num);
		
		Thread t2 = new Thread(hilo2);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.print("Ingresa un numero 3: ");
        num = Integer.parseInt(sc.nextLine());
        
        PrimosRunnable hilo3 = new PrimosRunnable("numero 3", num);
		
		Thread t3 = new Thread(hilo3);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t1.start();
		t2.start();
		t3.start();
		
        sc.close();
    }

}
