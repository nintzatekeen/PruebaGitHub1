package ejercicio3;

import java.io.Serializable;

public class TelefonoMovil implements Serializable{
	private String numero;
	private int saldo;
	public TelefonoMovil(String number, int cash) {
		numero=number;
		saldo=cash;
	}
	public void ver() {
		System.out.println("Número: "+numero+", saldo: "+saldo);
	}
	public void cargar(int s) {
		saldo+=s;
	}
	public void llamar(int minutos) {
		saldo-=minutos*2;
	}
}
