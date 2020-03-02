package ejercicio2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class DuplicadorCar extends DuplicadorDeArchivo{
	public DuplicadorCar() {
		super();
	}
	public DuplicadorCar(String nomfich) {
		super(nomfich);
	}
	@Override
	public boolean duplicar(String nuevofich) throws IOException {
		File f=new File(getRuta());
		if(!f.exists()) {
			System.out.println("Error: el fichero no existe");
			return false;
		}
		else if(getRuta().equalsIgnoreCase(nuevofich)) {
			System.out.println("Error: el fichero de origen y destino son el mismo");
			return false;
		}
		else {
			FileReader fr=new FileReader(f);
			PrintWriter pw=new PrintWriter(new File(nuevofich));
			int n=fr.read();
			while(n!=-1) {
				pw.write((char)n);
				n=fr.read();
			}
			fr.close();
			pw.close();
			return true;
		}
	}
}
