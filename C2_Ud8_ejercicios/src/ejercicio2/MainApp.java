package ejercicio2;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Password password = new Password(12);
		System.out.println(password.getContraseña());
		Password password2 = new Password();
		System.out.println(password2);
	}

}
