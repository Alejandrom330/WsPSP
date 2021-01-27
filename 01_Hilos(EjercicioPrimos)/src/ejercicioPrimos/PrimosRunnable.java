package ejercicioPrimos;

import java.util.Date;

public class PrimosRunnable implements Runnable{
	
	private String valorImprimir;
	private int num;

	public PrimosRunnable(String valorImprimir, int num) {
		this.valorImprimir = valorImprimir;
		this.num = num;
	}

	@Override
	public void run() {
		
		Date dateI = new Date();
		
		System.out.println("Arrancando hilo: " + Thread.currentThread().getName());
		
		int cont = 0;
		
		for (int i = 1; i <= num; i++) {
			
			if((num % i) == 0)
            {
                cont++;
            }
		}
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Date dateF = new Date();
 
        if(cont <= 2) {
            System.out.println(valorImprimir + ": " + num + " es primo. Ha tardado " + (dateF.getTime() - dateI.getTime()) + " miliseg");
        }else {
        	System.out.println(valorImprimir + ": " + num + " no es primo. Ha tardado " + (dateF.getTime() - dateI.getTime()) + "miliseg");
        }
		
	}

}
