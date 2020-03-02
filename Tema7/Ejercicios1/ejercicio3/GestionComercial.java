package ejercicio3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class GestionComercial {
	private String nomfich;
	private File fixero;
	public GestionComercial(String nombrefich) {
		nomfich=nombrefich;
		fixero=new File(nomfich);
	}
	public void guardaComerciales(ArrayList<Comercial> comerciales) throws IOException {
		Iterator<Comercial>it=comerciales.iterator();
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fixero, true));
		while(it.hasNext()) {
			oos.writeObject(it.next());
		}
		oos.writeObject(null);
		oos.close();
	}
	public void verComerciales() throws ClassNotFoundException, FileNotFoundException, IOException{
		if(!fixero.exists()) {
			System.out.println("No se encontró el fichero especificado");
		}
		else {
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fixero));
			Comercial aux=(Comercial)ois.readObject();
			while(aux!=null) {
				aux.ver();
				aux=(Comercial)ois.readObject();
			}
			ois.close();
		}
	}
	public Comercial buscaComercial(String nomComer) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fixero));
		Comercial aux=(Comercial)ois.readObject();
		while(aux!=null) {
			if(aux.getNombre().equalsIgnoreCase(nomComer)) {
				ois.close();
				return aux;
			}
			aux=(Comercial)ois.readObject();
		}
		ois.close();
		return null;
	}
	public void generaFichMoviles(String nomfich) throws FileNotFoundException, IOException, ClassNotFoundException {
		File f=new File(nomfich);
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(f, true));
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fixero));
		Comercial aux=(Comercial)ois.readObject();
		while(aux!=null) {
			aux.getMovil().cargar(10);
			oos.writeObject(aux.getMovil());
			aux=(Comercial)ois.readObject();
		}
		oos.writeObject(null);
		oos.close();
		ois.close();
	}
	public void trabajarTodos() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fixero));
		ArrayList<Comercial>aux=new ArrayList<Comercial>();
		Comercial auxiliar=(Comercial)ois.readObject();
		while(auxiliar!=null) {
			aux.add(auxiliar);
			auxiliar=(Comercial)ois.readObject();
		}
		ois.close();
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fixero));
		for(Comercial c:aux) {
			c.trabajar();
			oos.writeObject(c);
		}
		oos.writeObject(null);
		oos.close();
	}
	
	//Método aparte para visualizar el fichero con los móviles
	public static void verCelulares(String nomfich) throws FileNotFoundException, IOException, ClassNotFoundException {
		File f=new File(nomfich);
		if(!f.exists()) {
			System.out.println("Error: No existe el fichero especificado");
		}
		else {
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream(f));
			TelefonoMovil aux=(TelefonoMovil)ois.readObject();
			while(aux!=null) {
				aux.ver();
				aux=(TelefonoMovil)ois.readObject();
			}
			ois.close();
		}
		
	}
	
}
