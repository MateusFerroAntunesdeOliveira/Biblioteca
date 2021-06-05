package Emprestimo;
import java.util.ArrayList;

public class ListaEmprestimos {

	private ArrayList<Emprestimo> alEmprestimos;

	// -> Constructors
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

	// -> toString
	@Override
	public String toString() {
		return "ListaEmprestimos [alEmprestimos=" + alEmprestimos + "]";
	}
}
