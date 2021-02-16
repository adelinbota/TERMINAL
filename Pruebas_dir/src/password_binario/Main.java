package password_binario;

public class Main {

	public static void main(String[] args) {
		Password vPassword[] = new Password[10];
		vPassword[0] = new Password("Manué", 1, false);
		vPassword[1] = new Password("Rubé", 2, true);
		vPassword[2] = new Password("Tomá", 3, false);
		vPassword[3] = new Password("Iné", 4, true);
		vPassword[4] = new Password("Adelí", 5, false);
		
		Password vPassword1[] = cargarDatos("pass.dat");
		IODatos.guardarDatos("pass.dat", vPassword1);
	}

	private static Password[] cargarDatos(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
