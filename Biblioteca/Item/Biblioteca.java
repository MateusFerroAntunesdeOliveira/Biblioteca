package Item;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/** 
 * @author Joao Gabriel Klein Lopes
 * @author Mateus Ferro Antunes de Oliveira
 * @author Milena Heloisa de Amorim Silverio
 * 
 * @version 1.01+1
 */

public class Biblioteca implements Iterable<Item>, Serializable{

	// -> Variables
	private String nomeBib;
	private ArrayList<Item> alItem;

	// -> Constructors
	/**
	 * @param nomeBib nome da Biblioteca
	 */
	public Biblioteca(String nomeBib) {
		this.nomeBib = nomeBib;
		this.alItem = new ArrayList<Item>();
	}

	/**
	 * @param nomeBib nome da Biblioteca
	 * @param alItem Todos os itens da Biblioteca
	 */
	public Biblioteca(String nomeBib, ArrayList<Item> alItem) {
		this.nomeBib = nomeBib;
		this.alItem = alItem;
	}

	// -> metodo size
	/**
	 * Devolve o tamanho da Biblioteca
	 * @return size
	 */
	public int size() {
		return this.alItem.size();
	}

	// -> metodo addItem
	/**
	 * Adiciona um Item no alItem
	 * @param item
	 */
	public void addItem(Item item) {
		this.alItem.add(item);
	}

	// -> getters
	/**
	 * Devolve uma String que representa o nome da Biblioteca
	 * @return nome da Biblioteca
	 */
	public String getNomeBib() {
		return nomeBib;
	}

	/**
	 * Devolve um ArrayList que representa todos os Itens da Biblioteca
	 * @return todos os Itens
	 */
	public ArrayList<Item> getAlItem() {
		return alItem;
	}

	// -> setters
	/**
	 * Seta o nome da Biblioteca
	 * @param nomeBib
	 */
	public void setNomeBib(String nomeBib) {
		this.nomeBib = nomeBib;
	}

	/**
	 * Seta o ArrayList de todos os Itens
	 * @param alItem
	 */
	public void setAlItem(ArrayList<Item> alItem) {
		this.alItem = alItem;
	}

	// -> Iterator
	/**
	 * Devolve um iterator de todos os itens
	 * @return iterator
	 */
	@Override
	public Iterator<Item> iterator() {
		return this.alItem.iterator();
	}
	
	// -> toString padrao
	/**
	 * Devolve uma String com nome e todos os itens da Biblioteca
	 * @return toString
	 */
	@Override
	public String toString() {
		return "Nome da Biblioteca = " + nomeBib + " - " + "com os itens: " + alItem;
	}

}
