package ejercicio1;

import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {

		/*try
		{
			String dni = JOptionPane.showInputDialog("Ingrese su Numero de Dni: ");
			Dni.VerificarDniInvalido(dni);
			System.out.println("DNI VALIDO");
		}
		catch(DniInvalido e)
		{
			System.out.println("Debe Tener solo numeros!");
			e.printStackTrace();
		}*/
		
		
		Archivo archivo = new Archivo();
		archivo.setRuta("Personas.txt");
		
		if(archivo.existe())
		{
			System.out.println("Existe archivo");
			
			archivo.lee_lineas();
			
			
		}
		else
		{
			System.out.println("No existe archivo.");
		}
		
		
	}
	
	
	
	

	
	
	

}
