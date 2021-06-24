package Amigo;

import java.io.Serializable;
import java.util.ArrayList;

/** 
 * @author Joao Gabriel Klein Lopes
 * @author Mateus Ferro Antunes de Oliveira
 * @author Milena Heloisa de Amorim Silverio
 * 
 * @version 1.01+1
 */

public class ListaAmigos implements Serializable {

	// -> Variables
	private ArrayList<Amigo> alAmigos;

	// -> Constructors
	/**
	 * @param ListaAmigos criacao de um ArrayList Amigo vazio
	 */
	public ListaAmigos() {
		this.alAmigos = new ArrayList<Amigo>();
	}
	
	/**
	 * @param alAmigos lista de amigos
	 */
	public ListaAmigos(ArrayList<Amigo> alAmigos) {
		this.alAmigos = alAmigos;
	}

	// -> Getters
	/**
	 * Devolve um ArrayList que representa todos os amigos
	 * @return alAmigos
	 */
	public ArrayList<Amigo> getAlAmigos() {
		return alAmigos;
	}

	// -> Setters
	/**
	 * Seta o valor de alAmigos
	 * @param alAmigos
	 */
	public void setAlAmigos(ArrayList<Amigo> alAmigos) {
		this.alAmigos = alAmigos;
	}
	
	// -> AddAmigo
	/**
	 * Adiciona um novo Amigo no ArrayList
	 * @param novoAmigo
	 */
	public void addAmigo(Amigo novoAmigo) {
		this.alAmigos.add(novoAmigo);
	}

	// -> toString
	/**
	 * Devolve uma String com alAmigos
	 * @return toString
	 */
	@Override
	public String toString() {
		return "Lista de Amigos: " + alAmigos;
	}
}
