package ejemplo5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class Evento implements Serializable {
	private String nombre;
	private boolean pasado;

	public Evento(String nombre, boolean pasado) {
		this.nombre = nombre;
		this.pasado = pasado;
	}

	public String toString() {
		return "Evento [nombre=" + nombre + ", pasado=" + pasado + "]";
	}

	public boolean isPasado() {
		return pasado;
	}
}

