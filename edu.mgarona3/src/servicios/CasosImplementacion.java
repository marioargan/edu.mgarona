package servicios;

import java.time.LocalDate;

import DTO.Elemento;
import controladores.Inicio;

public class CasosImplementacion implements CasosInterfaz {

	
	@Override
	public void darAltaElemento() {
		boolean cerrarAlta = false;
		//caso encargado de guardar elementos en la lista y dar de alta dichos elementos
		
		do {
			int idElemento = Inicio.elementos.size();
			System.out.println("Introduzca el codigo del Elemento compuesto por las 3 letras del objeto.");
			String codigoElemento = Inicio.sc.next()+idElemento; 
			System.out.println("Introduzca nombre del elemento");
			String nombreelemento = Inicio.sc.nextLine();
			nombreelemento = Inicio.sc.next();
			System.out.println("Pequeña descripcion en una palabra");
			String descripcion = Inicio.sc.next();
			System.out.println("Ingrese una cantidad");
			int cantidad = Inicio.sc.nextInt();
			System.out.println("Ingrese la fecha actual en formato YYYY,MM,DD");
			System.out.println("Año");
			int año = Inicio.sc.nextInt();
			System.out.println("Mes");
			int mes = Inicio.sc.nextInt();
			System.out.println("Dia");
			int dia = Inicio.sc.nextInt();
			
			LocalDate fechaAlta = LocalDate.of(año,mes,dia);
			
			Elemento producto = new Elemento(codigoElemento, nombreelemento, descripcion, cantidad, fechaAlta);
			
			Inicio.elementos.add(producto);
			
			System.out.println("¿Deseas seguir añadiendo elementos?");
			String eleccion = Inicio.sc.next();
			if (eleccion.equals("no")) {
				cerrarAlta = true;
			}
		} while (!cerrarAlta);
		
		
	}
	
	@Override
	//Metodo encargado de cambiar la cantidad del producto y almacenar la pasada por consola
	public void modificarCantidad() {
		System.out.println("Ingrese la cantidad que deseas modificar");
		int cantidadNew = Inicio.sc.nextInt();
		System.out.println(Inicio.elementos);
		System.out.println("Ingrese el codigo del elemento");
		String codigoElemento = Inicio.sc.next();
		for (int i = 0; i < Inicio.elementos.size(); i++) {
			Elemento elemento = Inicio.elementos.get(i);
			
			if (codigoElemento.equals(elemento.getCodigoElemento())) {
				elemento.setCantidad(cantidadNew);
			}
		}
	}
	
	@Override
	//Metodo encargado de dar de baja un elemento cambiando su fecha final o fecha de baja
	public void darBajaElemento() {
		System.out.println("Codigo del elemento: ");
		System.out.println(Inicio.elementos);
		String codigoElemento = Inicio.sc.next();
		for (int i = 0; i < Inicio.elementos.size(); i++) {
			Elemento elemento = Inicio.elementos.get(i);
			System.out.println("Año");
			int año = Inicio.sc.nextInt();
			System.out.println("Mes");
			int mes = Inicio.sc.nextInt();
			System.out.println("Dia");
			int dia = Inicio.sc.nextInt();
			
			LocalDate fechaBaja = LocalDate.of(año, mes, dia);
			if (codigoElemento.equals(elemento.getCodigoElemento())) {
				elemento.setFecaBaja(fechaBaja);;
			}
		}
	}
	
	@Override
	//Metodo encargado de cerrar el menu a traves de una pregunta
	public void cerrarMenu() {
		MenuInterfaz mostrarMenu = new MenuImplementacion();
		boolean cerrarMenu = false;
		String eleccion;
		System.out.println("¿Deseas cerrar el menu?");
		eleccion = Inicio.sc.next();
		
		if (eleccion.equals("si")) {
			  cerrarMenu = true;
		}
		
		
	}
	
}
