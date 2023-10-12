package ejercicio3;

public class Electrodomestico {

	protected double precio;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	
	protected final double PRECIO_DEFAULT = 100;
	protected final String COLOR_DEFAULT = "Blanco";
	protected final char CONSUMO_DEFAULT = 'F';
	protected final double PESO_DEFAULT = 5;
	
	private final String[] coloresDisponibles = {"blanco","negro","rojo","azul","gris"};

	public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
		this.precio = precio;
		this.color = validarColor(color);
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	public Electrodomestico(double precio, double peso) {
		this.precio = precio;
		this.peso = peso;
	}

	public Electrodomestico() {

	}
	
	public String validarColor(String color) {
		for (int i = 0; i < coloresDisponibles.length; i++) {
			if(color.equals(coloresDisponibles[i])) {
				return color;
			}
		}
		return COLOR_DEFAULT;
	}
}
