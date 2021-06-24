package Item;

import java.io.Serializable;

/** 
 * @author João Gabriel Klein Lopes
 * @author Mateus Ferro Antunes de Oliveira
 * @author Milena Heloisa de Amorim Silvério
 * 
 * @version 1.01+1
 */

// -> Classe abstrata que não pode mais ser instanciada
public abstract class Item implements Comparable<Item>, Serializable{

	// -> Variables
	private int IdItem;
	private String tituloItem;
	Disponibilidade dispItem;

	// -> Constructors
	/**
	 * @param idItem Id do Item
	 */
	public Item(int idItem) {
		IdItem = idItem;
	}

	/**
	 * @param idItem Id do Item
	 * @param tituloItem Titulo do Item
	 */
	public Item(int idItem, String tituloItem) {
		IdItem = idItem;
		this.tituloItem = tituloItem;
	}

	/**
	 * @param idItem Id do Item
	 * @param dispItem Disponibilidade Atual do Item
	 */
	public Item(int idItem, Disponibilidade dispItem) {
		IdItem = idItem;
		this.dispItem = dispItem;
	}

	/**
	 * @param idItem Id do Item
	 * @param tituloItem Titulo do Item
	 * @param dispItem Disponibilidade Atual do Item
	 */
	public Item(int idItem, String tituloItem, Disponibilidade dispItem) {
		IdItem = idItem;
		this.tituloItem = tituloItem;
		this.dispItem = dispItem;
	}

	// -> Getters
	/**
	 * Devolve um inteiro que representa o Id do Item
	 * @return Id do Item
	 */
	public int getIdItem() {
		return this.IdItem;
	}
	
	/**
	 * Devolve uma String que identifica o Item através do Título
	 * @return Titulo do Item
	 */
	public String getTituloItem() {
		return this.tituloItem;
	}
	
	/**
	 * Devolve Disponibilidade que representa qual a disponibilidade do Item
	 * @return Disponibilidade Atual do Item
	 */
	public Disponibilidade getDispItem() {
		return this.dispItem;
	}
	
	// -> Setters
	/**
	 * Seta o valor Id do Item
	 * @param idItem
	 */
	public void setIdItem(int idItem) {
		this.IdItem = idItem;
	}
	
	/**
	 * Seta o valor de Titulo do Item
	 * @param tituloItem
	 */
	public void setTituloItem(String tituloItem) {
		this.tituloItem = tituloItem;
	}
	
	/**
	 * Seta o valor da Disponibilidade do Item
	 * @param dispItem
	 */
	public void setDispItem(Disponibilidade dispItem) {
		this.dispItem = dispItem;
	}

	// -> EmprestarItem
	/**
	 * Altera manualmente a disponibilidade do Item para EMPRESTADO
	 * @param emprestar
	 */
	public void emprestar() {
		this.dispItem = Disponibilidade.EMPRESTADO;
	}
	
	// -> DevolverItem
	/**
	 * Altera manualmente a disponibilidade do Item para DISPONIVEL
	 * @param devolver
	 */
	public void devolver() {
		this.dispItem = Disponibilidade.DISPONIVEL;
	}

	// -> ConsultaLocal
	/**
	 * Altera manualmente a disponibilidade do Item para CONSULTALOCAL
	 * @param consultaLocal
	 */
	public void consultaLocal() {
		this.dispItem = Disponibilidade.CONSULTALOCAL;
	}

	// -> Danificado
	/**
	 * Altera manualmente a disponibilidade do Item para DANIFICADO
	 * @param danificado
	 */
	public void Danificado() {
		this.dispItem = Disponibilidade.DANIFICADO;
	}

	// -> Extraviado
	/**
	 * Altera manualmente a disponibilidade do Item para EXTRAVIADO
	 * @param extraviado
	 */
	public void Extraviado() {
		this.dispItem = Disponibilidade.EXTRAVIADO;
	}

	// -> CompareTo
	/**
	 * Devolve os títulos dos itens ordenados alfabeticamente
	 * @return compareTo
	 */
	public int compareTo(Item compItem) {
		return  tituloItem.compareTo(compItem.getTituloItem());
	}

	// -> toString
	/**
	 * Devolve uma String com Id, Disponibilidade e Titulo do Item
	 * @return toString
	 */
	@Override
	public String toString() {
		return "Item [IdItem=" + IdItem + ", dispItem=" + dispItem + ", tituloItem=" + tituloItem + "]";
	}
}
