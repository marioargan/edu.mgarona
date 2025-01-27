package servicios;

public class MenuImplementacion implements MenuInterfaz {
	
	
	@Override
	public void menu() {
		//Menu de la aplicacion
		System.out.println("=========Menu==============");
		System.out.println("1.Dar alta de un elemento");
		System.out.println("2.Modificar la cantidad");
		System.out.println("3.Dar Baja Elemento");
		System.out.println("4.Cerrar Menu");
		System.out.println("==========================");
	}
	
	
	
	
}
