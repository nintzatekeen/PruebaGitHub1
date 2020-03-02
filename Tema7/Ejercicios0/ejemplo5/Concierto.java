package ejemplo5;

public class Concierto extends Evento {
	private String artista;
	private int aforo;

	public Concierto(String nombre, boolean pasado, String artista, int aforo) {
		super(nombre, pasado);
		this.artista = artista;
		this.aforo = aforo;
	}

	public String toString() {
return "Concierto [artista=" + artista + ", aforo=" + aforo+ ", toString()=" + super.toString() + "]";
	}

	public int getAforo() {
		return aforo;
	}
}
