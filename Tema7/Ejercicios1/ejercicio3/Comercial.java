package ejercicio3;

import java.io.Serializable;

public class Comercial implements Serializable{
	private String nombre;
	private float salario;
	private TelefonoMovil movil;
	public TelefonoMovil getMovil() {
		return movil;
	}
	public String getNombre() {
		return nombre;
	}
	public Comercial(String name, float wage, TelefonoMovil phone) {
		nombre=name;
		salario=wage;
		movil=phone;
	}
	public void ver() {
		System.out.println("Nombre: "+nombre+", salario: "+salario);
		movil.ver();
	}
	public void trabajar() {
		salario+=10;
		movil.llamar(15);
	}
	public void trabajar(int g, int m) {
		salario+=g;
		movil.llamar(m);
	}
}
