package ejercicio2;

import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class DuplicadorDeArchivo {
	private String ruta;
	private final String nompordefecto="fichero";
	public DuplicadorDeArchivo(String nomfich) {
		ruta=nomfich;
	}
	public DuplicadorDeArchivo() {
		ruta=nompordefecto;
	}
	public abstract boolean duplicar(String nuevofich) throws FileNotFoundException, IOException;
	public String getRuta() {
		return ruta;
	}
}
