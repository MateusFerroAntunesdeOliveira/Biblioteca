package Item;

/** 
 * @author Joao Gabriel Klein Lopes
 * @author Mateus Ferro Antunes de Oliveira
 * @author Milena Heloisa de Amorim Silverio
 * 
 * @version 1.01+1
 */

public class FitaK7 extends Item {

    // -> Variables
    private String autorFita;
	private int numMusicaFita;
    
    // -> Constructors
    /**
     * @param idItem Id do Item
     * @param autorFita Autor da Fita
     * @param numMusicaFita Numero de Musicas da Fita
     */
    public FitaK7(int idItem, String autorFita, int numMusicaFita) {
        super(idItem);
        this.autorFita = autorFita;
        this.numMusicaFita = numMusicaFita;
    }

    /**
     * @param idItem Id do Item
     * @param tituloItem Titulo do Item
     * @param dispItem Disponibilidade do Item
     */
    public FitaK7(int idItem, String tituloItem, Disponibilidade dispItem) {
        super(idItem, tituloItem, dispItem);
    }

    /**
     * @param idItem Id do Item
     * @param tituloItem Titulo do Item
     * @param autorFita Autor da Fita
     * @param numMusicaFita Numero de Musicas da Fita
     */
    public FitaK7(int idItem, String tituloItem, String autorFita, int numMusicaFita) {
        super(idItem, tituloItem);
        this.autorFita = autorFita;
        this.numMusicaFita = numMusicaFita;
    }

    /**
     * @param idItem Id do Item
     * @param dispItem Disponibilidade do Item
     * @param autorFita Autor da Fita
     * @param numMusicaFita Numero de Musicas da Fita
     */
    public FitaK7(int idItem, Disponibilidade dispItem, String autorFita, int numMusicaFita) {
        super(idItem, dispItem);
        this.autorFita = autorFita;
        this.numMusicaFita = numMusicaFita;
    }
    
    /**
     * @param idItem Id do Item
     * @param tituloItem Titulo do Item
     * @param dispItem Disponibilidade do Item
     * @param autorFita Autor da Fita
     * @param numMusicaFita Numero de Musicas da Fita
     */
    public FitaK7(int idItem, String tituloItem, Disponibilidade dispItem, String autorFita, int numMusicaFita) {
        super(idItem, tituloItem, dispItem);
        this.autorFita = autorFita;
        this.numMusicaFita = numMusicaFita;
        this.dispItem = Disponibilidade.DISPONIVEL;
    }

    // -> Getters
    /**
     * Devolve uma String com o Autor da Fita
     * @return AutorFita
     */
    public String getAutorFita() {
        return autorFita;
    }

    /**
     * Devolve um Inteiro com o numero de musicas da Fita
     * @return numMusicaFita
     */
    public int getNumMusicaFita() {
        return numMusicaFita;
    }

    // -> Setters
    /**
     * Seta o autor da Fita
     * @param autorFita
     */
    public void setAutorFita(String autorFita) {
        this.autorFita = autorFita;
    }

    /**
     * Seta o numero de musicas da Fita
     * @param numMusicaFita
     */
    public void setNumMusicaFita(int numMusicaFita) {
        this.numMusicaFita = numMusicaFita;
    }

    // -> toString
    /**
     * Devolve uma String com Autor da Fita, numero de musicas da Fita e a Disponibilidade Atual
     * @return toString
     */
    @Override
    public String toString() {
        return "FITAK7" + " - " + "Autor: " + autorFita + " - " + numMusicaFita  + " musicas " + "\nDisponibilidade atual: " + dispItem + "\n";
    }
}
