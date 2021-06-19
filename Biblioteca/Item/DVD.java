package Item;

public class DVD extends Item {

	private String autorDisco;
	private int numMusicaDvd;

	// -> Constructors
	public DVD(int idItem) {
		super(idItem);
	}

	public DVD(int idItem, String tituloItem, Disponibilidade dispItem) {
		super(idItem, tituloItem, dispItem);
	}

	public DVD(int idItem, String autorDisco, int numMusicaDvd) {
		super(idItem);
		this.autorDisco = autorDisco;
		this.numMusicaDvd = numMusicaDvd;
	}

	public DVD(int idItem, String tituloItem, String autorDisco, int numMusicaDvd) {
		super(idItem, tituloItem);
		this.autorDisco = autorDisco;
		this.numMusicaDvd = numMusicaDvd;
	}

	public DVD(int idItem, Disponibilidade dispItem, String autorDisco, int numMusicaDvd) {
		super(idItem, dispItem);
		this.autorDisco = autorDisco;
		this.numMusicaDvd = numMusicaDvd;
	}

	public DVD(int idItem, String tituloItem, Disponibilidade dispItem, String autorDisco, int numMusicaDvd) {
		super(idItem, tituloItem, dispItem);
		this.autorDisco = autorDisco;
		this.numMusicaDvd = numMusicaDvd;
		this.dispItem = Disponibilidade.DISPONIVEL;
	}

	// -> Getters
	public String getAutorDisco() {
		return autorDisco;
	}

	public int getNumMusicaDvd() {
		return numMusicaDvd;
	}

	// -> Setters
	public void setAutorDisco(String autorDisco) {
		this.autorDisco = autorDisco;
	}

	public void setNumMusicaDvd(int numMusicaDvd) {
		this.numMusicaDvd = numMusicaDvd;
	}

	// -> toString
	@Override
	public String toString() {	
		return "DVD" + " - " + "Autor: " + autorDisco + " - " + numMusicaDvd + " músicas " + "\nDisponibilidade atual: " + dispItem + "\n";
	}
}
