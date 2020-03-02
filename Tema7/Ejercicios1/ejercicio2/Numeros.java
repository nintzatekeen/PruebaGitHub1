package ejercicio2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Numeros{
	public static int generar1Num(int liminf, int limsup) {
		int num=(int)(Math.random()*(limsup-liminf+1)+liminf);
		return num;
	}
	public static ArrayList<Integer>generarNums(int liminf, int limsup, int cantidad){
		ArrayList<Integer>ret=new ArrayList<Integer>();
		int num;
		for(int i=0;i<cantidad;i++) {
			boolean repe;
			do {
				num=(int)(Math.random()*(limsup-liminf+1)+liminf);
				repe=false;
				for(int j=0;(repe==false)&&(j<ret.size());j++) {
					if(ret.get(j)==num) {
						repe=true;
					}
				}
			}while(repe==true);
			ret.add(num);
		}
		return ret;
	}
	public static void anade1Num(String nomfich, int ent) throws IOException {
		File f=new File(nomfich);
		DataOutputStream dos=new DataOutputStream(new FileOutputStream(f, true));
		dos.writeInt(ent);
		dos.close();
	}
	public static void anadeNums(String nomfich, ArrayList<Integer> ents) throws IOException {
		File f=new File(nomfich);
		DataOutputStream dos=new DataOutputStream(new FileOutputStream(f, true));
		for(Integer i:ents) {
			dos.writeInt(i);
		}
		dos.close();
	}
	public static Object buscarEnFichero(String nomfich, int pos) throws IOException {
		File f=new File(nomfich);
		if(!f.exists()) {
			System.out.println("Error: El fichero especificado no existe");
			return null;
		}
		else {
			DataInputStream dis=new DataInputStream(new FileInputStream(f));
			dis.skip((pos-1)*Integer.BYTES);
			Integer ret=dis.readInt();
			dis.close();
			return ret;
		}
	}
	public static void verFichero(String nomfich) throws IOException {
		File f=new File(nomfich);
		if(!f.exists()) {
			System.out.println("El fichero especificado no existe");
		}
		else {
			DataInputStream dis=new DataInputStream(new FileInputStream(f));
			while(dis.available()>0) {
				System.out.print(dis.readInt()+" ");
			}
			System.out.println();
			dis.close();
		}
	}
	
}
