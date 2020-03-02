package ejercicio1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicicio1 {
	public static void main(String[] args) throws IOException {
		Ejercicicio1.copiar2("escudo-realmadrid.jpg", "escudo-realmadrid_CPY2.jpg");
		
	}
	public static void copiar( String fichOrigen, String fichDestino) throws IOException{
		//Leer fichOrigen byte a bytes, e ir copiandolo a fichDestino
		FileInputStream fis=new FileInputStream(fichOrigen);
		FileOutputStream fos=new FileOutputStream(fichDestino);
		while (fis.available()>0){
			int byteleido=fis.read();
			fos.write(byteleido);
		}
		fis.close();
		fos.close();
	}
	public static void copiar1( String fichOrigen, String fichDestino) throws IOException{
		final int baits=512;
		//Leer fichOrigen byte a bytes, e ir copiandolo a fichDestino
		FileInputStream fis=new FileInputStream(fichOrigen);
		FileOutputStream fos=new FileOutputStream(fichDestino);
		while (fis.available()>0){
			byte[]b=new byte[baits];
			int tamano=fis.read(b);
			fos.write(b, 0, tamano);
		}
		fis.close();
		fos.close();
	}
	public static void copiar2( String fichOrigen, String fichDestino) throws IOException{
		//Leer fichOrigen byte a bytes, e ir copiandolo a fichDestino
		File origin=new File(fichOrigen);
		byte[] tamano=new byte[(int) origin.length()];
		FileInputStream fis=new FileInputStream(fichOrigen);
		FileOutputStream fos=new FileOutputStream(fichDestino);
		
		fis.read(tamano);
		fos.write(tamano);
		fis.close();
		fos.close();
	}
	
}