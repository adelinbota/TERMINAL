import java.util.Scanner;

public class ejerciciopintamenu {
	public static int pintaMenu() {
		int opcion = 0;
		Scanner leer = new Scanner(System.in);
		while (opcion < 1 || opcion > 3) {
			System.out.println("1-Hola");
			System.out.println("2-Si");
			System.out.println("3-Salir");
			System.out.println(" - ");
			System.out.println("Dime una opcion");
			opcion = leer.nextInt();
		}
		return opcion;
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc=0;
		do {
			opc=pintaMenu();
		switch (opc) {
		case 1:
			System.out.println("Hola");
			break;
		case 2:
			System.out.println("Si");
			break;
		case 3:
			System.out.println("Salir");
			break;
		}
		} while (opc!=3);
		
		// pintaMenu();
	}

}
