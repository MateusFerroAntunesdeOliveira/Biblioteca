package TesteEnum;

public class Teste {

	public static void main(String[] args) {
		Disponibilidade d = Disponibilidade.DANIFICADO; 
		System.out.println(d.toString());
		System.out.println(d.ordinal());
		
		Livro l1 = new Livro("Logica");
		System.out.println(l1);
		l1.emprestar();
		System.out.println(l1);
		
		//l1.devolver();
		
		if (l1.getEstado() == Disponibilidade.DISPONIVEL) {
				System.out.println("Posso emprestar...");
		} else {
			System.out.println("Nao posso emprestrar, pois esta " + l1.getEstado().toString());
		}
		
		l1.setEstado(Disponibilidade.EXTRAVIADO);
		switch (l1.getEstado()) {
			case DISPONIVEL:
				System.out.println("Ok para emprestar");
				break;
			case EXTRAVIADO:
			case DANIFICADO:
				System.out.println("J� foi este exemplar");
				break;
			// ...... etc e tal
		}		
	}
}
