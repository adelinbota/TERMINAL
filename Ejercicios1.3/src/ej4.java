import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		// Crea dos vectores que tengan el mismo tamaño (lo pedirá por teclado), en uno
		// de ellos almacenaras nombres de personas como cadenas, en el otro vector ira
		// almacenando la edad de los nombres. Crea un procedimiento (subproceso) que
		// muestre por pantalla el contenido de los dos vectores.
		String vNombres[];
		int vNumeros[];
		int tam;
		Scanner leer=new Scanner(System.in);
		System.out.println("Dime la longitud de los vectores");
		tam=leer.nextInt();
		vNombres=new String[tam];
		vNumeros=new int[tam];
		for (int i=0; i<vNombres.length; i++) {
			for (int j=0; j<vNumeros.length; j++) {
				System.out.println(vNombres[i]);
				System.out.println(vNumeros[i]);
			}
		}
	}

}
