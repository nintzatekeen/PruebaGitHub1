package ejercicio2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class prueba {
	public static void main(String[] args) throws IOException {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(3);
		a1.add(4);
		a1.add(2);
		a1.add(5);
		Numeros.anadeNums("fich1.bin", a1);
		Numeros.verFichero("fich1.bin");
		Numeros.anade1Num("fich1.bin", Numeros.generar1Num(1, 5));
		Numeros.verFichero("fich1.bin");
		Numeros.anadeNums("fich1.bin", Numeros.generarNums(1, 50, 5));
		Numeros.verFichero("fich1.bin");
		System.out.println(Numeros.buscarEnFichero("fich1.bin", 6));
		System.out.println(Numeros.buscarEnFichero("fich1.bin", 9));
		File f=new File("fich1.bin");
		DataInputStream dis=new DataInputStream(new FileInputStream(f));
		int size=0;
		while(dis.available()>0) {
			dis.skip(Integer.BYTES);
			size++;
		}
		dis.close();
		System.out.println(Numeros.buscarEnFichero("fich1.bin", size));		
		Numeros.anadeNums("fich2.bin", Numeros.generarNums(50, 70, 10));
		Numeros.verFichero("fich2.bin");
		File g=new File("fich2.bin");
		DataInputStream dis2=new DataInputStream(new FileInputStream(g));
		DataOutputStream dos=new DataOutputStream(new FileOutputStream(f, true));
		int sw=0;
		while(dis2.available()>0) {
			switch (sw) {
			case 0:
				Numeros.anade1Num("fich1.bin", dis2.readInt());
				sw=1;
				break;
			case 1:
				dis2.skip(Integer.BYTES);
				sw=0;
				break;
			}
		}
		dis2.close();
		dos.close();
		System.out.println();
		Numeros.verFichero("fich1.bin");
		System.out.println();
		Numeros.verFichero("fich2.bin");
	}
}
