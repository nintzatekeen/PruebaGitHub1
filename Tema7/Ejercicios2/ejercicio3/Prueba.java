package ejercicio3;

import java.io.IOException;

public class Prueba {
	public static void main(String[] args) throws IOException {
		GestionAgenda ga=new GestionAgenda("ficheros/people.txt");
		//ga.ver();
		Persona p1=new Persona("Anacleto", 120, "No tiene", "Polo Norte");
		ga.anadePersona(p1);
		ga.ver();
		ga.buscaPersona("Anacleto").ver();
		ga.eliminaPersona(p1);
		ga.eliminaPersona(ga.buscaPersona("John James"));
		ga.ver();
	}
}
