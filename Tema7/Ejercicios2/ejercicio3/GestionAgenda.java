package ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class GestionAgenda {
	private String nomfich;
	public GestionAgenda(String filename) {
		nomfich=filename;
	}
	public void ver() throws IOException {
		File f=new File(nomfich);
		if(!f.exists()) {
			System.out.println("Error: El fichero especificado no existe");
		}
		else {
			BufferedReader br=new BufferedReader(new FileReader(f));
			String linea=br.readLine();
			while(linea!=null) {
				System.out.println(linea);
				linea=br.readLine();
			}
			br.close();
		}
	}
	public void anadePersona(Persona nuevapersona) throws IOException {
		PrintWriter pw=new PrintWriter(new FileWriter(nomfich, true));
		pw.print("\n"+nuevapersona.getTelefono()+"\t"+nuevapersona.getEdad()+"\t"+nuevapersona.getNombre()+"\t"+nuevapersona.getLugar());
		pw.close();
	}
	public Persona buscaPersona(String nombre) throws IOException {
		File f=new File(nomfich);
		if(!f.exists()) {
			System.out.println("Error: No existe la ruta especificada");
			return null;
		}
		else {
			BufferedReader br=new BufferedReader(new FileReader(f));
			String linea=br.readLine();
			/*while(linea!=null) {
				String[] aux=linea.split("\t");
				if(aux[2].equals(nombre)) {
					br.close();
					Persona ret=new Persona(aux[2], Integer.valueOf(aux[1]), aux[0], aux[3]);
					return ret;
				}
				linea=br.readLine();
			}
			br.close();
			*/
			while(linea!=null) {
				if(nombreEnLinea(linea, nombre)) {
					br.close();
					return transforma(linea);
				}
				linea=br.readLine();
			}
			br.close();
			System.out.println("No se encontró ninguna coincidencia");
			return null;
		}
	}
	public boolean nombreEnLinea(String linea, String nombre) {
		if(linea.contains(nombre)) {
			return true;
		}
		else {
			return false;
		}
	}
	public Persona transforma(String linea) {
		String[] aux=linea.split("\t");
		Persona ret=new Persona(aux[2], Integer.valueOf(aux[1]), aux[0], aux[3]);
		return ret;
	}
	public void eliminaPersona(Persona eliminada) throws IOException {
		File f=new File(nomfich);
		if(eliminada==null) {
			System.out.println("Error: No ha especificado una pesona válida");
		}
		else if(!f.exists()) {
			System.out.println("Error: Fichero especificado inválido");
		}
		else {
			BufferedReader br=new BufferedReader(new FileReader(nomfich));
			String linea=br.readLine();
			ArrayList<Persona> personas=new ArrayList<Persona>();
			while(linea!=null) {
				//recorre todo el array por si contuviese dos entradas con los mismo datos (misma persona repetida)
				String[] aux=linea.split("\t");
				Persona persaux=new Persona(aux[2], Integer.valueOf(aux[1]), aux[0], aux[3]);	
				if(!eliminada.equals(persaux)) {
					personas.add(persaux);
				}
				linea=br.readLine();
			}
			br.close();
			BufferedWriter bw=new BufferedWriter(new FileWriter(nomfich));
			Iterator<Persona>it=personas.iterator();
			Persona auxiliar=it.next();
			bw.write(auxiliar.getTelefono()+"\t"+auxiliar.getEdad()+"\t"+auxiliar.getNombre()+"\t"+auxiliar.getLugar());
			while(it.hasNext()) {
				bw.newLine();
				auxiliar=it.next();
				bw.write(auxiliar.getTelefono()+"\t"+auxiliar.getEdad()+"\t"+auxiliar.getNombre()+"\t"+auxiliar.getLugar());
			}
			bw.close();
		}
	}
}
