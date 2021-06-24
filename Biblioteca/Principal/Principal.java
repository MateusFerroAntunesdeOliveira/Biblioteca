package Principal;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import Item.Biblioteca;
import Item.Disponibilidade;
import Item.Item;
import Item.Livro;
import Item.CD;
import Item.FitaK7;

import Amigo.Amigo;
import Amigo.ListaAmigos;

import Emprestimo.ListaEmprestimos;
import Emprestimo.Emprestimo;

/** 
 * @author Joao Gabriel Klein Lopes
 * @author Mateus Ferro Antunes de Oliveira
 * @author Milena Heloisa de Amorim Silverio
 * 
 * @version 1.01+1
 */

public class Principal {

	public static void main(String[] args) {

		// -> Variables
		int escolhaMenu;
		Scanner teclado = new Scanner(System.in);

		// -> dummy data Biblioteca
		final Biblioteca bib1 = new Biblioteca("Biblioteca Pessoal");

		// -> dummy data Item
		// final Item livro1 = new Livro(0, "50 Ideias de Fisica Quantica", Disponibilidade.DISPONIVEL, "Joanne Baker", 211);
		// final Item livro2 = new Livro(1, "O Senhor dos Aneis", Disponibilidade.DISPONIVEL, "J.R.R. Tolkien", 1201);
		// final Item livro3 = new Livro(2, "A Danca dos Dragoes", Disponibilidade.DISPONIVEL, "George R.R. Martin", 864);
		// final Item fita1 = new FitaK7(3, "Fita do Joaozinho", Disponibilidade.DISPONIVEL, "Joao", 5);
		// final Item fita2 = new FitaK7(4, "FitaK7 das boas", Disponibilidade.DISPONIVEL, "Jose da Fita", 45);
		// final Item CD1 = new CD(5, "Xuxa para os baixinhos", Disponibilidade.DISPONIVEL, "Xuxa", 10);
		// final Item CD2 = new CD(6, "Queen", Disponibilidade.DISPONIVEL, "Queen", 12);

		// -> dummy data addItem
		// bib1.addItem(livro1);
		// bib1.addItem(livro2);
		// bib1.addItem(livro3);
		// bib1.addItem(fita1);
		// bib1.addItem(fita2);
		// bib1.addItem(CD1);
		// bib1.addItem(CD2);

		// -> dummy data ListaAmigos
		final ListaAmigos lista = new ListaAmigos();

		// - > dummy data Amigos
		// final Amigo amigo1 = new Amigo(0, "Joao");
		// final Amigo amigo2 = new Amigo(1, "Milena");
		// final Amigo amigo3 = new Amigo(2, "Ricardo");
		// final Amigo amigo4 = new Amigo(3, "Cadu");
		// final Amigo amigo5 = new Amigo(4, "Mateus");

		// -> dummy data addAmigo
		// lista.addAmigo(amigo1);
		// lista.addAmigo(amigo2);
		// lista.addAmigo(amigo3);
		// lista.addAmigo(amigo4);
		// lista.addAmigo(amigo5);

		// -> dummy data ListaEmprestimos
		final ListaEmprestimos emprestimos = new ListaEmprestimos();
		ListaEmprestimos historico = new ListaEmprestimos();

		// -> Menu
		do {
			System.out.println("\n=-=-= Menu de opcoes =-=-=\n");
			System.out.println(" 01 - Cadastrar Item");
			System.out.println(" 02 - Cadastrar Amigo");
			System.out.println(" 03 - Emprestar Item");
			System.out.println(" 04 - Devolver Item");
			System.out.println(" 05 - Listar emprestimos atuais");
			System.out.println(" 06 - Listar historico de emprestimos");
			System.out.println(" 07 - Listar biblioteca");
			System.out.println(" 08 - Alterar estado manualmente");
			System.out.println(" 09 - Gravar dados");
			System.out.println(" 10 - Ler dados");
			System.out.println(" 00 - Sair do Programa");
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
					listarBiblioteca(bib1);
					break;
				case 8:
					alterarEstado(bib1);
					break;
				case 9:
					storeData(bib1, lista, emprestimos, historico);
					break;
				case 10:
					readData(bib1, lista, emprestimos, historico);
					break;
				case 0:
					System.exit(0);
				default:
					System.out.println("Escolha invalida, tente novamente!");
					break;
			}
		} while (escolhaMenu != 0);

