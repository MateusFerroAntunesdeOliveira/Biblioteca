package Principal;

import java.time.LocalDateTime;
import java.util.Scanner;

import Item.Biblioteca;
import Item.Disponibilidade;
import Item.Item;
import Item.Livro;
import Item.DVD;
import Item.FitaK7;

import Amigo.Amigo;
import Amigo.ListaAmigos;

import Emprestimo.ListaEmprestimos;
import Emprestimo.Emprestimo;

public class Principal {

	public static void main(String[] args) {
		// -> Variables
		int escolhaMenu;
		Scanner teclado = new Scanner(System.in);

		// -> dummy data Biblioteca
		final Biblioteca bib1 = new Biblioteca("Biblioteca Pessoal");

		// -> dummy data Item
		final Item livro1 = new Livro(0, "tituloLivro1", Disponibilidade.DISPONIVEL, "Joao", 30);
		final Item livro2 = new Livro(1, "tituloLivro2", Disponibilidade.DISPONIVEL, "Ricardo2", 50);
		final Item fita1 = new FitaK7(2, "tituloFita1", Disponibilidade.DISPONIVEL, "Milena", 5);
		final Item dvd1 = new DVD(3, "tituloDVD1", Disponibilidade.DISPONIVEL, "Ricardo", 2);

		// -> dummy data addItem
		bib1.addItem(livro1);
		bib1.addItem(livro2);
		bib1.addItem(fita1);
		bib1.addItem(dvd1);

		// -> dummy data ListaAmigos
		final ListaAmigos lista = new ListaAmigos();

		// - > dummy data Amigos
		final Amigo amigo1 = new Amigo(0, "Joao");
		final Amigo amigo2 = new Amigo(1, "Milena");
		final Amigo amigo3 = new Amigo(2, "Ricardo");
		final Amigo amigo4 = new Amigo(3, "Cadu");

		// -> dummy data addAmigo
		lista.addAmigo(amigo1);
		lista.addAmigo(amigo2);
		lista.addAmigo(amigo3);
		lista.addAmigo(amigo4);

		// -> dummy data ListaEmprestimos
		final ListaEmprestimos emprestimos = new ListaEmprestimos();
		ListaEmprestimos historico = new ListaEmprestimos();

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
			System.out.println(" 8 - Alterar estado manualmente");
			System.out.println(" 0 - Sair do Programa");
			System.out.print(" >> ");
			escolhaMenu = teclado.nextInt();
			System.out.print("\n");

			switch (escolhaMenu) {
				case 1:
					cadastrarItem(bib1);
					break;
				case 2:
					cadastrarAmigo(lista);
					break;
				case 3:
					emprestarItem(bib1, lista, emprestimos, historico);
					break;
				case 4:
					devolverItem(bib1, lista, emprestimos);
					break;
				case 5:
					// TODO fazer case 5
					System.out.println("Escolha número 5");
					break;
				case 6:
					listarHistorico(historico);
					break;
				case 7:
					if (bib1.getAlItem().size() == 0)
						System.out.println("Biblioteca está vazia");
					else {
						for (Item item : bib1.getAlItem()) {
							System.out.println("(" + item.getIdItem() + ") " + bib1.getAlItem().get(item.getIdItem()));
						}
					}
					break;
				case 8:
					// TODO fazer case 8
					alterarEstado();
					break;
				case 0:
					System.exit(0);
				default:
					System.out.println("Escolha inválida, tente novamente!");
					break;
			}
		} while (escolhaMenu != 0);

