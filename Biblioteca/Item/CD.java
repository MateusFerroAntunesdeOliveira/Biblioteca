package Item;

/** 
 * @author Joao Gabriel Klein Lopes
 * @author Mateus Ferro Antunes de Oliveira
 * @author Milena Heloisa de Amorim Silverio
 * 
 * @version 1.01+1
 */

public class CD extends Item {

	// -> Variables
	private String autorDisco;
	private int numMusicaCD;

	// -> Constructors
	/**
	 * @param idItem Id do Item
	 */
	public CD(int idItem) {
		super(idItem);
	}

	/**
	 * @param idItem Id do Item
	 * @param tituloItem Titulo do Item
	 * @param dispItem Disponibilidade do Item
	 */
	public CD(int idItem, String tituloItem, Disponibilidade dispItem) {
		super(idItem, tituloItem, dispItem);
	}

	/**
	 * @param idItem Id do Item
	 * @param autorDisco Autor do CD
	 * @param numMusicaCD Numero de Musica do CD
	 */
	public CD(int idItem, String autorDisco, int numMusicaCD) {
		super(idItem);
		this.autorDisco = autorDisco;
		this.numMusicaCD = numMusicaCD;
	}

	/**
	 * @param idItem Id do Item
	 * @param tituloItem Titulo do Item
	 * @param autorDisco Autor do CD
	 * @param numMusicaCD Numero de Musica do CD
	 */
	public CD(int idItem, String tituloItem, String autorDisco, int numMusicaCD) {
		super(idItem, tituloItem);
		this.autorDisco = autorDisco;
		this.numMusicaCD = numMusicaCD;
	}

	/**
	 * @param idItem Id do Item
	 * @param dispItem Disponibilidade do Item
	 * @param autorDisco Autor do CD
	 * @param numMusicaCD Numero de Musica do CD
	 */
	public CD(int idItem, Disponibilidade dispItem, String autorDisco, int numMusicaCD) {
		super(idItem, dispItem);
		this.autorDisco = autorDisco;
		this.numMusicaCD = numMusicaCD;
	}

	/**
	 * @param idItem Id do Item
	 * @param tituloItem Titulo do Item
	 * @param dispItem Disponibilidade do Item
	 * @param autorDisco Autor do CD
	 * @param numMusicaCD Numero de Musica do CD
	 */
	public CD(int idItem, String tituloItem, Disponibilidade dispItem, String autorDisco, int numMusicaCD) {
		super(idItem, tituloItem, dispItem);
		this.autorDisco = autorDisco;
		this.numMusicaCD = numMusicaCD;
		this.dispItem = Disponibilidade.DISPONIVEL;
	}

	// -> Getters
	/**
	 * Devolve uma String com o Autor do Disco
	 * @return AutorDisco
	 */
	public String getAutorDisco() {
		return autorDisco;
	}

	/**
	 * Devolve um Inteiro com o numero de musicas do CD
	 * @return numMusicaCD
	 */
	public int getNumMusicaCD() {
		return numMusicaCD;
	}

	// -> Setters
	/**
	 * Seta o autor do CD
	 * @param autorDisco
	 */
	public void setAutorDisco(String autorDisco) {
		this.autorDisco = autorDisco;
	}

	/**
	 * Seta o numero de musicas do CD
	 * @param numMusicaCD
	 */
	public void setNumMusicaCD(int numMusicaCD) {
		this.numMusicaCD = numMusicaCD;
	}

	// -> toString
	/**
	 * Devolve uma String com autor do Disco, numero de musicas e a Disponibilidade Atual
	 * @return toString
	 */
	@Override
	public String toString() {	
		return "CD" + " - " + "Autor: " + autorDisco + " - " + numMusicaCD + " musicas " + "\nDisponibilidade atual: " + dispItem + "\n";
	}
}
