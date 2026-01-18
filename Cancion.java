import java.util.Scanner;
public class Cancion extends ContMulti {
    private String artista;

    public Cancion(String titulo, double duracion, String artista) {
        super(titulo, duracion);
        this.artista = artista;
    }

    public void reproducir() {
        System.out.println("Reproduciendo: " + getTitulo() + " - " + artista);
    }

    public void mostrarDetalles() {
        System.out.println("[CANCION] " + getTitulo() + " | Artista: " + artista + " | " + getDuracion() + "s");
    }
    public  Cancion pedirDatos() {
        String titulo,artista;
        double duracion;
        Scanner tex;
        Cancion c;
        tex= new Scanner(System.in);
        
        System.out.print("Introduce el título: ");
         titulo = sc.nextLine();

        System.out.print("Introduce el artista: ");
         artista = sc.nextLine();

        System.out.print("Introduce la duración (segundos): ");
         duracion = sc.nextDouble();
    
        //Limpiar el buffer después de leer números
        sc.nextLine(); 
         c = new Cancion(titulo, duracion, artista);
        return c;
    }
}
 
    




