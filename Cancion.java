import java.util.Scanner;
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

    @Override
    public void pedirDatos() {
        String t,a;
        int d;
        Scanner sc = new Scanner(System.in);
        
        t = pedirTexto("Titulo de la cancion: ");
        setTitulo(t);

        a = pedirTexto("Titulo de la cancion: ");
        artista = a;

        d = pedirValor("Duracion en segundos: ");
        setDuracion(d);
    }
    


    @Override
    public void mostrar() {
        System.out.println("[CANCION] "
                + titulo
                + " | Artista: " + artista
                + " | " + duracion + "s");
    }
}
 
    








