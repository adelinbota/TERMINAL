import java.util.Random;
import java.util.Scanner;

public class ej2 {
	public static float calcular_media(float vNum[]) {
		float media = 0;
		float suma=0;
		for (int i=0; i<vNum.length; i++) {
			suma = suma + vNum[i];
		}
		
		media = suma / vNum.length;
		return media;
		
	}
	public static void main(String[] args) {
		// Realiza el problema anterior creando una función (subproceso)
		// “calcular_media” la cual reciba como parámetros un vector, el tamaño del
		// mismo y devuelve la media de los valores del vector.
		float vNumeros[] = new float[10];
		float suma=0;
		Scanner leer = new Scanner(System.in);
		Random azar = new Random();
		float media;
		
		for (int i=0; i>vNumeros.length; i++) {
			vNumeros[i]=azar.nextInt(10);
		}
		media = calcular_media(vNumeros);
		media=suma/vNumeros.length;
		System.out.println("La media es " + media);
	}

}
