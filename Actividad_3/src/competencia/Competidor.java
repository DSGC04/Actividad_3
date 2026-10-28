package competencia;

import java.util.Objects;

public class Competidor {

	private String nombreDelCompetidor;
	private byte numeroDeCarrera;
	private String genero;
	private Categoria categoria;
	private boolean carreraTerminada;
	private byte lugarObtenido;
	
	public Competidor(String nombreDelCompetidor, byte numeroDeCarrera, String genero, Categoria categoria,
			boolean carreraTerminada, byte lugarObtenido) {
		this.nombreDelCompetidor = nombreDelCompetidor;
		this.numeroDeCarrera = numeroDeCarrera;
		this.genero = genero;
		this.categoria = categoria;
		this.carreraTerminada = carreraTerminada;
		this.lugarObtenido = lugarObtenido;
	}

	public Competidor(String nombreDelCompetidor, byte numeroDeCarrera, String genero, Categoria categoria) {
		super();
		this.nombreDelCompetidor = nombreDelCompetidor;
		this.numeroDeCarrera = numeroDeCarrera;
		this.genero = genero;
		this.categoria = categoria;
	}

	public String getNombreDelCompetidor() {
		return nombreDelCompetidor;
	}

	public void setNombreDelCompetidor(String nombreDelCompetidor) {
		this.nombreDelCompetidor = nombreDelCompetidor;
	}

	public boolean isCarreraTerminada() {
		return carreraTerminada;
	}

	public void setCarreraTerminada(boolean carreraTerminada) {
		this.carreraTerminada = carreraTerminada;
	}

	public byte getLugarObtenido() {
		return lugarObtenido;
	}

	public void setLugarObtenido(byte lugarObtenido) {
		this.lugarObtenido = lugarObtenido;
	}

	public byte getNumeroDeCarrera() {
		return numeroDeCarrera;
	}

	public String getGenero() {
		return genero;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Boolean.valueOf(carreraTerminada), categoria, genero, Byte.valueOf(lugarObtenido),
				nombreDelCompetidor, Byte.valueOf(numeroDeCarrera));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Competidor other = (Competidor) obj;
		return carreraTerminada == other.carreraTerminada && Objects.equals(categoria, other.categoria)
				&& Objects.equals(genero, other.genero) && lugarObtenido == other.lugarObtenido
				&& Objects.equals(nombreDelCompetidor, other.nombreDelCompetidor)
				&& numeroDeCarrera == other.numeroDeCarrera;
	}

	@Override
	public String toString() {
		return "Competidor [nombreDelCompetidor=" + nombreDelCompetidor + ", numeroDeCarrera=" + numeroDeCarrera
				+ ", genero=" + genero + ", categoria=" + categoria + ", carreraTerminada=" + carreraTerminada
				+ ", lugarObtenido=" + lugarObtenido + "]";
	}
	
	
	
}
