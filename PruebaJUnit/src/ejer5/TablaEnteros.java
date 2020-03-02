package ejer5;

import java.util.NoSuchElementException;

public class TablaEnteros {
	private Integer[] tabla; 

	public TablaEnteros(Integer[] tabla) { 
	if (tabla == null || tabla.length == 0) 
	throw new IllegalArgumentException("No hay elementos");
	this.tabla = tabla; 
	}

	//devuelve la suma de los elementos de la tabla
	public int sumaTabla() { 
	int suma = 0; 
	for (int i = 0; i < tabla.length; i++)
	suma += tabla[i]; 
	return suma; 
	}

	//devuelve el mayor elemento de la tabla
	public int mayorTabla() { 
	int max = Integer.MIN_VALUE;
	for (int i = 0; i < tabla.length; i++)
	if (tabla[i] > max) 
	max = tabla[i]; 
	return max; 
	}

	//devuelve la posición de un elemento cuyo valor se pasa
	public int posicionTabla(int n) {
	for (int i = 0; i < tabla.length; i++)
	if (tabla[i] == n) 
	return i+1; 
	throw new NoSuchElementException("No existe:" + n); 
	}

}
