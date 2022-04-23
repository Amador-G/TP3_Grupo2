package ejercicio1;
import java.util.Scanner;
import java.util.TreeSet;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {
	
	private String ruta;
	
	Archivo(){};
	Archivo(String Ruta){this.ruta = Ruta;}
	

	public boolean existe()
	{
		File archivo = new File(ruta); 
		if(archivo.exists())
		      return true;
		return false;
	}
	
	public boolean creaArchivo()
	{
		FileWriter escritura;
		try {
			escritura = new FileWriter(ruta, true);
			escritura.write("");
			escritura.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
			
	}
	
	public void escribe_lineas(String frase) {
		try 
		{	
			FileWriter entrada = new FileWriter(ruta, true);
			BufferedWriter miBuffer = new BufferedWriter(entrada);
			miBuffer.write(frase);
			miBuffer.close();
			entrada.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void lee_lineas() {
		FileReader entrada;
		try {
			entrada = new FileReader(ruta);
			BufferedReader miBuffer = new BufferedReader(entrada);
			
		   String linea = "";
			while (linea != null) {
				System.out.println(linea);
				linea = miBuffer.readLine();
			}
			miBuffer.close();
			entrada.close();

		} catch (IOException e) {
			System.out.println("No se encontro el archivo");
		}
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	
	public void CargarLIsta(TreeSet<Persona> Lista, String Ruta) {
		Scanner s = null;
		try {
				s = new Scanner(Ruta);
				while(s.hasNextLine()) 
				{
					String Linea = s.nextLine();
					String [] cortarString = Linea.split("-");
					Persona persona = new Persona();
					persona.setNombre(cortarString[0]);
					persona.setApellido(cortarString[1]);
					persona.setDni(cortarString[2]);
					Lista.add(persona);				
			    }
			}catch(Exception e){
				e.printStackTrace();
			}finally {
				try {
					if(s!=null) {
						s.close();
					}
				}catch(Exception e2) {
					e2.printStackTrace();
				}
			}
	}
	

}
