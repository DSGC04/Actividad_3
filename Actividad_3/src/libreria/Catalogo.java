package libreria;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Catalogo {
	private List<Libro>Ejemplares = new ArrayList<>();
	
	public void agregarEjemplar(Libro Libro) {
		Ejemplares.add(Libro);
	}
	
	public void eliminarEjemplar(Libro Libro) {
		Ejemplares.remove(Libro);
	}

	public List<Libro> getEjemplares() {
		return Ejemplares;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Ejemplares);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Catalogo other = (Catalogo) obj;
		return Objects.equals(Ejemplares, other.Ejemplares);
	}

	@Override
	public String toString() {
		return "Catalogo [Ejemplares=" + Ejemplares + "]";
	}
}
