import java.util.Random;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// Crea un vector con un tamaño de 10, el algoritmo te solicitará por teclado 10
		// números y terminará mostrando por pantalla la media de valores del vector.
		int vNumeros[] = new int[10];
		int suma = 0;
		Scanner leer = new Scanner(System.in);
		Random azar = new Random();
		for (int i = 0; i < vNumeros.length; i++) {
			vNumeros[i] = azar.nextInt(20);
			System.out.print((vNumeros[i]) + " - ");
			suma = suma + vNumeros[i];
		}
		System.out.println("\n La media es " + (suma / vNumeros.length));
	}
}
