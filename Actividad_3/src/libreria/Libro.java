package libreria;

import java.util.Objects;

public class Libro {
	private String titulo;
	private String autor;
	private int añoDePublicacion;
	private int edicion;
	private String editorial;
	private String listaDeLibros;
	
	public void inicializacionLibro(String titulo, String autor, int añoDePublicacion,
			int edicion, String editorial, String listaDeLibros) {
		
		this.titulo=titulo;
		this.autor=autor;
		this.añoDePublicacion=añoDePublicacion;
		this.edicion=edicion;
		this.editorial=editorial;
		this.listaDeLibros=listaDeLibros;
	}
	
	public void Libro(String titulo, String autor, 
			int añoDePublicacion,String listaDeLibros) {
		
		this.titulo=titulo;
		this.autor=autor;
		this.añoDePublicacion=añoDePublicacion;
		this.listaDeLibros=listaDeLibros;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAñoDePublicacion() {
		return añoDePublicacion;
	}

	public int getEdicion() {
		return edicion;
	}

	public String getEditorial() {
		return editorial;
	}

	@Override
	public int hashCode() {
		return Objects.hash(autor, Integer.valueOf(añoDePublicacion), Integer.valueOf(edicion), editorial,
				listaDeLibros, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && añoDePublicacion == other.añoDePublicacion
				&& edicion == other.edicion && Objects.equals(editorial, other.editorial)
				&& Objects.equals(listaDeLibros, other.listaDeLibros) && Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", añoDePublicacion=" + añoDePublicacion + ", edicion="
				+ edicion + ", editorial=" + editorial + ", listaDeLibros=" + listaDeLibros + "]";
	}


	
	
}
