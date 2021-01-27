package main;

import java.util.ArrayList;

import entidad.Casa;
import entidad.Direccion;
import entidad.Habitaciones;
import entidad.Persona;
import entidad.TipoHabitacion;

public class Main {

	public static void main(String[] args) {
		
		Casa casa = null;
		Persona propietario = null;
		double precio;
		Direccion direcion = null;
		
		ArrayList<Habitaciones> listaHabitaciones = new ArrayList<Habitaciones>();
		ArrayList<Persona> listaInquilinos = new ArrayList<Persona>();
		
		propietario = new Persona("Godofredo", 54, "12345678A");
		
		precio = 152000.00;
		
		direcion = new Direccion("ViaNueva", "Calle", "23901");
		
		Habitaciones salon = new Habitaciones(TipoHabitacion.Baño, 20.2);
		listaHabitaciones.add(salon);
		
		Habitaciones cocina = new Habitaciones(TipoHabitacion.Cocina, 18.5);
		listaHabitaciones.add(cocina);
		
		Habitaciones banio1 = new Habitaciones(TipoHabitacion.Baño, 9.9);
		listaHabitaciones.add(banio1);
		
		Habitaciones banio2 = new Habitaciones(TipoHabitacion.Baño, 6.3);
		listaHabitaciones.add(banio2);
		
		Habitaciones dormitorio1 = new Habitaciones(TipoHabitacion.Dormitorio, 15.7);
		listaHabitaciones.add(dormitorio1);
		
		Habitaciones dormitorio2 = new Habitaciones(TipoHabitacion.Dormitorio, 13.5);
		listaHabitaciones.add(dormitorio2);
		
		Habitaciones dormitorio3 = new Habitaciones(TipoHabitacion.Dormitorio, 19.8);
		listaHabitaciones.add(dormitorio3);
		
		Persona inquilino1 = new Persona("Muriel", 78, "23456789L");
		listaInquilinos.add(inquilino1);
		
		Persona inquilino2 = new Persona("Eustaquio", 80, "23456789Q");
		listaInquilinos.add(inquilino2);
		
		Persona inquilino3 = new Persona("Agallas", 60, "23456789S");
		listaInquilinos.add(inquilino3);
		
		casa = new Casa(propietario, precio, direcion, listaHabitaciones, listaInquilinos);
		
		System.out.println("La casa le pertenece a: " + casa.getPropietario());
		System.out.println("Tiene un precio de: " + casa.getPrecio());
		System.out.println("Se encuentra en: " + casa.getDireccion());
		System.out.println("\nTiene las siguientes " + listaHabitaciones.size() + " habitaciones: " );
		
		for (int i = 0; i < listaHabitaciones.size(); i++) {
			
			System.out.println(casa.getListaHabitaciones().get(i));
		}
		
		System.out.println("La casa tiene un total de: " + casa.calcularM2() + " m2");
		System.out.println("\nTiene " + listaInquilinos.size() + " inquilinos. Y son:");
		for (int i = 0; i < listaInquilinos.size(); i++) {
			
			System.out.println(casa.getListaInquilinos().get(i));
		}
	}

}
