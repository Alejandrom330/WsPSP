package ejerciciocasa;

import java.util.ArrayList;

public class MainCasa {
	public static void main(String[] args) {
		
		Direccion direccionCasa = new Direccion();
		direccionCasa.setNombreVia("Joguarts");
		direccionCasa.setTipoVia("avenida flotante");
		direccionCasa.setCp("45678");
		direccionCasa.setNumero("23");
		
		Persona propietario = new Persona();
		propietario.setNombre("Voldemor");
		propietario.setDni("4433434");
		propietario.setEdad(125);
		propietario.setDireccion(direccionCasa);
		
		Habitacion salon = new Habitacion();
		salon.setM2(35);
		salon.setTipoHabitacion("SALON");
		
		Habitacion cocina = new Habitacion();
		cocina.setM2(15);
		cocina.setTipoHabitacion("COCINA");
		
		Persona inquilino1 = new Persona();
		inquilino1.setNombre("Harry Potter");
		inquilino1.setDni("23");
		inquilino1.setEdad(16);
		inquilino1.setDireccion(direccionCasa);
		
		Persona inquilino2 = new Persona();
		inquilino2.setNombre("Ernion");
		inquilino2.setDni("25");
		inquilino2.setEdad(18);
		inquilino2.setDireccion(direccionCasa);
		
		Casa casa = new Casa();
		casa.setDireccion(direccionCasa);
		casa.setPrecio(1000);
		casa.setPropietario(propietario);
		
		ArrayList<Habitacion> listaHabitaciones = new ArrayList<Habitacion>();
		listaHabitaciones.add(cocina);
		listaHabitaciones.add(salon);
		
		casa.setListaHabitaciones(listaHabitaciones);
		
		ArrayList<Persona> listaInquilinos = new ArrayList<Persona>();
		listaInquilinos.add(inquilino1);
		listaInquilinos.add(inquilino2);
		
		casa.setListaInquilinos(listaInquilinos);
		
		//todos estos apuntan al mismo objeto
		inquilino2.getDireccion().setNombreVia("Gran via");
		inquilino1.getDireccion().setNombreVia("Diamente");
		
		System.out.println(listaInquilinos.get(0).getDireccion().getNombreVia());
		System.out.println(casa);
		
	}
}
