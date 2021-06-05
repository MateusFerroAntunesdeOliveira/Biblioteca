package Item;

public class Livro extends Item {
	
	private String autorLivro;
	private int totPagLivro;
	
	// -> Constructors
	public Livro(int idItem, String tituloItem, Disponibilidade dispItem) {
		super(idItem, tituloItem, dispItem);
	}

	public Livro(int idItem, String tituloItem, Disponibilidade dispItem, String autorLivro) {
		super(idItem, tituloItem, dispItem);
		this.autorLivro = autorLivro;
	}

	public Livro(int idItem, String tituloItem, Disponibilidade dispItem, int totPagLivro) {
		super(idItem, tituloItem, dispItem);
		this.totPagLivro = totPagLivro;
	}

	public Livro(int idItem, String tituloItem, Disponibilidade dispItem, String autorLivro, int totPagLivro) {
		super(idItem, tituloItem, dispItem);
		this.autorLivro = autorLivro;
		this.totPagLivro = totPagLivro;
	}

	// -> Getters
	public String getAutorLivro() {
		return autorLivro;
	}

	public int getTotPagLivro() {
		return totPagLivro;
	}

	// -> Setters
	public void setAutorLivro(String autorLivro) {
		this.autorLivro = autorLivro;
	}

	public void setTotPagLivro(int totPagLivro) {
		this.totPagLivro = totPagLivro;
	}

	// -> toString
	@Override
	public String toString() {
		return "Livro [autorLivro=" + autorLivro + ", totPagLivro=" + totPagLivro + "]";
	}
}
