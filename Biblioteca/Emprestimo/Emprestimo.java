package Emprestimo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import Amigo.Amigo;
import Item.Item;

public class Emprestimo implements Comparable<Emprestimo> {

	private int diaEmprest, mesEmprest, anoEmprest, horaEmprest, minEmprest;
	private int idAmigo;
	private int idItem;
	private LocalDateTime dataEmprestimo;
	private LocalDateTime dataDevolucao;
	private Item item;
	private Amigo amigo;

	// -> Constructors
	public Emprestimo(int idAmigo, int idItem) {
		this.idAmigo = idAmigo;
		this.idItem = idItem;
		dataEmprestimo = LocalDateTime.of(2021, 1, 1, 12, 0, 0);
		dataDevolucao = LocalDateTime.of(2021, 1, 2, 12, 0, 0);
	}

	public Emprestimo(int idAmigo, int idItem, LocalDateTime dataEmprestimo) {
		this.idAmigo = idAmigo;
		this.idItem = idItem;
		this.dataEmprestimo = LocalDateTime.now();
	}

	public Emprestimo(int idAmigo, LocalDateTime dataDevolucao) {
		this.idAmigo = idAmigo;
		this.idItem = 0000;
		this.dataDevolucao = LocalDateTime.now();
	}

	public Emprestimo(int idAmigo, int idItem, Item item, Amigo amigo) {
		this.idAmigo = idAmigo;
		this.idItem = idItem;
		this.dataEmprestimo = LocalDateTime.of(2021, 1, 1, 12, 0);
		this.dataDevolucao = LocalDateTime.of(2021, 1, 2, 12, 0);
		this.item = item;
		this.amigo = amigo;
	}

	public Emprestimo(int idAmigo, int idItem, LocalDateTime dataEmprestimo, Item item, Amigo amigo) {
		this.idAmigo = idAmigo;
		this.idItem = idItem;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = null;
		this.item = item;
		this.amigo = amigo;
	}

	public Emprestimo(int idAmigo, int idItem, int dia, int mes, int ano, int hora, int min, Item item, Amigo amigo) {
		this.idAmigo = idAmigo;
		this.idItem = idItem;
		this.diaEmprest = dia;
		this.mesEmprest = mes;
		this.anoEmprest = ano;
		this.horaEmprest = hora;
		this.minEmprest = min;
		// this.dataEmprestimo = dataEmprestimo;
		// this.dataDevolucao = LocalDateTime.of(2021, 1, 2, 12, 0);
		this.item = item;
		this.amigo = amigo;
	}

	public Emprestimo(int idAmigo, int idItem, LocalDateTime dataEmprestimo, LocalDateTime dataDevolucao) {
		this.idAmigo = idAmigo;
		this.idItem = idItem;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
	}

	public Emprestimo(int idAmigo, int idItem, LocalDateTime dataEmprestimo, LocalDateTime dataDevolucao, Item item, Amigo amigo) {
		this.idAmigo = idAmigo;
		this.idItem = idItem;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
		this.item = item;
		this.amigo = amigo;
	}

	// -> Getters
	public int getIdAmigo() {
		return idAmigo;
	}

	public int getIdItem() {
		return idItem;
	}

	public LocalDateTime getDataEmprestimo() {
		return dataEmprestimo;
	}

	public LocalDateTime getDataDevolucao() {
		return dataDevolucao;
	}

	public Item getItem() {
		return item;
	}

	public Amigo getAmigo() {
		return amigo;
	}

	// -> Setters
	public void setIdAmigo(int idAmigo) {
		this.idAmigo = idAmigo;
	}

	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}

	public void setDataEmprestimo(LocalDateTime dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public void setDataEmprestimo2(int dia, int mes, int ano, int hora, int minuto) {
		this.dataEmprestimo = LocalDateTime.of(ano, mes, dia, hora, minuto);
	}

	public void setDataDevolucao(LocalDateTime dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public void setDataDevolucao2(int dia, int mes, int ano, int hora, int minuto) {
		this.dataDevolucao = LocalDateTime.of(ano, mes, dia, hora, minuto);
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public void setAmigo(Amigo amigo) {
		this.amigo = amigo;
	}

	// -> CompareTo
	@Override
	public int compareTo(Emprestimo dataEmprest) {
		return this.dataEmprestimo.compareTo(dataEmprest.getDataEmprestimo());
	}

	// -> toString
	@Override
	public String toString() {
		if (this.dataDevolucao == null) {
			return amigo + "\n" + item + "Data do empréstimo: "
					+ dataEmprestimo.format(DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm")) + "\n";
		} else
			return amigo + "\n" + item + "Data do empréstimo: "
					+ dataEmprestimo.format(DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm")) + "\nData da devolucao: "
					+ dataDevolucao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm")) + "\n";
	}
}
