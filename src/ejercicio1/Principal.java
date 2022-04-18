package ejercicio1;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		try
		{
			String dni = JOptionPane.showInputDialog("Ingrese correo electronico: ");
			Dni.VerificarDniValido(dni);
		}
		catch(DniInvalido e)
		{
			System.out.println("Debe Tener solo nuemeros!");
			e.printStackTrace();
		}
	}

}
