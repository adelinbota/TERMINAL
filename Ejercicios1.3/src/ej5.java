import java.util.Scanner;

public class ej5 {
	
	public static void inicializarMatriz (String mContactos[][]) {
		for (int i=0; i<mContactos.length; i++) {
			mContactos[i][0]= "";
			mContactos[i][1]= "";
		}
	}

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

		} while (opc < 1 || opc > 6);

		return opc;
	}

	public static void guardarContacto(String mContactos[][]) {
		Scanner leer = new Scanner(System.in);

		for (int i = 0; i < mContactos.length; i++) {
			if (mContactos[i][0].equals("") & mContactos[i][1].equals("")) {
				System.out.println("Dime el nombre del contacto");
				mContactos[i][0] = leer.nextLine();
				System.out.println("Dime el numero del contacto");
				mContactos[i][1] = leer.nextLine();
				System.out.println();
				System.out.println("El contacto añadido es " + (i + 1));
				break;
			} else {
				if (i == mContactos.length - 1) {
					System.out.println("ERROR");
				}
			}
		}
	}

	public static void buscarContacto(String mContactos[][]) {
		Scanner leer = new Scanner(System.in);
		String contBuscado = "";
		int contador = 0;
		System.out.println("Dime el nombre del contacto que quieres buscar");
		contBuscado = leer.nextLine();
		for (int i = 0; i > mContactos.length; i++) {
			boolean encontrar;
			encontrar = false;

			for (int j = 0; j < mContactos[i][0].length() - contBuscado.length() + 1; j++) {
				if (contBuscado.equalsIgnoreCase(mContactos[i][0].substring(j, j + contBuscado.length()))) {
					encontrar = true;
					contador++;
					break;
				}
			}
			if (encontrar) {
				if (contador == 1) {
					System.out.println("Este es el contacto buscado");
				}
				mostrarContacto(mContactos);
			}
		}
	}

	public static void borrarContacto(String mContactos[][]) {
		Scanner leer = new Scanner(System.in);
		String contBorrado;
		System.out.println("Dime el nombre del contacto que desea borrar");
		contBorrado = leer.nextLine();
		if (contBorrado == mContactos[0][0]) {
			System.out.println("El contacto elegido se borrará y quedará vacío");
			mContactos[0][0] = " ";
		} else
			System.out.println("El contacto no coincide");
	}

	public static void editarContacto(String mContactos[][]) {
		Scanner leer = new Scanner(System.in);
		String contEditado;
		int auxiliar = 0;
		boolean error = false;
		System.out.println("Dime el numero del contacto que deseas editar");
		contEditado = leer.nextLine();
		if (contEditado == mContactos[0][0]) {
			System.out.print(" Introduce el nuevo nombre del contacto: > ");
			mContactos[auxiliar - 1][0] = leer.nextLine();
			leer = new Scanner(System.in);
			System.out.print(" Introduce el nuevo teléfono del contacto: >  ");
			mContactos[auxiliar - 1][1] = leer.nextLine();
			System.out.println("\n El contacto se ha guardado correctamente.");
			error = false;
		} else
			System.out.println("El contacto no coincide");
	}

	public static void mostrarContacto(String mContactos[][]) {
		System.out.println("Esta es la lista de contactos que tienes actualmente");
		System.out.println(mContactos[i][0]);
	}

	public static boolean salirMenu() {
		Scanner leer = new Scanner(System.in);
		String salirContacto = "";
		boolean salir = false, error = false;

		System.out.println();

		do {
			System.out.print("¿Quieres volver al menú? (S/N): > ");
			salirContacto = leer.next();
			if (salirContacto.equalsIgnoreCase("s")) {
				salir = false;
				error = false;
			} else {
				if (salirContacto.equalsIgnoreCase("n")) {
					salir = true;
					error = false;
				} else {
					error = true;
				}
			}
		} while (error);

		System.out.println();

		return salir;

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
		case 1: {
			System.out.println("Vamos a añadir un contacto");
			guardarContacto(mContactos);
			break;
		}
		case 2: {
			System.out.println("Vamos a buscar un contacto");
			buscarContacto(mContactos);
			break;
		}
		case 3: {
			System.out.println("Vamos a borrar un contacto");
			borrarContacto(mContactos);
			break;
		}
		case 4: {
			System.out.println("Vamos a editar un contacto");
			editarContacto(mContactos);
			break;
		}
		case 5: {
			System.out.println("Vamos a mostrar una lista con tus contactos");
			mostrarContacto(mContactos);
			break;
		}
		case 6: {
			System.out.println("Salir del menu");
			salirMenu();
			break;
		}
		default:
			break;
		}
	}
}