package consultorio;
import java.util.ArrayList;
import java.util.List;
public class Catalogo {

	private List<Especialista>listaEspecialista=new ArrayList<>();
	private List<Paciente>listaPaciente = new ArrayList<>();
	
	public void agregarEspecialista(Especialista especialista) {
		listaEspecialista.add(especialista);
	}
	
	public void eliminarEspecialista(Especialista especialista) {
		listaEspecialista.remove(especialista);
	}
	
	public void agregarPaciente(Paciente paciente) {
		listaPaciente.add(paciente);
	}
	
	public void eliminarPacientea(Paciente paciente) {
		listaPaciente.remove(paciente);
	}

	public List<Especialista> getListaEspecialista() {
		return listaEspecialista;
	}

	public List<Paciente> getListaPaciente() {
		return listaPaciente;
	}

	@Override
	public String toString() {
		return "Catalogo []";
	}
	
	

}
