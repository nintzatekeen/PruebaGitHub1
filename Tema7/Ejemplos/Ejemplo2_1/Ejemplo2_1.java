package Ejemplo2_1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejemplo2_1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream flujoSalida = new FileOutputStream(new File("prueba.txt"));
		byte[]datos1=new byte[100];
		byte[]datos2=new byte[100];
		System.out.println("Escribiendo en fichero...\n");
		for(int i=0;i<datos1.length;i++) {
			datos1[i]=(byte) i;
			datos2[i]=(byte)i;
			flujoSalida.write(datos1[i]);
		}
		flujoSalida.write(datos2);
		flujoSalida.close();
	}

}