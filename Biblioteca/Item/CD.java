package Item;

public class CD extends Item {

	private String autorDisco;
	private int numMusicaCD;

	// -> Constructors
	public CD(int idItem) {
		super(idItem);
	}

	public CD(int idItem, String tituloItem, Disponibilidade dispItem) {
		super(idItem, tituloItem, dispItem);
	}

	public CD(int idItem, String autorDisco, int numMusicaCD) {
		super(idItem);
		this.autorDisco = autorDisco;
		this.numMusicaCD = numMusicaCD;
	}

	public CD(int idItem, String tituloItem, String autorDisco, int numMusicaCD) {
		super(idItem, tituloItem);
		this.autorDisco = autorDisco;
		this.numMusicaCD = numMusicaCD;
	}

	public CD(int idItem, Disponibilidade dispItem, String autorDisco, int numMusicaCD) {
		super(idItem, dispItem);
		this.autorDisco = autorDisco;
		this.numMusicaCD = numMusicaCD;
	}

	public CD(int idItem, String tituloItem, Disponibilidade dispItem, String autorDisco, int numMusicaCD) {
		super(idItem, tituloItem, dispItem);
		this.autorDisco = autorDisco;
		this.numMusicaCD = numMusicaCD;
		this.dispItem = Disponibilidade.DISPONIVEL;
	}

	// -> Getters
	public String getAutorDisco() {
		return autorDisco;
	}

	public int getNumMusicaCD() {
		return numMusicaCD;
	}

	// -> Setters
	public void setAutorDisco(String autorDisco) {
		this.autorDisco = autorDisco;
	}

	public void setNumMusicaCD(int numMusicaCD) {
		this.numMusicaCD = numMusicaCD;
	}

	// -> toString
	@Override
	public String toString() {	
		return "CD" + " - " + "Autor: " + autorDisco + " - " + numMusicaCD + " músicas " + "\nDisponibilidade atual: " + dispItem + "\n";
	}
}
