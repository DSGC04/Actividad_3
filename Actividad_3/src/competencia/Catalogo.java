package competencia;

import java.util.ArrayList;

public class Catalogo {

	private ArrayList<Competidor>listaDeCompetidor=new ArrayList<>();
	private ArrayList<Categoria>listaDeCategoria=new ArrayList<>();
	
	public void agregarCompetidor(Competidor competidor) {
		listaDeCompetidor.add(competidor);
	}
	
	public void elimarCompetidor(Competidor competidor) {
		listaDeCompetidor.remove(competidor);
	}
	
	public void agregarCategoria(Categoria categoria) {
		listaDeCategoria.add(categoria);
	}
	
	public void eliminarCategoria(Categoria categoria) {
		listaDeCategoria.remove(categoria);
	}

	public ArrayList<Competidor> getListaDeCompetidor() {
		return listaDeCompetidor;
	}

	public void setListaDeCompetidor(ArrayList<Competidor> listaDeCompetidor) {
		this.listaDeCompetidor = listaDeCompetidor;
	}

	public ArrayList<Categoria> getListaDeCategoria() {
		return listaDeCategoria;
	}

	public void setListaDeCategoria(ArrayList<Categoria> listaDeCategoria) {
		this.listaDeCategoria = listaDeCategoria;
	}
	
}
