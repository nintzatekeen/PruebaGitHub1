package ejemplo1;

import java.io.FileInputStream;
import java.io.IOException;

public class Ejemplo1 {
	public static void main(String[] args) throws IOException {
		if(args.length !=1)
			System.out.println("Falta el nombre del fichero");
		else {
			FileInputStream streamEnt=new FileInputStream(args[0]);
			int cant=0;
			int b;
			b=streamEnt.read();
			while(b!=-1) {
				if(b==0)
					cant++;
				b=streamEnt.read();
			}
			streamEnt.close();
			System.out.println(cant);
		}
			
			
	}
}
