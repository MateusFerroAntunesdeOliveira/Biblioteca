package Principal;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
		final Item livro1 = new Livro(0, "50 Ideias de Fisica Quantica", Disponibilidade.DISPONIVEL, "Joanne Baker", 211);
		final Item livro2 = new Livro(1, "O Senhor dos Aneis", Disponibilidade.DISPONIVEL, "J.R.R. Tolkien", 1201);
		final Item livro3 = new Livro(2, "A Dança dos Dragões", Disponibilidade.DISPONIVEL, "George R.R. Martin", 864);
		final Item fita1 = new FitaK7(3, "Fita do Joãozinho", Disponibilidade.DISPONIVEL, "João", 5);
		final Item fita2 = new FitaK7(4, "FitaK7 das boas", Disponibilidade.DISPONIVEL, "José da Fita", 45);
		final Item dvd1 = new DVD(5, "Xuxa para os baixinhos", Disponibilidade.DISPONIVEL, "Xuxa", 10);
		final Item dvd2 = new DVD(6, "Victor e Leo", Disponibilidade.DISPONIVEL, "Victor e Leo", 22);
		final Item dvd3 = new DVD(7, "Queen", Disponibilidade.DISPONIVEL, "Queen", 12);

		// -> dummy data addItem
		bib1.addItem(livro1);
		bib1.addItem(livro2);
		bib1.addItem(livro3);
		bib1.addItem(fita1);
		bib1.addItem(fita2);
		bib1.addItem(dvd1);
		bib1.addItem(dvd2);
		bib1.addItem(dvd3);

		// -> dummy data ListaAmigos
		final ListaAmigos lista = new ListaAmigos();

		// - > dummy data Amigos
		final Amigo amigo1 = new Amigo(0, "Joao");
		final Amigo amigo2 = new Amigo(1, "Milena");
		final Amigo amigo3 = new Amigo(2, "Ricardo");
		final Amigo amigo4 = new Amigo(3, "Cadu");
		final Amigo amigo5 = new Amigo(4, "Mateus");

		// -> dummy data addAmigo
		lista.addAmigo(amigo1);
		lista.addAmigo(amigo2);
		lista.addAmigo(amigo3);
		lista.addAmigo(amigo4);
		lista.addAmigo(amigo5);

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
					listarEmprestimosAtuais(bib1, lista, emprestimos);
					break;
				case 6:
					listarHistorico(historico);
					break;
				case 7:
					//TODO Fazer a listagem em ordem crescente
					if (bib1.size() == 0)
						System.out.println("Biblioteca está vazia");
					else {
						for (Item item : bib1.getAlItem()) {
							System.out.println("(" + item.getIdItem() + ") " + "- Titulo do item: " + item.getTituloItem() + " - " + bib1.getAlItem().get(item.getIdItem()));
						}
					}
					break;
				case 8:
					alterarEstado(bib1);
					break;
				case 9:
					//TODO Salvar e ler os dados
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
				obj1 = new Livro(bib1.size(), "", Disponibilidade.DISPONIVEL);

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
				System.out.println("Titulo do livro: " + obj1.getTituloItem() + "\n" + "Autor do livro: "
						+ obj1.getAutorLivro() + "\n" + "Numero de páginas: " + obj1.getTotPagLivro());

				break;
			case 2:
				DVD obj2;
				obj2 = new DVD(bib1.size(), "", Disponibilidade.DISPONIVEL);

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
				System.out.println("Titulo do DVD: " + obj2.getTituloItem() + "\n" + "Autor do DVD: "
						+ obj2.getAutorDisco() + "\n" + "Numero de músicas: " + obj2.getNumMusicaDvd());

				break;
			case 3:
				FitaK7 obj3;
				obj3 = new FitaK7(bib1.size(), "", Disponibilidade.DISPONIVEL);

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
				System.out.println("Titulo da fita: " + obj3.getTituloItem() + "\n" + "Autor da fita: "
						+ obj3.getAutorFita() + "\n" + "Numero de músicas: " + obj3.getNumMusicaFita());

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
		String nomeAmigo = "";
		Amigo amigo = new Amigo(lista.getAlAmigos().size(), nomeAmigo);

		System.out.println();
		System.out.println("Qual o nome do seu abiguinho: ");
		System.out.print(">> ");
		nomeAmigo = teclado.nextLine();
		System.out.println();
		amigo.setNomeAmigo(nomeAmigo);

		lista.addAmigo(amigo);
		System.out.println("Amigo " + nomeAmigo + " cadastrado com sucesso!");
	}

	private static void emprestarItem(Biblioteca bib1, ListaAmigos lista, ListaEmprestimos emprestimos, ListaEmprestimos historico) {
		// -> Variables
		Scanner teclado = new Scanner(System.in);
		int amigoEmprest, escolhaItemEmprest, diaEmprestimo, mesEmprestimo, anoEmprestimo, horaEmprestimo, minEmprestimo;

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
			if (item.getDispItem().equals(Disponibilidade.DISPONIVEL)) {
				System.out.println("(" + item.getIdItem() + ") " + "Titulo do item: " + item.getTituloItem() + "\n" + bib1.getAlItem().get(item.getIdItem()));
			}
		}
		System.out.print(">> ");
		escolhaItemEmprest = teclado.nextInt();
		System.out.println();

		for (Item item : bib1.getAlItem()) {
			if (item.getIdItem() == escolhaItemEmprest) {
				if (item.getDispItem() == Disponibilidade.DISPONIVEL) {
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

	//TODO DEVOLVER ITEM
	// -> SÓ PODE DEVOLVER ITEM SE ELE TIVER EMPRESTADO (MOSTRAR SOMENTE OS EMPRESTADOS)
	// -> Remover a pessoa do emprestimo quando ela já devolveu o ITEM.

	private static void devolverItem(Biblioteca bib1, ListaAmigos lista, ListaEmprestimos emprestimos) {
		// -> Variables
		Scanner teclado = new Scanner(System.in);
		int amigoDevol, escolhaItemDevol, diaDevol, mesDevol, anoDevol, horaDevol, minDevol;

		System.out.println("Quem está devolvendo o item: ");
		System.out.println();
		if (emprestimos.getAlEmprestimos().size() == 0) {
			System.out.println("\nNinguem está emprestando nenhum Item no momento.");
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
					System.out.println();
					System.out.println("Item devolvido com sucesso!");
				} else
					System.out.println("O Item está ocupado no momento, tente novamente mais tarde!");
			}
		}
	}

	//TODO LISTAR EMPRESTIMOS 
	// -> ARRUMAR O FOR PRA NÃO PRINTAR + DE 1 VEZ
	private static void listarEmprestimosAtuais(Biblioteca bib1, ListaAmigos lista, ListaEmprestimos emprestimos) {
		for (Item item : bib1.getAlItem()) {
			for (Emprestimo emprestimo : emprestimos.getAlEmprestimos()) {
				if (item.getDispItem() == Disponibilidade.EMPRESTADO) {
					System.out.println("Titulo do item: " + item.getTituloItem() + " - " + "Quem emprestou: "
							+ emprestimo.getAmigo().getNomeAmigo() + "\nData empréstimo: "
							+ emprestimo.getDataEmprestimo().format(DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm")));
				}
			}
		}
	}

	//TODO LISTAR HISTORICO
	// -> Fazer o fluxo correto, perguntando idItem e as movimentações do item
	private static void listarHistorico(ListaEmprestimos historico) {
		
		if (historico.getAlEmprestimos().size() == 0)
			System.out.println("Não houveram empréstimos");
		else {
			for (Emprestimo emprestimo : historico.getAlEmprestimos()) {
				System.out.println(emprestimo);
			}
		}
	}

	private static void alterarEstado(Biblioteca bib1) {
		// -> Variables
		Scanner teclado = new Scanner(System.in);
		int itemAlterarEstado, alterarEstado;

		System.out.println("\nQual item você quer alterar o estado: ");
		System.out.println();
		for (Item item : bib1.getAlItem()) {
			System.out.println("(" + item.getIdItem() + ") " + bib1.getAlItem().get(item.getIdItem()));
		}
		System.out.print(">> ");
		itemAlterarEstado = teclado.nextInt();

		System.out.println("Para qual estado você quer alterar: ");
		System.out.println("(1) - CONSULTALOCAL");
		System.out.println("(2) - DANIFICADO");
		System.out.println("(3) - EXTRAVIADO");
		System.out.print(">> ");
		teclado.nextLine();
		alterarEstado = teclado.nextInt();

		switch (alterarEstado) {
			case 1:
				for (int i = 0; i < bib1.size(); i++) {
					if (bib1.getAlItem().get(itemAlterarEstado).getDispItem() != Disponibilidade.EMPRESTADO) {
						bib1.getAlItem().get(itemAlterarEstado).consultaLocal();
					}
				}
				if (bib1.getAlItem().get(itemAlterarEstado).getDispItem() != Disponibilidade.EMPRESTADO) System.out.println("O item que você escolheu mudou de estado, confira na listagem da biblioteca!");
				else System.out.println("Não consigo acessar o livro para a consulta, ele pode estar emprestado...");
				break;
			case 2:
				for (int i = 0; i < bib1.size(); i++) {
					bib1.getAlItem().get(itemAlterarEstado).Danificado();
				}
				System.out.println("O item que você escolheu mudou de estado, confira na listagem da biblioteca!");
				break;
			case 3:
				for (int i = 0; i < bib1.size(); i++) {
					bib1.getAlItem().get(itemAlterarEstado).Extraviado();
				}
				System.out.println("O item que você escolheu mudou de estado, confira na listagem da biblioteca!");
				break;
			default:
				System.out.println("Digite um valor entre 1 e 3, por gentileza!");
				break;
		}
	}
}
