package consultorio;

import java.time.LocalDate;
import java.util.Objects;

public class Cita {

	private LocalDate fecha;
	private byte hora;
	private Especialista especialista;
	
	public Cita(LocalDate fecha, byte hora, Especialista especialista) {
		this.fecha = fecha;
		this.hora = hora;
		this.especialista = especialista;
	}
	
	public void darDeAltaCita(LocalDate fecha, byte hora, Especialista especialista) {
		this.fecha=fecha;
		this.hora=hora;
		this.especialista=especialista;
	}

	public Especialista getEspecialista() {
		return especialista;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public byte getHora() {
		return hora;
	}

	@Override
	public int hashCode() {
		return Objects.hash(especialista, fecha, Byte.valueOf(hora));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cita other = (Cita) obj;
		return Objects.equals(especialista, other.especialista) && Objects.equals(fecha, other.fecha)
				&& hora == other.hora;
	}

	@Override
	public String toString() {
		return "Cita [fecha=" + fecha + ", hora=" + hora + ", especialista=" + especialista + "]";
	}
	
	
	

}
