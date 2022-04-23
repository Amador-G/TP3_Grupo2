package ejercicio1;

import java.util.Objects;

public class Persona {
	private String Nombre;
	private String Apellido;
	private Dni Dninumero;
	
	public Persona() {}
	public Persona(String Nombre, String Apellido,Dni Dni) 
	{
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.Dninumero = Dni;
	}
	
	// getters & setters
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public Dni getDninumero() {
		return Dninumero;
	}
	public void setDninumero(Dni dninumero) {
		Dninumero.setNumero(dninumero.getNumero());
	}
	
	@Override
	public String toString() {
		return "Persona : \nNombre= " + Nombre + "\nApellido= " + Apellido + "\nDninumero=" + Dninumero.getNumero();
	}
	@Override
	public int hashCode() {
		return Objects.hash(Apellido, Dninumero, Nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(Apellido, other.Apellido) && Objects.equals(Dninumero, other.Dninumero)
				&& Objects.equals(Nombre, other.Nombre);
	}
	
	//methods
	

}
