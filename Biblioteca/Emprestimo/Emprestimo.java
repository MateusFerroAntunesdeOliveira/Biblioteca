package Emprestimo;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import Amigo.Amigo;
import Item.Item;

/** 
 * @author João Gabriel Klein Lopes
 * @author Mateus Ferro Antunes de Oliveira
 * @author Milena Heloisa de Amorim Silvério
 * 
 * @version 1.01+1
 */

public class Emprestimo implements Comparable<Emprestimo>, Serializable {

	// -> Variables
	private int idAmigo;
	private int idItem;
	private LocalDateTime dataEmprestimo;
	private LocalDateTime dataDevolucao;
	private Item item;
	private Amigo amigo;

	// -> Constructors
	/**
	 * 
	 * @param idAmigo Id do Amigo
	 * @param idItem Id do Item
	 */
	public Emprestimo(int idAmigo, int idItem) {
		this.idAmigo = idAmigo;
		this.idItem = idItem;
		dataEmprestimo = LocalDateTime.of(2021, 1, 1, 12, 0, 0);
		dataDevolucao = LocalDateTime.of(2021, 1, 2, 12, 0, 0);
	}

	/**
	 * 
	 * @param idAmigo Id do Amigo
	 * @param idItem Id do Item
	 * @param dataEmprestimo Data do Emprestimo
	 */

	public Emprestimo(int idAmigo, int idItem, LocalDateTime dataEmprestimo) {
		this.idAmigo = idAmigo;
		this.idItem = idItem;
		this.dataEmprestimo = LocalDateTime.now();
	}

	/**
	 * 
	 * @param idAmigo Id do Amigo
	 * @param dataDevolucao Data da Devolucao
	 */
	public Emprestimo(int idAmigo, LocalDateTime dataDevolucao) {
		this.idAmigo = idAmigo;
		this.idItem = 0000;
		this.dataDevolucao = LocalDateTime.now();
	}

	/**
	 * 
	 * @param idAmigo Id do Amigo
	 * @param idItem Id do Item
	 * @param item Item
	 * @param amigo Amigo
	 */
	public Emprestimo(int idAmigo, int idItem, Item item, Amigo amigo) {
		this.idAmigo = idAmigo;
		this.idItem = idItem;
		this.dataEmprestimo = LocalDateTime.of(2021, 1, 1, 12, 0);
		this.dataDevolucao = LocalDateTime.of(2021, 1, 2, 12, 0);
		this.item = item;
		this.amigo = amigo;
	}

	/**
	 * 
	 * @param idAmigo Id do Amigo
	 * @param idItem Id do Item
	 * @param dataEmprestimo Data do Emprestimo
	 * @param item Item
	 * @param amigo Amigo
	 */
	public Emprestimo(int idAmigo, int idItem, LocalDateTime dataEmprestimo, Item item, Amigo amigo) {
		this.idAmigo = idAmigo;
		this.idItem = idItem;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = null;
		this.item = item;
		this.amigo = amigo;
	}

	/**
	 * 
	 * @param idAmigo Id do Amigo
	 * @param idItem Id do Item
	 * @param dia Dia
	 * @param mes Mes
	 * @param ano Ano
	 * @param hora Hora
	 * @param min Minutos
	 * @param item Item
	 * @param amigo Amigo
	 */
	public Emprestimo(int idAmigo, int idItem, int dia, int mes, int ano, int hora, int min, Item item, Amigo amigo) {
		this.idAmigo = idAmigo;
		this.idItem = idItem;
		this.item = item;
		this.amigo = amigo;
	}

	/**
	 * 
	 * @param idAmigo Id do Amigo
	 * @param idItem Id do Item
	 * @param dataEmprestimo Data do Emprestimo
	 * @param dataDevolucao Data da Evolucao
	 */
	public Emprestimo(int idAmigo, int idItem, LocalDateTime dataEmprestimo, LocalDateTime dataDevolucao) {
		this.idAmigo = idAmigo;
		this.idItem = idItem;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
	}

