package Emprestimo;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaEmprestimos implements Serializable {

	private ArrayList<Emprestimo> alEmprestimos;

	// -> Constructors
	public ListaEmprestimos() {
		this.alEmprestimos = new ArrayList<Emprestimo>();
	}

	public ListaEmprestimos(ArrayList<Emprestimo> alEmprestimos) {
		this.alEmprestimos = alEmprestimos;
	}

	// -> Getters
	public ArrayList<Emprestimo> getAlEmprestimos() {
		return alEmprestimos;
	}

	// -> Setters
	public void setAlEmprestimos(ArrayList<Emprestimo> alEmprestimos) {
		this.alEmprestimos = alEmprestimos;
	}

	// -> AddEmprestimo
	public void addEmprestimo(Emprestimo novoEmprestimo) {
		this.alEmprestimos.add(novoEmprestimo);
	}

	// -> RemoveEmprestimo
	public void removeEmprestimo(Emprestimo novoEmprestimo) {
		this.alEmprestimos.remove(novoEmprestimo);
	}

	// -> toString
	@Override
	public String toString() {
		return "Lista dos itens Emprestados" + alEmprestimos;
	}
}
