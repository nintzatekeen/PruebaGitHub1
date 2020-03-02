package ejercicio2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class DuplicadorValidado extends DuplicadorDeArchivo{
	char[] ignorar;
	public DuplicadorValidado(String nomfich) {
		super(nomfich);
	}
	public DuplicadorValidado() {
		super();
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
			ignorar= new char[4];
			ignorar[0]='w';
			ignorar[1]='x';
			ignorar[2]='e';
			ignorar[3]='ñ';
			FileReader fr=new FileReader(f);
			PrintWriter pw=new PrintWriter(new File(nuevofich));
			int n=fr.read();
			while(n!=-1) {
				if(!repetido((char)n)) {
					pw.write((char)n);
				}
				n=fr.read();
			}
			fr.close();
			pw.close();
			return true;
		}
	}
	public boolean repetido(char n) {
		for(char c:ignorar) {
			if(c==n)
				return true;
		}
		return false;
	}
		
}
