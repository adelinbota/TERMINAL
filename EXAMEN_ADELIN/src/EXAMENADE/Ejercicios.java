package EXAMENADE;


import java.util.Random;
import java.util.Scanner;


public class Ejercicios {	
	
	public static void Ejercicio1sumarNumeros() {
		Scanner leer = new Scanner(System.in);
		Random r = new Random();
		int numero;
		int suma = 0;
		System.out.println("Se sumarán 5 numeros aleatorios");
		numero = r.nextInt(1000);
		numero = r.nextInt(1000);
		numero = r.nextInt(1000);
		numero = r.nextInt(1000);
		numero = r.nextInt(1000);
		suma = suma + numero;
	}
	public static int Ejercicio2indicarMayor(int num1, int num2, int num3) {
		int mayor=0;
		if (num1>num2 || num1>num3) {
			mayor=num1;
			System.out.println("El mayor de todos es " + num1);
		}
		if (num2>num1 || num2>num3) {
			mayor=num2;
			System.out.println("El mayor de todos es " + num2);
		}
		if (num3>num1 || num3>num2) {
			mayor=num3;
			System.out.println("El mayor de todos es " + num3);
		}
		return mayor;
	}
	public static void Ejercicio3alturaAsteriscos() {
		Scanner leer = new Scanner(System.in);
		Random r = new Random();
		int numero;
		System.out.println("Dime un numero del 1 al 4");
		numero = leer.nextInt();
		if (numero==1) {
			System.out.println("*");
		}
		if (numero==2) {
			System.out.println("**");
			System.out.println("*");
		}
		if (numero==3) {
			System.out.println("***");
			System.out.println("**");
			System.out.println("*");
		}
		if (numero==4) {
			System.out.println("****");
			System.out.println("***");
			System.out.println("**");
			System.out.println("*");
		}
		if (numero<1 || numero>4) {
			System.out.println("Error");
		}
	}
	public static void Ejercicio4recibeNumero() {
		Scanner leerLine = new Scanner(System.in);
		Scanner leer = new Scanner(System.in);
		int numero;
		int contador=0;
		String nombre;
		String losEspacios = " ";
		System.out.println("Dime un nombre");
		nombre = leerLine.nextLine();
		System.out.println("Ahora indique un numero entre el 1 y el 2");
		numero= leer.nextInt();
		if (numero==1) {
			System.out.println("Contaremos el numero de letras que tiene su nombre");
			for (int i=0; i<nombre.length();i++) {
				losEspacios.substring(i-1);
				contador++;
			}
		if (numero==2) {
			System.out.println("Te intentaremos poner el nombre en mayúsculas");
			for (int i=0; i<nombre.length();i++) {
				nombre.substring(i-1).toUpperCase();
			}
			if (numero<1 || numero>2) {
				System.out.println("Error");
			}
		}
		} 
		
		
	}
	public static String Ejercicio6coincidirTexto(String texto) {
		Scanner leerLine = new Scanner(System.in);
		String palabra;
		String losEspacios = "";
		boolean encontrar;
		System.out.println("Dime una palabra y te diré si está en el texto");
		palabra = leerLine.nextLine();
		for (int i=0; i<texto.length();i++) {
			encontrar = true;
			palabra.substring(i-1).equals(texto);
			System.out.println("La palabra coincide");
		}
		encontrar = false;
		return texto;
	}
	public static String Ejercicio7nombreMayus(String nombre) {
		Scanner leerLine = new Scanner(System.in);
		String losEspacios = " ";
		String mayus;
		for (int i=0; i<nombre.length(); i++) {
			mayus = nombre.substring(i-1);
			nombre.substring(i-1).toUpperCase();
			losEspacios.substring(i-1);
		}
		
		return nombre;
	}
	public static void Ejercicio8letrasVector() {
		Scanner leerLine = new Scanner(System.in);
		String vLetras[];
		String nombre;
		System.out.println("Dime un nombre");
		nombre = leerLine.nextLine();
		for (int i=0; i<nombre.length(); i++) {
			vLetras = new String[nombre.length()];
			System.out.println(vLetras[i]);
			System.out.println(vLetras[i+1]);
			System.out.println(vLetras[i+2]);
			System.out.println(vLetras[i+3]);
			System.out.println(vLetras[i+4]);
			System.out.println(vLetras[i+5]);
			System.out.println(vLetras[i+6]);
			System.out.println(vLetras[i+7]);
			System.out.println(vLetras[i+8]);
			System.out.println(vLetras[i+9]);
			System.out.println(vLetras[i+10]);
			System.out.println(vLetras[i+11]);
			System.out.println(vLetras[i+12]);
			System.out.println(vLetras[i+13]);
			System.out.println(vLetras[i+14]);
			
		}
	}

}
