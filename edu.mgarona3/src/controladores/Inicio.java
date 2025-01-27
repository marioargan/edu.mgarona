package controladores;
import java.util.ArrayList;
import java.util.Scanner;
import DTO.Elemento;
import servicios.CasosImplementacion;
import servicios.CasosInterfaz;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;

public class Inicio {
	/*
	 * @mgarona
	 * 27/0125
	 * 
	 */
	
	public static Scanner sc = new Scanner(System.in);
	public static int idAuxiliar=0;
	public static ArrayList<Elemento> elementos = new ArrayList<Elemento>();
	
	/*
	 * metodo encargado de llevar a cabo la aplicacion
	 * @mgarona
	 * 27/01/25
	 */
	public static void main(String[] args) {
		//implementacion del menu a la aplicacion
		MenuInterfaz menu = new MenuImplementacion();
		int opcionUsuario;
		//implementacion de los casos a la aplicacion
		CasosInterfaz aplicacion = new CasosImplementacion();
		
		//bucle de la aplicacion
		boolean cerrarMenu = false;
		do {
			
			menu.menu();
			opcionUsuario = sc.nextInt();
			switch (opcionUsuario) {
			case 1: {
				aplicacion.darAltaElemento();
				break;
			}
			case 2:{ 
				aplicacion.modificarCantidad();
				break;
			}
			
			case 3: {
				aplicacion.darBajaElemento();
				break;
			}
			case 4: {
				
				
				String eleccion;
				System.out.println("¿Deseas cerrar el menu?");
				eleccion = Inicio.sc.next();
				
				if (eleccion.equals("si")) {
					  cerrarMenu = true;
				}
				
				break;
			}
		/*
			case 5: {
				aplicacion.mostrarElementos();
				break;
			}
		*/
			default:
				System.out.println("La opcion escogida no existe");
			}
		} while (!cerrarMenu);
	}

}
