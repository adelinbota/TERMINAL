package Agenda;

import java.util.Scanner;

public class agenda {
	public static int pintaMenu() {
		Scanner leer = new Scanner(System.in);
		int opc = 0;
		do {
			System.out.println("Pulse 1 para añadir un contacto");
			System.out.println("Pulse 2 para buscar un contacto");
			System.out.println("Pulse 3 para borrar un contacto");
			System.out.println("Pulse 4 para editar un contacto");
			System.out.println("Pulse 5 para ver la lista de contactos");
			System.out.println("Pulse 6 para salir");
			opc = leer.nextInt();
			if (opc < 1 || opc > 6) {
				System.out.println("No acertaste el numero, vuelve a probar");
			}

		} while (opc > 0 || opc < 7);

		return opc;
	}
	public static void guardarContacto(String mContactos) {
		Scanner leer = new Scanner(System.in);
		int numero;
		String nombre;
		System.out.println("Dime el nombre del contacto");
		nombre =  leer.nextLine();
		System.out.println("Dime el numero del contacto");
		numero = leer.nextInt();
		int aux = 0;
		for (int i=0; i>mContactos.length(); i++) {

		}
		System.out.println("El contacto es " + nombre + "y su numero " + numero);
	}
	public static void buscarContacto(String mContactos) {
		System.out.println("Dime el nombre del contacto que quieres buscar");
		Scanner leer = new Scanner(System.in);
		String nombre;
		nombre =  leer.nextLine();
		for (int i=0; i>mContactos.length(); i++) {
			if (condition) {
				System.out.println("El contacto que desea buscar es");
			} else {
				System.out.println("El contacto que busca no existe");
			}
			
		}
		
	}
	public static void borrarContacto(String mContactos) {
		System.out.println("Dime el nombre del contacto que desea buscar");
		Scanner leer = new Scanner(System.in);
		String nombre;
		nombre =  leer.nextLine();
		for (int i=0; i>mContactos.length(); i++) {
			
		}
		
	}
	public static void editarContacto(String mContactos) {
		System.out.println("Dime el numero del contacto que deseas editar");
		Scanner leer = new Scanner(System.in);
		int numero;
		numero =  leer.nextInt();
		for (int i=0; i>mContactos.length(); i++) {
			if (condition) {
				System.out.println("El contacto que desea editar se ha encontrado");
				System.out.println("");
			} else {

			}
		}
	}
	public static void mostrarContacto(String mContactos) {
		System.out.println("Esta es la lista de contactos que tienes actualmente " + mContactos);
		
	}
	public static void main(String[] args) {
		// Agenda como en Pseint.
		int menu = 6;
		int numero;
		int i = 0;
		Scanner leer = new Scanner(System.in);
		String nombre;
		String mContactos[][] = new String[10][2];

		// 1. Dibujar menu.
		menu = pintaMenu();

		switch (menu) {
		case 1:
			System.out.println("Vamos a añadir un contacto");
			//guardarContacto(mContactos);
			break;
		case 2:
			System.out.println("Vamos a buscar un contacto");
			// buscarContacto (mContactos);
			break;
		case 3:
			System.out.println("Vamos a borrar un contacto");
			// borrarContacto(mContactos);
			break;
		case 4:
			System.out.println("Vamos a editar un contacto");
			// editarContacto(mContactos);
			break;
		case 5:
			System.out.println("Vamos a mostrar una lista con tus contactos");
			// mostrarContacto(mContactos);
			break;
		case 6:
			System.out.println("Salir del menu");
			break;
		default:
			break;
		}
	}

}
