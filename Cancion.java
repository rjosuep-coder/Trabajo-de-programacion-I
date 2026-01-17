public class Cancion extends ContMulti {
    private String artista;

    public Cancion(String titulo, int duracion, String artista) {
        super(titulo, duracion);
        this.artista = artista;
    }

    public void reproducir() {
        System.out.println("Reproduciendo: " + getTitulo() + " - " + artista);
    }

    public void mostrarDetalles() {
        System.out.println("[CANCION] " + getTitulo() + " | Artista: " + artista + " | " + getDuracion() + "s");
    }
}
 
    

