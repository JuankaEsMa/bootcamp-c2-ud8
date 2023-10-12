package ejercicio1;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona = new Persona();
		System.out.println(persona);
		persona.setAltura(-10);
		persona.setEdad(-12);
		persona.setPeso(-20);
		persona.setSexo('L');
		System.out.println(persona);
		persona.setAltura(1.5);
		persona.setEdad(12);
		persona.setPeso(20);
		persona.setSexo('M');
		System.out.println(persona);
	}

}
