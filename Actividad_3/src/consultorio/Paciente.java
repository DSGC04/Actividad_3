package consultorio;

import java.time.LocalDate;
import java.util.Objects;

public class Paciente {
     
	private String nombre;
	private long telefono;
	private LocalDate fechaDeNacimento;
	private String direccion;
	
	public Paciente(String nombre, LocalDate fechaDeNacimento, String direccion) {
		this.nombre = nombre;
		this.fechaDeNacimento = fechaDeNacimento;
		this.direccion = direccion;
	}
	
	public Paciente(String nombre, byte telefono, LocalDate fechaDeNacimento, String direccion) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.fechaDeNacimento = fechaDeNacimento;
		this.direccion = direccion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public long getTelefono() {
		return telefono;
	}


	public void setTelefono(byte telefono) {
		this.telefono = telefono;
	}


	public LocalDate getFechaDeNacimento() {
		return fechaDeNacimento;
	}


	public void setFechaDeNacimento(LocalDate fechaDeNacimento) {
		this.fechaDeNacimento = fechaDeNacimento;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	@Override
	public int hashCode() {
		return Objects.hash(direccion, fechaDeNacimento, nombre, telefono);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		return Objects.equals(direccion, other.direccion) && Objects.equals(fechaDeNacimento, other.fechaDeNacimento)
				&& Objects.equals(nombre, other.nombre) && telefono == other.telefono;
	}


	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", telefono=" + telefono + ", fechaDeNacimento=" + fechaDeNacimento
				+ ", direccion=" + direccion + "]";
	}
	
	
}