	/**
	 * 
	 * @param idAmigo Id do Amigo
	 * @param idItem Id do Item
	 * @param dataEmprestimo Data do Emprestimo
	 * @param dataDevolucao Data da Devolucao
	 * @param item Item 
	 * @param amigo Amigo
	 */
	public Emprestimo(int idAmigo, int idItem, LocalDateTime dataEmprestimo, LocalDateTime dataDevolucao, Item item, Amigo amigo) {
		this.idAmigo = idAmigo;
		this.idItem = idItem;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
		this.item = item;
		this.amigo = amigo;
	}

	// -> Getters
	/**
	 * Devolve um inteiro que representa o Id do Amigo
	 * @return Id do Amigo
	 */
	public int getIdAmigo() {
		return idAmigo;
	}

	/**
	 * Devolve um inteiro que representa o Id do Item
	 * @return Id do Item
	 */
	public int getIdItem() {
		return idItem;
	}

	/**
	 * Devolve um LocalDateTime para a Data do Emprestimo
	 * @return Data do Emprestimo 
	 */
	public LocalDateTime getDataEmprestimo() {
		return dataEmprestimo;
	}

	/**
	 * Devolve um LocalDateTime para a Data da Devolucao
	 * @return Data da Devolucao
	 */
	public LocalDateTime getDataDevolucao() {
		return dataDevolucao;
	}

	/**
	 * Devolve o Item
	 * @return Item
	 */
	public Item getItem() {
		return item;
	}

	/**
	 * Devolve Amigo
	 * @return Amigo
	 */
	public Amigo getAmigo() {
		return amigo;
	}

	// -> Setters
	/**
	 * Seta um Id do Amigo
	 * @param idAmigo
	 */
	public void setIdAmigo(int idAmigo) {
		this.idAmigo = idAmigo;
	}

	/**
	 * Seta um Id para Item
	 * @param idItem
	 */
	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}

	/**
	 * Seta uma Data de Emprestimo
	 * @param dataEmprestimo
	 */
	public void setDataEmprestimo(LocalDateTime dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	/**
	 * Seta uma segunda Data de Emprestimo
	 * @param dia
	 * @param mes
	 * @param ano
	 * @param hora
	 * @param minuto
	 */
	public void setDataEmprestimo2(int dia, int mes, int ano, int hora, int minuto) {
		this.dataEmprestimo = LocalDateTime.of(ano, mes, dia, hora, minuto);
	}

	/**
	 * Seta uma Data de Devolução
	 * @param dataDevolucao
	 */
	public void setDataDevolucao(LocalDateTime dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	/**
	 * Seta uma segunda Data de Devolução
	 * @param dia
	 * @param mes
	 * @param ano
	 * @param hora
	 * @param minuto
	 */
	public void setDataDevolucao2(int dia, int mes, int ano, int hora, int minuto) {
		this.dataDevolucao = LocalDateTime.of(ano, mes, dia, hora, minuto);
	}

	/**
	 * Seta um Item
	 * @param item
	 */
	public void setItem(Item item) {
		this.item = item;
	}

	/**
	 * Seta Amigo
	 * @param amigo
	 */
	public void setAmigo(Amigo amigo) {
		this.amigo = amigo;
	}

	// -> CompareTo
	/**
	 * Devolve a Data de Emprestimo para os emprestados
	 * @return compareTO
	 */
	@Override
	public int compareTo(Emprestimo dataEmprest) {
		return this.dataEmprestimo.compareTo(dataEmprest.getDataEmprestimo());
	}

	// -> toString
	/**
	 * Se a Data de Devolução for nula, Devolve uma String para apenas a Data Emprestimo, se não, Devolve uma String com Data Devolução e Data Emprestimo
	 * @retun toString
	 */
	@Override
	public String toString() {
		if (this.dataDevolucao == null) {
			return amigo + "\n" + item + "Data do emprestimo: "
					+ dataEmprestimo.format(DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm")) + "\n";
		} else
			return amigo + "\n" + item + "Data do emprestimo: "
					+ dataEmprestimo.format(DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm")) + "\nData da devolucao: "
					+ dataDevolucao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm")) + "\n";
	}
}
