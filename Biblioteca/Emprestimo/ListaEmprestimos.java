package Emprestimo;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaEmprestimos implements Serializable {

	private ArrayList<Emprestimo> alEmprestimos;

	// -> Constructors
	/**
	 * @param ListaEmprestimos criaçao de um ArrayList Emprestimo vazio
	 */
	public ListaEmprestimos() {
		this.alEmprestimos = new ArrayList<Emprestimo>();
	}

	/**
	 * @param alEmprestimos lista em emprestimos
	 */
	public ListaEmprestimos(ArrayList<Emprestimo> alEmprestimos) {
		this.alEmprestimos = alEmprestimos;
	}

	// -> Getters
	/**
	 * Devolve um ArrayList que representa todos os emprestimos
	 * @return alEmprestimos
	 */
	public ArrayList<Emprestimo> getAlEmprestimos() {
		return alEmprestimos;
	}

	// -> Setters
	/**
	 * Seta o valor de alEmprestimos
	 * @param alEmprestimos
	 */
	public void setAlEmprestimos(ArrayList<Emprestimo> alEmprestimos) {
		this.alEmprestimos = alEmprestimos;
	}

	// -> AddEmprestimo
	/** 
	 * Metodo que adiciona Emprestimo
	 * @param novoEmprestimo
	 */
	public void addEmprestimo(Emprestimo novoEmprestimo) {
		this.alEmprestimos.add(novoEmprestimo);
	}

	// -> RemoveEmprestimo
	/**
	 * Metodo que remove Emprestimo
	 * @param novoEmprestimo
	 */
	public void removeEmprestimo(Emprestimo novoEmprestimo) {
		this.alEmprestimos.remove(novoEmprestimo);
	}

	// -> toString
	/**
	 * Devolve uma String com alEmprestimos
	 * @return toString
	 */
	@Override
	public String toString() {
		return "Lista dos itens Emprestados" + alEmprestimos;
	}
}
