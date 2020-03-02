package ejercicio2;

import java.io.IOException;

public class Pruebas {
	public static void main(String[] args) throws IOException {
		//DuplicadorCar dc=new DuplicadorCar("textoprueba.txt");
		//dc.duplicar("textoprueba2.txt");
		//dc.duplicar("textoprueba.txt");
		//DuplicadorCar dc1=new DuplicadorCar("textopru.txt");
		//dc1.duplicar("textoprueba2.txt");
		
		//DuplicadorPorBloque dpb=new DuplicadorPorBloque("textoprueba.txt");
		//dpb.duplicar("textoprueba3.txt");
		//dpb.duplicar("textoprueba.txt");
		//DuplicadorPorBloque dpb1=new DuplicadorPorBloque("textopru.txt");
		//dpb1.duplicar("textoprueba3.txt");
		
		DuplicadorValidado dv=new DuplicadorValidado("textoprueba.txt");
		dv.duplicar("textoprueba4.txt");
	}
}