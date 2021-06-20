package Amigo;
public class Amigo {

	private int idAmigo;
	private String nomeAmigo;
	
	// -> Constructors
	public Amigo(int idAmigo) {
		this.idAmigo = idAmigo;
		nomeAmigo = "Sem nome cadastrado";
	}
	
	public Amigo(int idAmigo, String nomeAmigo) {
		this.idAmigo = idAmigo;
		this.nomeAmigo = nomeAmigo;
	}

	// -> Getters
	public int getIdAmigo() {
		return idAmigo;
	}

	public String getNomeAmigo() {
		return nomeAmigo;
	}

	// -> Setters
	public void setIdAmigo(int idAmigo) {
		this.idAmigo = idAmigo;
	}

	public void setNomeAmigo(String nomeAmigo) {
		this.nomeAmigo = nomeAmigo;
	}

	// -> toString
	@Override
	public String toString() {
		return "Amigo: " + nomeAmigo;
	}
}
