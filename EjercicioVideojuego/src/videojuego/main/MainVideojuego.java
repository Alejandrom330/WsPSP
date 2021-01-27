package videojuego.main;

import java.util.Scanner;

import videojuego.entidad.Arco;
import videojuego.entidad.Arma;
import videojuego.entidad.Curandero;
import videojuego.entidad.Espada;
import videojuego.entidad.Mago;
import videojuego.entidad.Personaje;
import videojuego.entidad.Rezos;

import java.lang.System;

public class MainVideojuego {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Arma rezo = new Rezos();
		rezo.setTipo("Rezo 1");
		
		Arma arco = new Arco();
		arco.setTipo("Arco 1");

		Arma espada1 = new Espada();
		espada1.setTipo("AAA");

		Curandero c1 = new Curandero();
		c1.setVida(100);
		c1.setArma(espada1);
		c1.setSabiduria(87);

		Curandero c2 = new Curandero();
		Arma rezo2 = new Rezos();
		rezo.setTipo("Rezo 2");
		c2.setVida(100);
		c2.setArma(rezo2);
		c2.setSabiduria(22);

		Mago m1 = new Mago();
		m1.setNombre("Mago 1");
		m1.setVida(100);
		m1.setArma(arco);
		m1.setInteligencia(34);

		boolean continuar = true;
		String cont = "";
		int huida = 0;

		Personaje j1 = c1;
		Personaje j2 = c2;

		System.out.println("BATALLA");
		System.out.println("");
		System.out.print("PLAYER1 - Listo - (Pulse enter para continuar)");
		String jugador1 = sc.nextLine();
		j1.setNombre(jugador1);
		
		System.out.println("");

		System.out.print("PLAYER2 - Listo - (Pulse enter para continuar)");
		String jugador2 = sc.nextLine();
		j2.setNombre(jugador2);

		while (continuar) {

			if (j1.getVida() <= 0 || j2.getVida() <= 0) {
				continuar = false;
			} else {
				System.out.println("");
				System.out.println("PLAYER1: " + j1.getNombre());
				System.out.print(j1.getNombre() + " Pulsa intro para atacar (o X para salir)\n");
				cont = sc.nextLine();

				if (cont.equalsIgnoreCase("x")) {
					continuar = false;
					huida = 1;
				} else {
					j1.atacar(j2);
					System.out.println();
					System.out.println(j1);
					System.out.println(j2);

					if (j2.getVida() <= 0) {
						continuar = false;
					} else {
						System.out.println("");
						System.out.println("PLAYER2: " + j2.getNombre());
						System.out.print(j2.getNombre() + " Pulsa intro para atacar (o X para salir)\n");
						cont = sc.nextLine();

						if (cont.equalsIgnoreCase("x")) {
							continuar = false;
							huida = 2;

						} else {
							j2.atacar(j1);
							System.out.println();
							System.out.println(j1);
							System.out.println(j2);
						}
					}
				}
			}
		}
		System.out.println("");
		System.out.println("FIN");
		System.out.println("");

		if (huida == 0) {
			if (j1.getVida() > 0) {
				System.out.println("Ha ganado el PLAYER1");
				System.out.println("Felicidades " + j1.getNombre());
			} else {
				System.out.println("Ha ganado el PLAYER2");
				System.out.println("Felicidades " + j2.getNombre());
			}
		} else if (huida == 1) {
			System.out.println("El jugador 1 se ha retirado tacticamente");
			System.out.println("El jugador 2 es el vencedor");

		} else if (huida == 2) {
			System.out.println("El jugador 2 se ha retirado tacticamente");
			System.out.println("El jugador 1 es el vencedor");
		}
		sc.close();
	}
}
