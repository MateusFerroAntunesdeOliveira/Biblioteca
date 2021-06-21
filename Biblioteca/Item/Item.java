package Item;

public abstract class Item implements Comparable<Item>{

	private int IdItem;
	private String tituloItem;
	Disponibilidade dispItem;

	// -> Constructors
	public Item(int idItem) {
		IdItem = idItem;
	}

	public Item(int idItem, String tituloItem) {
		IdItem = idItem;
		this.tituloItem = tituloItem;
	}

	public Item(int idItem, Disponibilidade dispItem) {
		IdItem = idItem;
		this.dispItem = dispItem;
	}

	public Item(int idItem, String tituloItem, Disponibilidade dispItem) {
		IdItem = idItem;
		this.tituloItem = tituloItem;
		this.dispItem = dispItem;
	}

	// -> Getters
	public int getIdItem() {
		return this.IdItem;
	}
	
	public String getTituloItem() {
		return this.tituloItem;
	}
	
	public Disponibilidade getDispItem() {
		return this.dispItem;
	}
	
	// -> Setters
	public void setIdItem(int idItem) {
		this.IdItem = idItem;
	}
	
	public void setTituloItem(String tituloItem) {
		this.tituloItem = tituloItem;
	}
	
	public void setDispItem(Disponibilidade dispItem) {
		this.dispItem = dispItem;
	}

	// -> EmprestarItem
	public void emprestar() {
		this.dispItem = Disponibilidade.EMPRESTADO;
	}
	
	// -> DevolverItem
	public void devolver() {
		this.dispItem = Disponibilidade.DISPONIVEL;
	}

	// -> ConsultaLocal
	public void consultaLocal() {
		this.dispItem = Disponibilidade.CONSULTALOCAL;
	}

	// -> Danificado
	public void Danificado() {
		this.dispItem = Disponibilidade.DANIFICADO;
	}

	// -> Extraviado
	public void Extraviado() {
		this.dispItem = Disponibilidade.EXTRAVIADO;
	}

	// -> CompareTo
	public int compareTo(Item compItem) {
		return  tituloItem.compareTo(compItem.getTituloItem());
	}

	// -> toString
	@Override
	public String toString() {
		return "Item [IdItem=" + IdItem + ", dispItem=" + dispItem + ", tituloItem=" + tituloItem + "]";
	}
}
