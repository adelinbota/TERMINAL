import java.util.Scanner;

public class ej3 {
	public static void rellena_vector(int vNum[],int num) {
		for (int i=0; i<vNum.length; i++) {
			vNum[i]=num*i;
		}
	}

	public static void main(String[] args) {
		// Crea un vector en el que le indiques el tamaño por teclado y crear una
		// función que rellene el vector con los múltiplos de un número pedido por
		// teclado.
		int vNum[];
		int tam,num;
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime los multiplos que quieres obtener");
		tam = leer.nextInt();
		
		vNum = new int[tam];
		
		System.out.println("Dime el numero");
		num = leer.nextInt();
		rellena_vector(vNum, num);
		for (int i=0; i<vNum.length; i++) {
			System.out.println(vNum[i]);
		}
	}

}
