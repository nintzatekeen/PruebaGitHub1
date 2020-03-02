package Ejercicio2;

public class MayorNumero {
	public static int obj_mayorNumero(int lista[]) {
		int max=Integer.MIN_VALUE;
		for(int i=0; i<lista.length;i++) {
			if(lista[i]>max)
				max=lista[i];
		}
		return max;
	}
}
