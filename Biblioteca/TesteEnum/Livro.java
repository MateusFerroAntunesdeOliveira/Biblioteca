package TesteEnum;

public class Livro {
	
	private String nome;
	private Disponibilidade estado; 

	public Livro(String nome) {
		this.nome = nome;
		this.estado = Disponibilidade.DISPONIVEL;
	}
	
	public void emprestar() {
		this.estado = Disponibilidade.EMPRESTADO;
	}
	
	public void devolver() {
		this.estado = Disponibilidade.DISPONIVEL;
	}

	@Override
	public String toString() {
		return "Livro <" + nome + "> esta como <" + estado + ">";
	}

	public Disponibilidade getEstado() {
		return estado;
	}

	public void setEstado(Disponibilidade estado) {
		this.estado = estado;
	}


}
