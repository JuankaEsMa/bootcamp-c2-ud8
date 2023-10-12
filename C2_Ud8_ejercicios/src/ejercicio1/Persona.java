package ejercicio1;

public class Persona {

	private char SEXO_DEFAULT = 'H';

	private String nombre = "";
	private int edad = 0;
	private String dni;
	private char sexo = SEXO_DEFAULT;
	private double peso = 0;
	private double altura = 0;
	
	
	public Persona() {

	}
	
	public Persona(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = validarEdad(edad);
		this.sexo = validarSexo(sexo);
	}


	public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = validarEdad(edad);
		this.dni = dni;
		this.sexo = validarSexo(sexo);
		this.peso = validarPeso(peso);
		this.altura = validarAltura(altura);
	}
	
	public char validarSexo(char sexo) {
		if(sexo == 'M' || sexo == 'H') {
			return sexo;
		}
		return SEXO_DEFAULT;
	}
	// Hago validadores para que no se pueda poner pesos, alturas o edad negativas
	public double validarPeso(double peso) {
		if(peso > 0) {
			return peso;
		}
		return 0;
	}
	
	public double validarAltura(double altura) {
		if(altura > 0) {
			return altura;
		}
		return 0;
	}
	
	public int validarEdad(int edad) {
		if(edad > 0) {
			return edad;
		}
		return 0;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(int edad) {
		this.edad = validarEdad(edad);
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void setSexo(char sexo) {
		this.sexo = validarSexo(sexo);
	}
	public void setPeso(double peso) {
		this.peso = validarPeso(peso);
	}
	public void setAltura(double altura) {
		this.altura = validarAltura(altura);
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
	
}
