package pruebas_ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IODatos {

		public static void mostrar (String nombrefichero, int longitudlinea) {
			File a = new File(nombrefichero);
			FileReader fr = null;
			Scanner leer = null;
			
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
					formatearLinea(linea, longitudlinea);
					
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}finally {
				try {
					leer.close();
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		private static void formatearLinea(String linea, int longitudlinea) {
			Persona p;
			String nombre = null, apellido = null;
			int nip;
			nip = Integer.parseInt(linea.substring(0, 6));
			String aux = linea.substring(0).trim();
			int pos = aux.indexOf(",");
			apellido = aux.substring(0, pos+1);
			nombre = aux.substring(pos+2);
			for (int i = 0; i < (longitudlinea - nombre.length() - apellido.length() - Integer.toString(i).length()); i++) {
				String puntos = ".";
			}
			p = new Persona(nombre,apellido,nip);
			System.out.println(p.mostarDatos(longitudlinea));
			String puntos = null;
			System.out.println(apellido + " " + nombre + "" + puntos + "" + nip);
		}
}
