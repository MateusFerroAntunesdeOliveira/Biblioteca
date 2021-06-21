package Amigo;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaAmigos implements Serializable {

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
	
	// -> AddAmigo
	public void addAmigo(Amigo novoAmigo) {
		this.alAmigos.add(novoAmigo);
	}

	// -> toString
	@Override
	public String toString() {
		return "Lista de Amigos: " + alAmigos;
	}
}
