package Item;

public class FitaK7 extends Item {

    private String autorFita;
	private int numMusicaFita;
    
    // -> Constructors
    public FitaK7(int idItem, String autorFita, int numMusicaFita) {
        super(idItem);
        this.autorFita = autorFita;
        this.numMusicaFita = numMusicaFita;
    }
    public FitaK7(int idItem, String tituloItem, String autorFita, int numMusicaFita) {
        super(idItem, tituloItem);
        this.autorFita = autorFita;
        this.numMusicaFita = numMusicaFita;
    }
    public FitaK7(int idItem, Disponibilidade dispItem, String autorFita, int numMusicaFita) {
        super(idItem, dispItem);
        this.autorFita = autorFita;
        this.numMusicaFita = numMusicaFita;
    }
    public FitaK7(int idItem, String tituloItem, Disponibilidade dispItem, String autorFita, int numMusicaFita) {
        super(idItem, tituloItem, dispItem);
        this.autorFita = autorFita;
        this.numMusicaFita = numMusicaFita;
    }

    // -> Getters
    public String getAutorFita() {
        return autorFita;
    }

    public int getNumMusicaFita() {
        return numMusicaFita;
    }

    // -> Setters
    public void setAutorFita(String autorFita) {
        this.autorFita = autorFita;
    }

    public void setNumMusicaFita(int numMusicaFita) {
        this.numMusicaFita = numMusicaFita;
    }

    // -> toString
    @Override
    public String toString() {
        return "FitaK7 [autorFita=" + autorFita + ", numMusicaFita=" + numMusicaFita + "]";
    }
}
