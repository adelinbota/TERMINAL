package Agenda;
import java.util.Random;
import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) {
		String palabraSecreta = conseguirPalabraSecreta();
		System.out.println(palabraSecreta);

		char[] palabraConjunta = espaciosEntrePalabras(palabraSecreta);
		System.out.println(palabraConjunta);
		boolean juegoTerminado = false;
		Scanner leer = new Scanner(System.in);
		int vidas = 6;
		do {
			System.out.println("Te quedan " + vidas + " vidas");
			System.out.println(palabraConjunta);
			System.out.println("Dime una letra");
			char letra = leer.next().charAt(0);
			boolean letraAcertada = false;
			for (int i = 0; i < palabraSecreta.length(); i++) {
				if (palabraSecreta.charAt(i) == letra) {
					palabraConjunta[i] = letra;
					letraAcertada = true;
				}
				if (!letraAcertada) {
					 --vidas;
					 System.out.println("No has acertado la letra, -1 vidas, por lo tanto te quedan " +vidas+ " vidas. Dime otra");
					 if (vidas == 5) {
						 System.out.println("____________________________");
						 char letra = leer.nextLine().charAt(0);
						 
					 }
					 if (vidas == 4) {
						 System.out.println("              |");
						 System.out.println("              |");
						 System.out.println("              |");
						 System.out.println("              |");
						 System.out.println("              |");
						 System.out.println("              |");
						 System.out.println("              |");
						 System.out.println("______________|_____________");
						 char letra = leer.nextLine().charAt(0);
					 }
					 if (vidas ==3) {
						 System.out.println("              ______________");
						 System.out.println("              |            |");
						 System.out.println("              |            |");
						 System.out.println("              |");
						 System.out.println("              |");
						 System.out.println("              |");
						 System.out.println("              |");
						 System.out.println("              |");
						 System.out.println("______________|_____________");
						 char letra = leer.nextLine().charAt(0);
					 }
					 if (vidas == 2) {
						 System.out.println("              ______________");
						 System.out.println("              |            |");
						 System.out.println("              |            |");
						 System.out.println("              |            |");
						 System.out.println("              |         -------");
			             System.out.println("              |        | -  -  |");
			             System.out.println("              |        |   o   |");
			             System.out.println("              |         -------");
						 System.out.println("              |");
						 System.out.println("              |");
						 System.out.println("              |");
						 System.out.println("              |");
						 System.out.println("______________|_____________");
						 char letra = leer.nextLine().charAt(0);
					 }
					 if (vidas ==1) {
						 	System.out.println("                 _____________________");
			                System.out.println("                |                     |");
			                System.out.println("                |                     |");
			                System.out.println("                |                  -------");
			                System.out.println("                |                 | -  -  |");
			                System.out.println("                |                 |   o   |");
			                System.out.println("                |                  -------");
			                System.out.println("                |                     |   ");
			                System.out.println("                |                   / | \\ ");
			                System.out.println("                |                  /  |   \\ ");
			                System.out.println("                |                 /   |     \\ ");
			                System.out.println("                |                     |   ");
			                System.out.println("  ______________|_______________");
			                char letra = leer.nextLine().charAt(0);
					 }
					 if (vidas ==0) {
						 System.out.println("                     _____________________");
			                System.out.println("                 |                     |");
			                System.out.println("                 |                     |");
			                System.out.println("                 |                  -------");
			                System.out.println("                 |                 | X  X  |");
			                System.out.println("                 |                 |   o   |");
			                System.out.println("                 |                  -------");
			                System.out.println("                 |                     |   ");
			                System.out.println("                 |                   / | \\ ");
			                System.out.println("                 |                  /  |   \\ ");
			                System.out.println("                 |                 /   |     \\ ");
			                System.out.println("                 |                     |   ");
			                System.out.println("                 |                    / \\");
			                System.out.println("                 |                   /   \\  ");
			                System.out.println("                 |                  /     \\ ");
			                System.out.println("  _______________|_________________");
			                System.out.println("");
			                System.out.println("GAME OVER");
					 }
						 juegoTerminado=true;
						 
					 }else {
							boolean ahorcadoGanado = !conEspacios(palabraConjunta);
							if (ahorcadoGanado) {
								System.out.println("¡Has conseguido la victoria por acertar la palabra!");
								juegoTerminado=true;
							}
				
						}
			}
		
			
		
			
			
		} while (!juegoTerminado);
	}

	public static String conseguirPalabraSecreta() {
		String[] palabras = { "mola", "mola", "adios" };
		Random r = new Random();
		int n = r.nextInt(palabras.length);

		return palabras[n];
	}

	public static char[] espaciosEntrePalabras(String palabras) {
		int nLetrasPalabraSecreta = palabras.length();

		char[] palabraConjunta = new char[nLetrasPalabraSecreta];

		for (int i = 0; i < palabraConjunta.length; i++) {
			palabraConjunta[i] = ' ';
		}
		return palabraConjunta;
	}

	public static boolean conEspacios(char[] array) {
		for (char l : array) {
			if (l == ' ')
				return true;
		}
		return false;
	}
}