import java.util.Scanner;

public class ej4 {
	
	public static void mostarVectores(String vNombres[], int vNumeros[]) {
		for (int i = 0; i < vNombres.length; i++) {
			
			System.out.println(vNombres[i] + "---" + vNumeros[i]);
			
		}

	}

	public static void main(String[] args) {
		// Crea dos vectores que tengan el mismo tamaño (lo pedirá por teclado), en uno
		// de ellos almacenaras nombres de personas como cadenas, en el otro vector ira
		// almacenando la edad de los nombres. Crea un procedimiento (subproceso) que
		// muestre por pantalla el contenido de los dos vectores.
		String vNombres[];
		int vNumeros[], tam, edad;
		String nombre;
		Scanner leer = new Scanner(System.in);
		Scanner leerInt = new Scanner(System.in);
		
		System.out.println("Dime la longitud de los vectores");
		tam = leerInt.nextInt();
		vNombres = new String[tam];
		vNumeros = new int[tam];
		
		
		for (int i = 0; i < vNombres.length; i++) {
			System.out.println("Dime nombre y edad");
			nombre =  leer.nextLine();
			edad = leerInt.nextInt();
			vNombres[i] = nombre;
			vNumeros[i] = edad;
			
			
		}
		mostarVectores(vNombres, vNumeros);
	}

}
