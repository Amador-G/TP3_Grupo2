package ejercicio1;

public class Persona {
	private String Nombre;
	private String Apellido;
	Dni Dninumero;
	
	public Persona() {}
	public Persona(String Nombre, String Apellido,Dni Dni) 
	{
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.Dninumero.setNumero(Dni.getNumero());
	}
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
		Dninumero = dninumero;
	}
	
	

}
