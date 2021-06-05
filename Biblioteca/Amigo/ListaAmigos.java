package Amigo;

import java.util.ArrayList;

public class ListaAmigos {

	private ArrayList<Amigo> alAmigos;

	// -> Constructors
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
	
	// -> toString
	@Override
	public String toString() {
		return "ListaAmigos [alAmigos=" + alAmigos + "]";
	}
}
