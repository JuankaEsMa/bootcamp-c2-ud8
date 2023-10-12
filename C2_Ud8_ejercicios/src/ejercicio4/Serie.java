package ejercicio4;

public class Serie {
	final int TEMPORADAS_DEFAULT = 3;
	final boolean ENTREGADO_DEFAULT = false;
	
	private String titulo = "El cementerio de animales";
	private int numeroTemporadas = TEMPORADAS_DEFAULT;
	private boolean entregado = ENTREGADO_DEFAULT;
	private String genero = "Horror";
	private String creador = "Stephen king";
	
	public Serie() {
	}
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}
	public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.genero = genero;
		this.creador = creador;
	}
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numeroTemporadas=" + numeroTemporadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}

}
