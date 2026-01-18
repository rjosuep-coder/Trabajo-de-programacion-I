public class Podcast extends ContMulti{
    int episodio;

    public Podcast(int episodio, String titulo, int duracionSegundos) {
        super(titulo, duracionSegundos);
        this.episodio = episodio;
    }

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }
        
}
