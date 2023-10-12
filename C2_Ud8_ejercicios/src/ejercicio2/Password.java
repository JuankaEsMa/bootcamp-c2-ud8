package ejercicio2;

public class Password {
	int LONG_DEFAULT = 8;

	private int longitud = LONG_DEFAULT;
	private String contraseña;
	
	public Password() {
		
	}

	public Password(int longitud) {
		this.longitud = longitud;
		generarContraseña();
	}
	
	private void generarContraseña() {
		String cadena = "";
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789*+-$%!¡?¿&#";
		for (int i = 0; i < longitud; i++) {
			int randomNumber = (int)(Math.random()*characters.length());
			cadena += characters.charAt(randomNumber);
		}
		contraseña = cadena;
	}

	public String getContraseña() {
		return contraseña;
	}
	
	
}
