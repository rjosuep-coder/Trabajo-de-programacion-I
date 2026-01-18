import java.util.Scanner;
import java.util.ArrayList;

public class Aplicacion {
         public static void main( String arg[]){
                  Aplicacion ap;
                  ap = new Aplicacion();
                  
                  ArrayList<ContMulti> playList;
                  playList = new ArrayList<ContMulti>();
                  
                  ap.agregar(playList);
                  
         }
         
    public void pedirContenido(ArrayList<ContMulti> playList) {
    Scanner sc = new Scanner(System.in);
    String opcion;

    System.out.println("¿Qué deseas agregar? (cancion / podcast / video)");
    opcion = sc.nextLine().toLowerCase();

    ContMulti contenido = null;

    switch (opcion) {
        case "cancion":
            contenido = new Cancion("", 0, "");
            break;

        case "podcast":
            contenido = new Podcast(0, "", 0);
            break;

        case "video":
            contenido = new Video("", 0, "");
            break;

        default:
            System.out.println("Opción no válida");
            return;
    }

    contenido.pedirDatos();
    playList.add(contenido);

    System.out.println("Contenido agregado a la playlist");
} 
    public void agregar(ArrayList<ContMulti> playList){
         do {
        pedirContenido(playList);
    } while (confirmarContenido());

    System.out.println("\nPlaylist creada:");
    for (ContMulti c : playList) {
        c.mostrar();
    }
    }
    
    public boolean confirmarContenido() {
    String op;
    Scanner tec;
    tec = new Scanner(System.in);
    System.out.print("¿Desea agregar otro contenido? (si/no): ");
    op = tec.nextLine().toLowerCase();

    return op.equals("si");
}
}

