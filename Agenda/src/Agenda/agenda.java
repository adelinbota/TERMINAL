package Agenda;

import java.util.Scanner;

public class agenda {
	public static int pintaMenu() {
		Scanner leer = new Scanner(System.in);
		int opc=0;
		do {
			System.out.println("Pulse 1 para añadir un contacto");
			System.out.println("Pulse 2 para buscar un contacto");
			System.out.println("Pulse 3 para borrar un contacto");
			System.out.println("Pulse 4 para editar un contacto");
			System.out.println("Pulse 5 para ver la lista de contactos");
			System.out.println("Pulse 6 para salir");
			opc=leer.nextInt();
			if (opc<1 || opc>6) {
				System.out.println("No acertaste el numero, vuelve a probar");
			}
			
		} while (opc>0 || opc<7);

		return opc;
	}
	public static void main(String[] args) {
		// Agenda como en Pseint.
		int menu=6;
		int numero;
		int i=0;
		Scanner leer = new Scanner(System.in);
		String nombre;
		String mContactos[][] = new String[10][2];
		
		// 1. Dibujar menu.
		menu = pintaMenu();
		
		
		switch (menu) {
		case 1:
			//guardarContacto(mContactos);
			
			break;
		case 2:
			System.out.println("Dime el numero del contacto que deseas buscar");
			nombre=leer.next();
			
			break;
		case 3:

			break;
		case 4:

			break;
		case 5:

			break;
		case 6:

			break;
		default:
			break;
		}
		
	}

}
