package Item;

public abstract class Item {

	private int IdItem;
	private String tituloItem;
	private Disponibilidade dispItem;

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
		return IdItem;
	}
	
	public String getTituloItem() {
		return tituloItem;
	}
	
	public Disponibilidade getDispItem() {
		return dispItem;
	}
	
	// -> Setters
	public void setIdItem(int idItem) {
		IdItem = idItem;
	}
	
	public void setTituloItem(String tituloItem) {
		this.tituloItem = tituloItem;
	}
	
	public void setDispItem(Disponibilidade dispItem) {
		this.dispItem = dispItem;
	}

	// -> toString
	@Override
	public String toString() {
		return "Item [IdItem=" + IdItem + ", dispItem=" + dispItem + ", tituloItem=" + tituloItem + "]";
	}
}