		teclado.close();
	}

	/**
	 * Funcao cadastrarItem que recebe Biblioteca bib1
	 * @param bib1
	 */
	private static void cadastrarItem(Biblioteca bib1) {

		// -> Variables
		Scanner teclado = new Scanner(System.in);
		int escolhaItem, totPagLivro, numMusicaCD, numMusicaFita;
		String autorLivro, autorDisco, autorFita, tituloItem;

		// -> Menu Cadastrar Item
		System.out.println();
		System.out.println("=-=-=-=-=-= Cadatrar Item =-=-=-=-=-= ");
		System.out.println("Qual o tipo de item que deseja cadastrar: ");
		System.out.println("(1) - Livro");
		System.out.println("(2) - CD");
		System.out.println("(3) - Fita K7");
		System.out.print(">> ");
		escolhaItem = teclado.nextInt();
		System.out.println();

		switch (escolhaItem) {
			case 1:
				Livro obj1;
				obj1 = new Livro(bib1.size(), "", Disponibilidade.DISPONIVEL);

				System.out.println();
				System.out.println("Qual o titulo do item: ");
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
				System.out.println("Quantas paginas possui o livro: ");
				System.out.print(">> ");
				totPagLivro = teclado.nextInt();
				obj1.setTotPagLivro(totPagLivro);

				bib1.addItem(obj1);
				System.out.println();
				System.out.println("Livro adicionado com sucesso!");
				System.out.println("Titulo do livro: " + obj1.getTituloItem() + "\n" + "Autor do livro: "
						+ obj1.getAutorLivro() + "\n" + "Numero de paginas: " + obj1.getTotPagLivro());

				break;
			case 2:
				CD obj2;
				obj2 = new CD(bib1.size(), "", Disponibilidade.DISPONIVEL);

				System.out.println();
				System.out.println("Qual o titulo do item: ");
				System.out.print(">> ");
				teclado.nextLine();
				tituloItem = teclado.nextLine();
				obj2.setTituloItem(tituloItem);

				System.out.println();
				System.out.println("Qual o autor do CD: ");
				System.out.print(">> ");
				autorDisco = teclado.nextLine();
				obj2.setAutorDisco(autorDisco);

				System.out.println();
				System.out.println("Quantas musicas tem o CD: ");
				System.out.print(">> ");
				numMusicaCD = teclado.nextInt();
				obj2.setNumMusicaCD(numMusicaCD);

				bib1.addItem(obj2);
				System.out.println();
				System.out.println("CD adicionado com sucesso!");
				System.out.println("Titulo do CD: " + obj2.getTituloItem() + "\n" + "Autor do CD: "
						+ obj2.getAutorDisco() + "\n" + "Numero de musicas: " + obj2.getNumMusicaCD());

				break;
			case 3:
				FitaK7 obj3;
				obj3 = new FitaK7(bib1.size(), "", Disponibilidade.DISPONIVEL);

				System.out.println();
				System.out.println("Qual o titulo do item: ");
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
						+ obj3.getAutorFita() + "\n" + "Numero de musicas: " + obj3.getNumMusicaFita());

				break;
			default:
				System.out.println();
				System.out.println("Digite um valor correto!");
				break;
			}
	}

	/**
	 * Funcao cadastrarAmigo que recebe ListaAmigos lista
	 * @param lista
	 */
	private static void cadastrarAmigo(ListaAmigos lista) {
		
		// -> Variables
		Scanner teclado = new Scanner(System.in);
		String nomeAmigo = "";
		Amigo amigo = new Amigo(lista.getAlAmigos().size(), nomeAmigo);

		// -> Menu cadastrar Amigo
		System.out.println();
		System.out.println("Qual o nome do seu amigo: ");
		System.out.print(">> ");
		nomeAmigo = teclado.nextLine();
		System.out.println();
		amigo.setNomeAmigo(nomeAmigo);
		lista.addAmigo(amigo);
		System.out.println("Amigo " + nomeAmigo + " cadastrado com sucesso!");
	}

	/**
	 * Funcao emprestarItem que recebe Biblioteca bib1, ListaAmigos lista, ListaEmprestimos emprestimos, ListaEmprestimos historico
	 * @param bib1
	 * @param lista
	 * @param emprestimos
	 * @param historico
	 */
	private static void emprestarItem(Biblioteca bib1, ListaAmigos lista, ListaEmprestimos emprestimos, ListaEmprestimos historico) {
		
		// -> Variables
		Scanner teclado = new Scanner(System.in);
		int amigoEmprest, escolhaItemEmprest, diaEmprestimo, mesEmprestimo, anoEmprestimo, horaEmprestimo, minEmprestimo;

		// -> Menu emprestarItem
		System.out.println("Para quem voce esta emprestando: ");
		System.out.println();
		for (int i = 0; i < lista.getAlAmigos().size(); i++) {
			System.out.println("(" + i + ") " + lista.getAlAmigos().get(i));
		}
		System.out.print(">> ");
		amigoEmprest = teclado.nextInt();
		System.out.println();

		System.out.println("Qual item voce quer emprestar: ");
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
					System.out.println("Qual o dia do emprestimo: ");
					System.out.print(">> ");
					diaEmprestimo = teclado.nextInt();

					System.out.println();
					System.out.println("Qual o mes do emprestimo: ");
					System.out.print(">> ");
					mesEmprestimo = teclado.nextInt();

					System.out.println();
					System.out.println("Qual o ano do emprestimo: ");
					System.out.print(">> ");
					anoEmprestimo = teclado.nextInt();

					System.out.println();
					System.out.println("Qual a hora do emprestimo: ");
					System.out.print(">> ");
					horaEmprestimo = teclado.nextInt();

					System.out.println();
					System.out.println("Qual o minuto do emprestimo: ");
					System.out.print(">> ");
					minEmprestimo = teclado.nextInt();

					Emprestimo emprestimo = new Emprestimo(amigoEmprest, item.getIdItem(), LocalDateTime.of(anoEmprestimo, mesEmprestimo, diaEmprestimo, horaEmprestimo, minEmprestimo), item, lista.getAlAmigos().get(amigoEmprest));

					emprestimos.addEmprestimo(emprestimo);
					item.emprestar();
					historico.getAlEmprestimos().add(emprestimo);
					System.out.println();
					System.out.println("Item emprestado com sucesso!");
					System.out.println();
					System.out.println(emprestimo);
				} else
					System.out.println("O item esta ocupado no momento, tente novamente mais tarde!");
			}
		}
	}

	/**
	 * Funcao devolverItem que recebe Biblioteca bib1, ListaAmigos lista, ListaEmprestimos emprestimos
	 * @param bib1
	 * @param lista
	 * @param emprestimos
	 */
	private static void devolverItem(Biblioteca bib1, ListaAmigos lista, ListaEmprestimos emprestimos) {

		// -> Variables
		ArrayList<Amigo> amigos = new ArrayList<Amigo>();
		Scanner teclado = new Scanner(System.in);
		Amigo amigoDevol; 
		int escolhaItemDevol, diaDevol, mesDevol, anoDevol, horaDevol, minDevol;

		System.out.println("Quem esta devolvendo o item: ");
		System.out.println();
		if (emprestimos.getAlEmprestimos().size() == 0) {
			System.out.println("\nNinguem esta emprestando nenhum Item no momento.");
		} else {
			for (Emprestimo emprestimo : emprestimos.getAlEmprestimos()) {
				System.out.println("(" + emprestimos.getAlEmprestimos().indexOf(emprestimo) + ") " + emprestimo.getAmigo().getNomeAmigo());
				amigos.add(emprestimo.getAmigo());
			}
		}
		System.out.println();
		System.out.print(">> ");
		amigoDevol = amigos.get(teclado.nextInt());  
		System.out.println();

		System.out.println("Qual item voce quer devolver: ");
		System.out.println();
		for (Emprestimo emprestimo : emprestimos.getAlEmprestimos()) {
			if (emprestimo.getAmigo().getIdAmigo() == amigoDevol.getIdAmigo() && emprestimo.getItem().getDispItem().equals(Disponibilidade.EMPRESTADO)) {
				System.out.println("(" + emprestimo.getItem().getIdItem() + ") " + bib1.getAlItem().get(emprestimo.getItem().getIdItem()));
			}
		}
	
		System.out.print(">> ");
		escolhaItemDevol = teclado.nextInt();
		System.out.println();

		for (Item item : bib1.getAlItem()) {
			if (item.getIdItem() == escolhaItemDevol) {
				if (item.getDispItem() == Disponibilidade.EMPRESTADO) {
					System.out.println();
					System.out.println("Qual o dia da devolucao: ");
					System.out.print(">> ");
					diaDevol = teclado.nextInt();

					System.out.println();
					System.out.println("Qual o mes da devolucao: ");
					System.out.print(">> ");
					mesDevol = teclado.nextInt();

					System.out.println();
					System.out.println("Qual o ano da devolucao: ");
					System.out.print(">> ");
					anoDevol = teclado.nextInt();

					System.out.println();
					System.out.println("Qual a hora da devolucao: ");
					System.out.print(">> ");
					horaDevol = teclado.nextInt();

					System.out.println();
					System.out.println("Qual o minuto da devolucao: ");
					System.out.print(">> ");
					minDevol = teclado.nextInt();

					Emprestimo emprestimo = new Emprestimo(amigoDevol.getIdAmigo(), item.getIdItem(), diaDevol, mesDevol, anoDevol, horaDevol, minDevol, item, amigoDevol);

					emprestimo.setDataDevolucao2(diaDevol, mesDevol, anoDevol, horaDevol, minDevol);
					item.devolver();
					System.out.println();
					System.out.println("Item devolvido com sucesso!");
				} else
					System.out.println("O Item esta ocupado no momento, tente novamente mais tarde!");
			}
		}
	}

	/**
	 * Funcao listarEmprestimosAtuais que recebe Biblioteca bib1, ListaAmigos lista, ListaEmprestimos emprestimos
	 * @param bib1
	 * @param lista
	 * @param emprestimos
	 */
	private static void listarEmprestimosAtuais(Biblioteca bib1, ListaAmigos lista, ListaEmprestimos emprestimos) {
		
		if (emprestimos.getAlEmprestimos().size() == 0) System.out.println("Nao ha emprestimos ainda!");
		else {
			for (Emprestimo emprestimo : emprestimos.getAlEmprestimos()) {
					if (emprestimo.getItem().getDispItem() == Disponibilidade.EMPRESTADO) {
					System.out.println(emprestimo);
				}
			}
		}
	}

	/**
	 * Funcao listarHistorico que recebe ListaEmprestimos historico
	 * @param historico
	 */
	private static void listarHistorico(ListaEmprestimos historico) {

		if (historico.getAlEmprestimos().size() == 0)
			System.out.println("Nao houveram emprestimos");
		else {
			for (Emprestimo emprestimo : historico.getAlEmprestimos()) {
				System.out.println(emprestimo);
			}
		}
	}

	/**
	 * Funcao listarBiblioteca que recebe Biblioteca bib1
	 * @param bib1
	 */
	private static void listarBiblioteca(Biblioteca bib1) {
		
		// -> Variables
		Scanner teclado = new Scanner(System.in);
		int ordenarBib;

		if (bib1.size() == 0)
			System.out.println("Biblioteca esta vazia no momento!");
		else {
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("Deseja ordenar em ordem crescente a biblioteca (por titulo)? ");
			System.out.println();
			System.out.println("Caso digite (1), nao sera possivel retornar para a ordenacao anterior");
			System.out.println("A Alteracao nao podera ser desfeita! So pode ser realizada uma vez!");
			System.out.println();
			System.out.println("(1) SIM ");
			System.out.println("(2) NaO ");
			System.out.println();
			System.out.println("(3) Voltar pro menu");
			System.out.println();
			System.out.print(">> ");
			ordenarBib = teclado.nextInt();

			switch (ordenarBib) {
				case 1:
					System.out.println();
					Collections.sort(bib1.getAlItem());
					for (Item item : bib1.getAlItem()) {
						System.out.println("Titulo do item: " + item.getTituloItem() + " - " + bib1.getAlItem().get(item.getIdItem()));
					}
					break;
				case 2:
					System.out.println();
					for (Item item : bib1.getAlItem()) {
						System.out.println("(" + item.getIdItem() + ")" + " - " + "Titulo do item: " + item.getTituloItem() + " - " + bib1.getAlItem().get(item.getIdItem()));
					}
					break;
				case 3:
					break;
				default:
					System.out.println("Por gentileza, digite uma opcao valida!");
					break;
			}
		}
	}

	/**
	 * Funcao alterarEstado que recebe Biblioteca bib1
	 * @param bib1
	 */
	private static void alterarEstado(Biblioteca bib1) {
		
		// -> Variables
		Scanner teclado = new Scanner(System.in);
		int itemAlterarEstado, alterarEstado;

		// -> Menu alterarEstado
		System.out.println("\nQual item voce quer alterar o estado: ");
		System.out.println();
		for (Item item : bib1.getAlItem()) {
			System.out.println("(" + item.getIdItem() + ") " + bib1.getAlItem().get(item.getIdItem()));
		}
		System.out.print(">> ");
		itemAlterarEstado = teclado.nextInt();

		System.out.println("Para qual estado voce quer alterar: ");
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
				if (bib1.getAlItem().get(itemAlterarEstado).getDispItem() != Disponibilidade.EMPRESTADO) System.out.println("O item que voce escolheu mudou de estado, confira na listagem da biblioteca!");
				else System.out.println("Nao consigo acessar o livro para a consulta, ele pode estar emprestado...");
				break;
			case 2:
				for (int i = 0; i < bib1.size(); i++) {
					bib1.getAlItem().get(itemAlterarEstado).Danificado();
				}
				System.out.println("O item que voce escolheu mudou de estado, confira na listagem da biblioteca!");
				break;
			case 3:
				for (int i = 0; i < bib1.size(); i++) {
					bib1.getAlItem().get(itemAlterarEstado).Extraviado();
				}
				System.out.println("O item que voce escolheu mudou de estado, confira na listagem da biblioteca!");
				break;
			default:
				System.out.println("Digite um valor entre 1 e 3, por gentileza!");
				break;
		}
	}

	/**
	 * Funcao storeData que recebe Biblioteca bib1, ListaAmigos lista, ListaEmprestimos emprestimos, ListaEmprestimos historico
	 * @param bib1
	 * @param lista
	 * @param emprestimos
	 * @param historico
	 */
	public static void storeData(Biblioteca bib1, ListaAmigos lista, ListaEmprestimos emprestimos, ListaEmprestimos historico) {
		
		// -> Variables
		ObjectOutputStream saida = null;

		try {
			saida = new ObjectOutputStream(new FileOutputStream("D:\\Documentos\\Programas\\Git_Hub\\Biblioteca\\Biblioteca\\Data\\Data.txt"));
			saida.writeObject(bib1);
			saida.writeObject(lista);
			saida.writeObject(emprestimos);
			saida.writeObject(historico);
		} catch (IOException e1) {
			System.out.println(e1.getMessage());
		} finally {
			try {
				if (saida != null) {
					saida.close();
				}
			} catch (IOException e2) {
				System.out.println(e2.getMessage());
			}
		}
		System.out.println("Dados armazenados");
	}

	/**
	 * Funcao readData que recebe Biblioteca bib1, ListaAmigos lista, ListaEmprestimos emprestimos, ListaEmprestimos historico
	 * @param bib1
	 * @param lista
	 * @param emprestimos
	 * @param historico
	 */
	public static void readData(Biblioteca bib1, ListaAmigos lista, ListaEmprestimos emprestimos, ListaEmprestimos historico) {
		
		// -> Variables
		ObjectInputStream entrada = null;
		Biblioteca bib1Temporario = null;
		ListaAmigos listaTemporario = null;
		ListaEmprestimos emprestimosTemporario = null;
		ListaEmprestimos historicoTemporario = null;

		try {
			entrada = new ObjectInputStream(new FileInputStream("D:\\Documentos\\Programas\\Git_Hub\\Biblioteca\\Biblioteca\\Data\\Data.txt"));
			bib1Temporario = (Biblioteca) entrada.readObject();
			listaTemporario = (ListaAmigos) entrada.readObject();
			emprestimosTemporario = (ListaEmprestimos) entrada.readObject();
			historicoTemporario = (ListaEmprestimos) entrada.readObject();
		} catch (IOException e1) {
			System.out.println(e1.getMessage());
		} catch (ClassNotFoundException e2) {
			System.out.println(e2.getMessage());
		} finally {
			try {
				if (entrada != null) {
					entrada.close();
					bib1.setAlItem(bib1Temporario.getAlItem());
					bib1.setNomeBib(bib1Temporario.getNomeBib());
					lista.setAlAmigos(listaTemporario.getAlAmigos());
					emprestimos.setAlEmprestimos(emprestimosTemporario.getAlEmprestimos());
					historico.setAlEmprestimos(historicoTemporario.getAlEmprestimos());
					System.out.println("Dados foram carregados");
				}
			} catch (IOException e3) {
				System.out.println(e3.getMessage());
			}
		}
	}
}
