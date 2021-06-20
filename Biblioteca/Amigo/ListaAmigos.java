package Amigo;

import java.util.ArrayList;

public class ListaAmigos {

	private ArrayList<Amigo> alAmigos;

	// -> Constructors
	public ListaAmigos() {
		this.alAmigos = new ArrayList<Amigo>();
	}
	
	public ListaAmigos(ArrayList<Amigo> alAmigos) {
		this.alAmigos = alAmigos;
	}

	// -> Getters
	public ArrayList<Amigo> getAlAmigos() {
		return alAmigos;
	}

	// -> Setters
	public void setAlAmigos(ArrayList<Amigo> alAmigos) {
		this.alAmigos = alAmigos;
	}
	
	public void addAmigo(Amigo novoAmigo) {
		this.alAmigos.add(novoAmigo);
	}

	// -> toString
	@Override
	public String toString() {
		return "ListaAmigos [alAmigos=" + alAmigos + "]";
	}
}
