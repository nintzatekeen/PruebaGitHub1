package ejercicio3;

import java.io.Serializable;

public class Persona implements Serializable{
	private String nombre, telefono, lugar;
	private int edad;
	public String getNombre() {
		return nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public String getLugar() {
		return lugar;
	}
	public int getEdad() {
		return edad;
	}
	public Persona(String name, int age, String mobile, String place) {
		nombre=name;
		edad=age;
		telefono=mobile;
		lugar=place;
	}
	public void ver() {
		System.out.println("Teléfono: "+telefono+", edad: "+edad+", nombre: "+nombre+", lugar: "+lugar);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + edad;
		result = prime * result + ((lugar == null) ? 0 : lugar.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (edad != other.edad)
			return false;
		if (lugar == null) {
			if (other.lugar != null)
				return false;
		} else if (!lugar.equals(other.lugar))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		return true;
	}
}