		teclado.close();
	}

	private static void cadastrarItem(Biblioteca bib1) {
		// -> Variables
		Scanner teclado = new Scanner(System.in);
		int escolhaItem, totPagLivro, numMusicaDvd, numMusicaFita;
		String autorLivro, autorDisco, autorFita, tituloItem;

		System.out.println();
		System.out.println("=-=-=-=-=-= Cadatrar Item =-=-=-=-=-= ");
		System.out.println("Qual o tipo de item que deseja cadastrar: ");
		System.out.println("(1) - Livro");
		System.out.println("(2) - DVD");
		System.out.println("(3) - Fita K7");
		System.out.print(">> ");
		escolhaItem = teclado.nextInt();
		System.out.println();

		switch (escolhaItem) {
			case 1:
				Livro obj1;
				obj1 = new Livro(bib1.getAlItem().size(), "", Disponibilidade.DISPONIVEL);

				System.out.println();
				System.out.println("Qual o título do item: ");
				System.out.print(">> ");
				teclado.nextLine();
				tituloItem = teclado.nextLine();
				obj1.setTituloItem(tituloItem);

				System.out.println();
				System.out.println("Qual o autor do livro: ");
				System.out.print(">> ");
				autorLivro = teclado.nextLine();
				obj1.setAutorLivro(autorLivro);

				System.out.println();
				System.out.println("Quantas páginas possui o livro: ");
				System.out.print(">> ");
				totPagLivro = teclado.nextInt();
				obj1.setTotPagLivro(totPagLivro);

				bib1.addItem(obj1);
				System.out.println();
				System.out.println("Livro adicionado com sucesso!");
				System.out.println("Titulo do livro: " + obj1.getTituloItem() + "\n" +
								   "Autor do livro: " + obj1.getAutorLivro() + "\n" + 
								   "Numero de páginas: " + obj1.getTotPagLivro());

				break;
			case 2:
				DVD obj2;
				obj2 = new DVD(bib1.getAlItem().size(), "", Disponibilidade.DISPONIVEL);

				System.out.println();
				System.out.println("Qual o título do item: ");
				System.out.print(">> ");
				teclado.nextLine();
				tituloItem = teclado.nextLine();
				obj2.setTituloItem(tituloItem);

				System.out.println();
				System.out.println("Qual o autor do DVD: ");
				System.out.print(">> ");
				autorDisco = teclado.nextLine();
				obj2.setAutorDisco(autorDisco);

				System.out.println();
				System.out.println("Quantas musicas tem o DVD: ");
				System.out.print(">> ");
				numMusicaDvd = teclado.nextInt();
				obj2.setNumMusicaDvd(numMusicaDvd);

				bib1.addItem(obj2);
				System.out.println();
				System.out.println("DVD adicionado com sucesso!");
				System.out.println("Titulo do DVD: " + obj2.getTituloItem() + "\n" +
								   "Autor do DVD: " + obj2.getAutorDisco() + "\n" + 
								   "Numero de músicas: " + obj2.getNumMusicaDvd());

				break;
			case 3:
				FitaK7 obj3;
				obj3 = new FitaK7(bib1.getAlItem().size(), "", Disponibilidade.DISPONIVEL);

				System.out.println();
				System.out.println("Qual o título do item: ");
				System.out.print(">> ");
				teclado.nextLine();
				tituloItem = teclado.nextLine();
				obj3.setTituloItem(tituloItem);

				System.out.println();
				System.out.println("Qual o autor da FitaK7: ");
				System.out.print(">> ");
				autorFita = teclado.nextLine();
				obj3.setAutorFita(autorFita);

				System.out.println();
				System.out.println("Quantas musicas tem a Fita: ");
				System.out.print(">> ");
				numMusicaFita = teclado.nextInt();
				obj3.setNumMusicaFita(numMusicaFita);

				bib1.addItem(obj3);
				System.out.println();
				System.out.println("FitaK7 adicionada com sucesso!");
				System.out.println("Titulo da fita: " + obj3.getTituloItem() + "\n" +
								   "Autor da fita: " + obj3.getAutorFita() + "\n" + 
								   "Numero de músicas: " + obj3.getNumMusicaFita());

				break;
			default:
				System.out.println();
				System.out.println("Digite um valor correto!");
				break;
		}
	}

	private static void cadastrarAmigo(ListaAmigos lista) {
		// -> Variables
		Scanner teclado = new Scanner(System.in);
		String nomeAmigo;
		Amigo amigo;

		amigo = new Amigo(lista.getAlAmigos().size(), "");
		System.out.println();
		System.out.println("Qual o nome do seu abiguinho: ");
		System.out.print(">> ");
		nomeAmigo = teclado.nextLine();
		System.out.println();
		amigo.setNomeAmigo(nomeAmigo);

		lista.addAmigo(amigo);
		System.out.println("Amigo " + nomeAmigo + " cadastrado com sucesso!");
	}

	private static void emprestarItem(Biblioteca bib1, ListaAmigos lista, ListaEmprestimos emprestimos,
			ListaEmprestimos historico) {
		// -> Variables
		//TODO SÓ PODE EMPRESTAR ITEM SE ELE NÃO TIVER EMPRESTADO (MOSTRAR SOMENTE OS DISPONIVEIS)
		
		Scanner teclado = new Scanner(System.in);
		int amigoEmprest, escolhaItemEmprest, diaEmprestimo, mesEmprestimo, anoEmprestimo, horaEmprestimo,
				minEmprestimo;

		System.out.println("Para quem você está emprestando: ");
		System.out.println();
		for (int i = 0; i < lista.getAlAmigos().size(); i++) {
			System.out.println("(" + i + ") " + lista.getAlAmigos().get(i));
		}
		System.out.print(">> ");
		amigoEmprest = teclado.nextInt();
		System.out.println();

		System.out.println("Qual item você quer emprestar: ");
		System.out.println();
		for (Item item : bib1.getAlItem()) {
			System.out.println("(" + item.getIdItem() + ") " + bib1.getAlItem().get(item.getIdItem()));
		}
		System.out.print(">> ");
		escolhaItemEmprest = teclado.nextInt();
		System.out.println();

		for (Item item : bib1.getAlItem()) {
			if (item.getIdItem() == escolhaItemEmprest) {
				if (item.getDispItem() == Disponibilidade.DISPONIVEL) {
					// (dd/MM/yyyy - HH:mm)
					System.out.println();
					System.out.println("Qual o dia do empréstimo: ");
					System.out.print(">> ");
					diaEmprestimo = teclado.nextInt();

					System.out.println();
					System.out.println("Qual o mes do empréstimo: ");
					System.out.print(">> ");
					mesEmprestimo = teclado.nextInt();

					System.out.println();
					System.out.println("Qual o ano do empréstimo: ");
					System.out.print(">> ");
					anoEmprestimo = teclado.nextInt();

					System.out.println();
					System.out.println("Qual a hora do empréstimo: ");
					System.out.print(">> ");
					horaEmprestimo = teclado.nextInt();

					System.out.println();
					System.out.println("Qual o minuto do empréstimo: ");
					System.out.print(">> ");
					minEmprestimo = teclado.nextInt();

					Emprestimo emprestimo = new Emprestimo(
							amigoEmprest, item.getIdItem(), LocalDateTime.of(anoEmprestimo, mesEmprestimo,
									diaEmprestimo, horaEmprestimo, minEmprestimo),
							item, lista.getAlAmigos().get(amigoEmprest));

					emprestimos.addEmprestimo(emprestimo);
					item.emprestar();
					historico.getAlEmprestimos().add(emprestimo);
					System.out.println();
					System.out.println("Item emprestado com sucesso!");
					System.out.println();
					System.out.println(emprestimo);
				} else
					System.out.println("O item está ocupado no momento, tente novamente mais tarde!");
			}
		}
	}

	private static void devolverItem(Biblioteca bib1, ListaAmigos lista, ListaEmprestimos emprestimos) {
		// -> Variables
		
		//TODO SÓ PODE DEVOLVER ITEM SE ELE TIVER EMPRESTADO (MOSTRAR SOMENTE OS EMPRESTADOS)

		Scanner teclado = new Scanner(System.in);
		int amigoDevol, escolhaItemDevol, diaDevol, mesDevol, anoDevol, horaDevol, minDevol;

		System.out.println("Quem está devolvendo o item: ");
		System.out.println();
		if (emprestimos.getAlEmprestimos().size() == 0) {
			System.out.println();
			System.out.println("Ninguem está emprestando nenhum Item no momento.");
		} else {
			for (Emprestimo emprestimo : emprestimos.getAlEmprestimos()) {
				System.out.println("(" + emprestimos.getAlEmprestimos().indexOf(emprestimo) + ") "
						+ emprestimo.getAmigo().getNomeAmigo());
			}
		}
		System.out.println();
		System.out.print(">> ");
		amigoDevol = teclado.nextInt();
		System.out.println();

		System.out.println("Qual item você quer devolver: ");
		System.out.println();
		for (Item item : bib1.getAlItem()) {
			System.out.println("(" + item.getIdItem() + ") " + bib1.getAlItem().get(item.getIdItem()));
		}
		System.out.print(">> ");
		escolhaItemDevol = teclado.nextInt();
		System.out.println();

		for (Item item : bib1.getAlItem()) {
			if (item.getIdItem() == escolhaItemDevol) {
				if (item.getDispItem() == Disponibilidade.EMPRESTADO) {
					// (dd/MM/yyyy - HH:mm)
					System.out.println();
					System.out.println("Qual o dia da devolução: ");
					System.out.print(">> ");
					diaDevol = teclado.nextInt();

					System.out.println();
					System.out.println("Qual o mes da devolução: ");
					System.out.print(">> ");
					mesDevol = teclado.nextInt();

					System.out.println();
					System.out.println("Qual o ano da devolução: ");
					System.out.print(">> ");
					anoDevol = teclado.nextInt();

					System.out.println();
					System.out.println("Qual a hora da devolução: ");
					System.out.print(">> ");
					horaDevol = teclado.nextInt();

					System.out.println();
					System.out.println("Qual o minuto da devolução: ");
					System.out.print(">> ");
					minDevol = teclado.nextInt();

					Emprestimo emprestimo = new Emprestimo(amigoDevol, item.getIdItem(), diaDevol, mesDevol, anoDevol,
							horaDevol, minDevol, item, lista.getAlAmigos().get(amigoDevol));

					emprestimo.setDataDevolucao2(diaDevol, mesDevol, anoDevol, horaDevol, minDevol);
					item.devolver();
					// TODO remover a pessoa do emprestimo quando ela já devolveu o ITEM.
					System.out.println();
					System.out.println("Item devolvido com sucesso!");
				} else
					System.out.println("O Item está ocupado no momento, tente novamente mais tarde!");
			}
		}
	}

	private static void listarHistorico(ListaEmprestimos historico) {

		if (historico.getAlEmprestimos().size() == 0)
			System.out.println("Não houveram empréstimos");
		else {
			for (Emprestimo emprestimo : historico.getAlEmprestimos()) {
				System.out.println(emprestimo);
			}
		}
	}

	private static void alterarEstado() {
		// -> Variables
		// Scanner teclado = new Scanner(System.in);

		System.out.println("Escolha número 8");
	}
}
