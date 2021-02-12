package Redesociales;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IODatos {
	public static void mostrar (String nombrefichero) {
		File a = new File(nombrefichero);
		FileReader fr = null;
		Scanner leer = null;
		FileWriter fw;
		if (!a.exists()) {
			try {
				a.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			fr = new FileReader(a);
			leer = new Scanner(fr);
			
			while(leer.hasNext()) {
				String linea = leer.nextLine();
				cargarDatos(null, linea);
				
			}
		try {
			fw = new FileWriter(nombrefichero, true);
			PrintWriter pw = new PrintWriter(fw);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void cargarDatos(String vMensje[], String nombre) {
	
	}
}
