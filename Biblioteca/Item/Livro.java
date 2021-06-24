package Item;

/** 
 * @author Joao Gabriel Klein Lopes
 * @author Mateus Ferro Antunes de Oliveira
 * @author Milena Heloisa de Amorim Silverio
 * 
 * @version 1.01+1
 */

public class Livro extends Item {
	
	// -> Variables
	private String autorLivro;
	private int totPagLivro;
	
	// -> Constructors
	/**
	 * @param idItem Id do Item
	 * @param tituloItem Titulo do Item
	 * @param dispItem Disponibilidade do Item
	 */
	public Livro(int idItem, String tituloItem, Disponibilidade dispItem) {
		super(idItem, tituloItem, dispItem);
	}

	/**
	 * @param idItem Id do Item
	 * @param tituloItem Titulo do Item
	 * @param dispItem Disponibilidade do Item
	 * @param autorLivro Autor do Livro
	 */
	public Livro(int idItem, String tituloItem, Disponibilidade dispItem, String autorLivro) {
		super(idItem, tituloItem, dispItem);
		this.autorLivro = autorLivro;
	}

	/**
	 * @param idItem Id do Item
	 * @param tituloItem Titulo do Item
	 * @param dispItem Disponibilidade do Item
	 * @param totPagLivro Total de Paginas do Livro
	 */
	public Livro(int idItem, String tituloItem, Disponibilidade dispItem, int totPagLivro) {
		super(idItem, tituloItem, dispItem);
		this.totPagLivro = totPagLivro;
	}

	/**
	 * @param idItem Id do Item
	 * @param tituloItem Titulo do Item
	 * @param dispItem Disponibilidade do Item
	 * @param autorLivro Autor do Livro
	 * @param totPagLivro Total de Paginas do Livro
	 */
	public Livro(int idItem, String tituloItem, Disponibilidade dispItem, String autorLivro, int totPagLivro) {
		super(idItem, tituloItem, dispItem);
		this.autorLivro = autorLivro;
		this.totPagLivro = totPagLivro;
		this.dispItem = Disponibilidade.DISPONIVEL;
	}

	// -> Getters
	/**
	 * Devolve uma String com Autor do Livro
	 * @return AutorLivro
	 */
	public String getAutorLivro() {
		return autorLivro;
	}

	/**
	 * Devolve um Inteiro com o Total de Pagina do Livro
	 * @return TotPagLivro
	 */
	public int getTotPagLivro() {
		return totPagLivro;
	}

	// -> Setters
	/**
	 * Seta o autor do Livro
	 * @param autorLivro
	 */
	public void setAutorLivro(String autorLivro) {
		this.autorLivro = autorLivro;
	}

	/**
	 * Seta o Total de Pagina do Livro
	 * @param totPagLivro
	 */
	public void setTotPagLivro(int totPagLivro) {
		this.totPagLivro = totPagLivro;
	}

	// -> toString
	/**
	 * Devolve uma String com Autor do Livro, total de Paginas do Livro e a Disponibilidade atual
	 * @return toString
	 */
	@Override
	public String toString() {
		return "Livro" + " - " + "Autor: " + autorLivro + " - " + totPagLivro + " paginas " + "\nDisponibilidade atual: " + dispItem + "\n";
	}
}
