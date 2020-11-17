package Ejercicios_cadenas;

public class Ejercicio6 {
	public static String quitarEspacios(String nombre) {
		String sinEspacios="";
		
		//Quitar los espacios del principio
		for (int i=0; i<nombre.length(); i++) {
			if (!nombre.substring(i, i+1).equals(" ")) {
				sinEspacios = nombre.substring(i);
				break;
			}
		}
		
		nombre = sinEspacios;
		//Quitar los espacios del final
		for(int i = nombre.length()-1; i >= 0; i--) {
			if (!nombre.substring(i, i+1).equals(" ")) {
				sinEspacios = nombre.substring(0,i+1);
				break;
			} 
		}
		
		nombre = sinEspacios;
		sinEspacios="";
		//Quitar los espacios del medio
		for(int i = 0; i<nombre.length(); i++) {
			if (nombre.substring(i, i+1).equals(" ")) {
				if (!nombre.substring(i+1, i+2).equals(" ")) {
					sinEspacios = sinEspacios + nombre.substring(i,i+1);
				}
			}else {
				sinEspacios = sinEspacios + nombre.substring(i,i+1); 
			}
		}
		
		return sinEspacios;
	}
	
	public static String ponerNombreMayusculas(String nombre) {
		String mayus="";
		nombre = nombre.toLowerCase();
		
		mayus = nombre.substring(0, 1).toUpperCase();
		//Mirando el anterior
//		for (int i=1; i<nombre.length(); i++) {
//			if (!nombre.substring(i, i+1).equals(" ")) {
//				if (nombre.substring(i-1, i).equals(" ")) {
//					mayus = mayus + nombre.substring(i, i+1).toUpperCase();
//				}else {
//					mayus = mayus + nombre.substring(i, i+1);
//				}
//			}else {
//				mayus = mayus + nombre.substring(i, i+1);
//			}
//		}
		
		//Mirando el siguiente
		for (int i = 1; i < nombre.length(); i++) {
			if (nombre.substring(i, i+1).equals(" ")) {
				mayus = mayus + nombre.substring(i, i+2).toUpperCase();
				i++;
			}else {
				mayus = mayus + nombre.substring(i, i+1);
			}
		}
		
		return mayus;
	}
	
	public static void main(String[] args) {
		String nombre = "   aDelino BotiCa    ";
		System.out.println(ponerNombreMayusculas(quitarEspacios(nombre)));
	}

}
