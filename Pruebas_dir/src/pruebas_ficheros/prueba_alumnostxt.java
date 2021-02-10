package pruebas_ficheros;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class prueba_alumnostxt {

	public static void main(String[] args) {
		String nombre, archivo;
		System.out.println("Dime el nombre de la Carpeta 1");
		Scanner leer = new Scanner(System.in);
		nombre = leer.next();
		File a = new File(nombre);
		if (!a.exists()) {
			a.mkdir();
		}
		
		System.out.println("Dime el nombre de un archivo");
		Scanner leerar = new Scanner(System.in);
		archivo = leerar.next();
		File c = new File(archivo);
		if (!c.exists()) {
			try {
				c.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		}
	}

