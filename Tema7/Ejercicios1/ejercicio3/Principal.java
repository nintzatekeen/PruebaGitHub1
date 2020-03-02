package ejercicio3;

import java.io.IOException;
import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		GestionComercial gc1=new GestionComercial("comerciales.obj");
		ArrayList<Comercial>comerciales=new ArrayList<Comercial>();
		//Comercial1
		TelefonoMovil tlf1=new TelefonoMovil("666666666", 288);
		Comercial c1=new Comercial("Gervasio",1000, tlf1);
		comerciales.add(c1);
		//Comercial2
		TelefonoMovil tlf2=new TelefonoMovil("666666667", 10);
		Comercial c2=new Comercial("Homero",1500, tlf2);
		comerciales.add(c2);
		//Comercial3
		TelefonoMovil tlf3=new TelefonoMovil("666666668", 0);
		Comercial c3=new Comercial("Pepe",950, tlf3);
		comerciales.add(c3);
		//Comercial4
		TelefonoMovil tlf4=new TelefonoMovil("666666669", 100);
		Comercial c4=new Comercial("Leucadio",2000, tlf4);
		comerciales.add(c4);
		//Comercial5
		TelefonoMovil tlf5=new TelefonoMovil("666666670", 50);
		Comercial c5=new Comercial("Miguel",1700, tlf5);
		comerciales.add(c5);
		//Guardar comerciales
		gc1.guardaComerciales(comerciales);
		//Ver comerciales
		gc1.verComerciales();
		//Buscar a Leucadio
		gc1.buscaComercial("Leucadio");
		//Buscar a Jacinto (no existe)
		gc1.buscaComercial("Jacinto");
		//Generar fichero móviles
		gc1.generaFichMoviles("celulares.obj");
		//Visualizar móviles del fichero
		System.out.println("lista de móviles");
		GestionComercial.verCelulares("celulares.obj");
		//TrabajarTodos
		System.out.println("Tras metodo trabajartodos");
		gc1.trabajarTodos();
		gc1.verComerciales();
		
	}
}
