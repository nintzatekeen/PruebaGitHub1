package ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class DuplicadorPorBloque extends DuplicadorDeArchivo{
	public DuplicadorPorBloque(String nomfich) {
		super(nomfich);
	}
	public DuplicadorPorBloque() {
		super();
	}

	@Override
	public boolean duplicar(String nuevofich) throws FileNotFoundException, IOException {
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
			char[] buffer=new char[20];
			Reader fr=new FileReader(f);
			Writer fw=new FileWriter(nuevofich);
			int n=fr.read(buffer);
			while(n>0) {
				fw.write(buffer, 0, n);
				n=fr.read(buffer);
			}
			fr.close();
			fw.close();
			return true;
		}
	}
}
