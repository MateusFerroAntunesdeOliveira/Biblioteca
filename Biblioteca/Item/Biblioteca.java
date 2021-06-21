package Item;

import java.util.ArrayList;
import java.util.Iterator;

public class Biblioteca implements Iterable<Item> {

	private String nomeBib;
	private ArrayList<Item> alItem;

	// -> Constructors
	public Biblioteca(String nomeBib) {
		this.nomeBib = nomeBib;
		this.alItem = new ArrayList<Item>();
	}

	public Biblioteca(String nomeBib, ArrayList<Item> alItem) {
		this.nomeBib = nomeBib;
		this.alItem = alItem;
	}

	// -> método size
	public int size() {
		return this.alItem.size();
	}

	// -> método addItem
	public void addItem(Item item) {
		this.alItem.add(item);
	}

	// -> getters
	public String getNomeBib() {
		return nomeBib;
	}

	public ArrayList<Item> getAlItem() {
		return alItem;
	}

	// -> setters
	public void setNomeBib(String nomeBib) {
		this.nomeBib = nomeBib;
	}

	public void setAlItem(ArrayList<Item> alItem) {
		this.alItem = alItem;
	}

	// -> Iterator
	@Override
	public Iterator<Item> iterator() {
		return this.alItem.iterator();
	}
	
	// -> toString padrão
	@Override
	public String toString() {
		return "Nome da Biblioteca = " + nomeBib + " - " + "com os itens: " + alItem;
	}

}
