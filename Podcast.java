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
        Scanner sc = new Scanner(System.in);

        System.out.print("Titulo del podcast: ");
        setTitulo(sc.nextLine());

        System.out.print("Numero de episodio: ");
        numeroEpisodio = sc.nextInt();

        System.out.print("Duracion (segundos): ");
        setDuracion(sc.nextInt());
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo podcast: "
                + titulo
                + " | Episodio "
                + numeroEpisodio);
    }

    @Override
    public void mostrar() {
        System.out.println("[PODCAST] "
                + titulo
                + " | Ep. " + episodio
                + " | " + duracion + "s");
    }
        
}

