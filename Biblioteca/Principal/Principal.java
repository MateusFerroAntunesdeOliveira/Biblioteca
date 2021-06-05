package Principal;

import java.util.Scanner;

// import Item.Biblioteca;
// import Item.Disponibilidade;
// import Item.Item;
// import Item.Livro;

public class Principal {

	public static void main(String[] args) {
		// -> Variables
		int escolhaMenu;
		Scanner teclado = new Scanner(System.in);

		// -> dummy data Biblioteca
		// final Biblioteca bib1 = new Biblioteca("Biblioteca Pessoal");

		// -> dummy datas Item
		// final Item livro1 = new Livro(123, "tituloLivro1",
		// Disponibilidade.DISPONIVEL);

		// -> Menu
		do {
			System.out.println("\n=-=-= Menu de opcoes =-=-=\n");
			System.out.println(" 1 - Cadastrar Item");
			System.out.println(" 2 - Cadastrar Amigo");
			System.out.println(" 3 - Emprestar Item");
			System.out.println(" 4 - Devolver Item");
			System.out.println(" 5 - Listar empréstimos atuais");
			System.out.println(" 6 - Listar histórico de empréstimos");
			System.out.println(" 7 - Listar biblioteca");
			System.out.println(" 0 - Sair do Programa");
			System.out.print(" >> ");
			escolhaMenu = teclado.nextInt();
			System.out.print("\n");

			switch (escolhaMenu) {
				case 1:
					cadastrarItem();
					break;
				case 2:
					cadastrarAmigo();
					break;
				case 3:
					emprestarItem();
					break;
				case 4:
					devolverItem();
					break;
				case 5:
					System.out.println("Escolha número 5");
					// TODO fazer a listagem por aqui
					break;
				case 6:
					System.out.println("Escolha número 6");
					// TODO fazer a listagem por aqui
					break;
				case 7:
					System.out.println("Escolha número 7");
					// TODO fazer a listagem por aqui
					break;
				case 0:
					System.exit(0);
				default:
					System.out.println("Escolha inválida, tente novamente");
					break;
			}
		} while (escolhaMenu != 0);

		teclado.close();
	}

	private static void cadastrarItem() {
		// -> Variables
		// Scanner teclado = new Scanner(System.in);

		System.out.println("Escolha número 1");
	}

	private static void cadastrarAmigo() {
		// -> Variables
		// Scanner teclado = new Scanner(System.in);

		System.out.println("Escolha número 2");
	}

	private static void emprestarItem() {
		// -> Variables
		// Scanner teclado = new Scanner(System.in);

		System.out.println("Escolha número 3");
	}

	private static void devolverItem() {
		// -> Variables
		// Scanner teclado = new Scanner(System.in);

		System.out.println("Escolha número 4");
	}
}
