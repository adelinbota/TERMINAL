package Modulo;

public class Principal {

	public static void main(String[] args) {
		Modulo vModulo[] = new Modulo[3];
		vModulo[0] = new Modulo(" Progamacion", " 9p", 30);
		vModulo[1] = new Modulo(" Lenguaje", " 3LM", 65);
		for (Modulo modulo : vModulo) {
			if (modulo !=null) {
				System.out.println(modulo.toString());
			}
		}
	}

}
