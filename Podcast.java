public class Podcast extends ContMulti{
    int episodio;

    public Podcast(int episodio, String titulo, int duracion) {
        super(titulo, duracion);
        this.episodio = episodio;
    }

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    @Override
    public void pedirDatos() {
        String t;
        int d,e;
                   
        t = pedirTexto("Titulo del Podcast: ");
        setTitulo(t);
        
        e = pedirValor("Numero de episodio: ");
        episodio = e;

        d = pedirValor("Duracion en segundos: ");
        setDuracion(d);
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo podcast: "
                + titulo
                + " | Episodio "
                + episodio);
    }

    @Override
    public void mostrar() {
        System.out.println("[PODCAST] "
                + titulo
                + " | Ep. " + episodio
                + " | " + duracion + "s");
    }
        
}


