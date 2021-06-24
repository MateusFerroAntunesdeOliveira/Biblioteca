package Amigo;

import java.io.Serializable;

/** 
 * @author Joao Gabriel Klein Lopes
 * @author Mateus Ferro Antunes de Oliveira
 * @author Milena Heloisa de Amorim Silverio
 * 
 * @version 1.01+1
 */

public class Amigo implements Serializable{

	// -> Variables
	private int idAmigo;
	private String nomeAmigo;
	
	// -> Constructors
	/**
	 * @param idAmigo Id do Amigo
	 */
	public Amigo(int idAmigo) {
		this.idAmigo = idAmigo;
		nomeAmigo = "Sem nome cadastrado";
	}
	
	/**
	 * @param idAmigo Id do Amigo
	 * @param nomeAmigo Nome do Amigo
	 */
	public Amigo(int idAmigo, String nomeAmigo) {
		this.idAmigo = idAmigo;
		this.nomeAmigo = nomeAmigo;
	}

	// -> Getters
	/**
	 * Devolve um Inteiro que representa o Id do Amigo
	 * @return Id do Amigo
	 */
	public int getIdAmigo() {
		return idAmigo;
	}

	/**
	 * Devolve uma String que representa o Nome do Amigo
	 * @return Nome do Amigo
	 */
	public String getNomeAmigo() {
		return nomeAmigo;
	}

	// -> Setters
	/**
	 * Seta o valor Id do Amigo
	 * @param idAmigo
	 */
	public void setIdAmigo(int idAmigo) {
		this.idAmigo = idAmigo;
	}

	/**
	 * Seta o valor Nome do Amigo
	 * @param nomeAmigo
	 */
	public void setNomeAmigo(String nomeAmigo) {
		this.nomeAmigo = nomeAmigo;
	}

	// -> toString
	/**
	 * Devolve uma String com Amigo
	 * @return toString
	 */
	@Override
	public String toString() {
		return "Amigo: " + nomeAmigo;
	}
}
