package ejemplo2;

import java.io.FileInputStream;
import java.io.IOException;

public class Ejemplo2 {

	public static void main(String[] args) throws IOException {
		byte b[]=new byte[1024];
		FileInputStream fich=new FileInputStream("subcarpeta/kk");
		int bytesleidos=fich.read(b);
		String s="";
		for(int i=0;i<bytesleidos;i++)
			s+=(char)b[i]; //Interpretamos cada byte como carácter
		System.out.println(s);
		fich.close();
	}

}
