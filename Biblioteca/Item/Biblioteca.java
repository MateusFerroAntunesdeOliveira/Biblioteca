package Item;
import java.util.ArrayList;
import java.util.Iterator;

public class Biblioteca {

	private String nomeBib;
	private ArrayList<Item> alItem;

	public Biblioteca(String nomeBib) {
		this.nomeBib = nomeBib;
		this.alItem = new ArrayList<Item>(); 
	}

	// métodos, getters, setters, toString, compareTo etc conforme
	// a modelagem e encapsulamento que a equipe decidir implementar
	// várias opções
}
