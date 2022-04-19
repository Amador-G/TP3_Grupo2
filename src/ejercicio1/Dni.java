package ejercicio1;

public class Dni 
{
	int numero;
	
	public static boolean VerificarDniInvalido(String dni) throws DniInvalido
	{
		
		boolean SoloNumeros = true;
        
		for (int i = 0; i < dni.length(); i++) 
		{
            if (!Character.isDigit(dni.charAt(i)))
            {
                SoloNumeros = false;
            }
        }
		
		if(SoloNumeros == false) 
		{
			throw new  DniInvalido();
			
		}
	
		if(SoloNumeros)
		{
			return true;
		}
		return false;
	}	
	
}
	

