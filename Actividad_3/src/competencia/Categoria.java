package competencia;

import java.util.Objects;

public class Categoria {

	private String nombreDeCategoria;
	private double distanciaRecorrida;
	private String genero;
	
	public Categoria(String nombreDeCategoria, double distanciaRecorrida, String genero) {
		this.nombreDeCategoria = nombreDeCategoria;
		this.distanciaRecorrida = distanciaRecorrida;
		this.genero = genero;
	}

	public String getNombreDeCategoria() {
		return nombreDeCategoria;
	}

	public void setNombreDeCategoria(String nombreDeCategoria) {
		this.nombreDeCategoria = nombreDeCategoria;
	}

	public double getDistanciaRecorrida() {
		return distanciaRecorrida;
	}

	public void setDistanciaRecorrida(double distanciaRecorrida) {
		this.distanciaRecorrida = distanciaRecorrida;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Double.valueOf(distanciaRecorrida), genero, nombreDeCategoria);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Double.doubleToLongBits(distanciaRecorrida) == Double.doubleToLongBits(other.distanciaRecorrida)
				&& Objects.equals(genero, other.genero) && Objects.equals(nombreDeCategoria, other.nombreDeCategoria);
	}

	@Override
	public String toString() {
		return "Categoria [nombreDeCategoria=" + nombreDeCategoria + ", distanciaRecorrida=" + distanciaRecorrida
				+ ", genero=" + genero + "]";
	}

	
	
	
	
}
