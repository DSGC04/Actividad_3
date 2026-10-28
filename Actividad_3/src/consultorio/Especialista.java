package consultorio;

import java.util.Objects;

public class Especialista {

	private String nombre;
	private String cedula;
	private long telefono;
	private String email;
	
	public Especialista(String nombre, String cedula, byte telefono, String email) {
		this.nombre = nombre;
		this.cedula = cedula;
		this.telefono = telefono;
		this.email = email;
	}
	
	public Especialista(String nombre, String cedula, byte telefono) {
		this.nombre = nombre;
		this.cedula = cedula;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(byte telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cedula, email, nombre, telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Especialista other = (Especialista) obj;
		return Objects.equals(cedula, other.cedula) && Objects.equals(email, other.email)
				&& Objects.equals(nombre, other.nombre) && telefono == other.telefono;
	}

	@Override
	public String toString() {
		return "Especialista [nombre=" + nombre + ", cedula=" + cedula + ", telefono=" + telefono + ", email=" + email
				+ "]";
	}

	
	}
	
	
