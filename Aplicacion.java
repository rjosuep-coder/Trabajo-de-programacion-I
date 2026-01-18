import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparador;
public class Aplicacion {
         public static void main( String arg[]){
                  Aplicacion ap;
                  ap = new Aplicacion();
                  int total;
                  ArrayList<ContMulti> playList;
                  playList = new ArrayList<ContMulti>();
                  
                  ap.agregar(playList);
                  total = ap.duracionTotal(playList, 0);
                  ap.mostrarPlaylist(playList);
                  ap.mostrar(total, "Duracion de la playList: ");
                  ap.ordenarPlaylist(playList);
                  ap.mostrarPlaylist(playList);
         }
         
   public void pedirContenido(ArrayList<ContMulti> playList) {
    Scanner tec;
    tec = new Scanner(System.in);
    String opcion;
    
    System.out.println("¿Que contenido deseas agregar? (cancion / podcast / video)");
    opcion = tec.nextLine().toLowerCase();

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
   }
    
    public boolean confirmarContenido() {
       String op;
       Scanner tec;
       tec = new Scanner(System.in);
       System.out.print("¿Desea agregar otro contenido? (si/no): ");
       op = tec.nextLine().toLowerCase();

      return op.equals("si");
    }
    
    public int duracionTotal(ArrayList<ContMulti> playList, int i) {

       if (i == playList.size()) {
          return 0;
       }

        return playList.get(i).getDuracion()+ duracionTotal(playList, i + 1);
             
    }
    public void mostrarPlaylist(ArrayList<ContMulti> playList) {
    System.out.println("Playlist:");
       for (ContMulti c : playList) {
           c.mostrar();
       }
    }
    
    public void mostrar(int a, String tex){
        System.out.println(tex + a);
    }
    public void ordenarPlaylist(ArrayList<ContMulti> playList) {
    String op;
     Scanner tec;
     tec = new Scanner(System.in);
      System.out.println("¿Como deseas ordenar la playlist?");
      System.out.println("1. Alfabeticamente por titulo");
      System.out.println("2. Por duracion");
        System.out.println("Opcion(1/2)");
       op =tec.nextLine();
 
        switch (op) {
           case "1":
            ordenarPorTitulo(playList);
            break;
           case "2":
            ordenarPorDuracion(playList);
            break;
           default:
            System.out.println("Opción no valida");
        }     
    }
    public void ordenarPorTitulo(ArrayList<ContMulti> playList) {
      Collections.sort(playList, Comparator.comparing(ContMulti::getTitulo));
    }
    public void ordenarPorDuracion(ArrayList<ContMulti> playList) {
       Collections.sort(playList, Comparator.comparingInt(ContMulti::getDuracion));
    }     
}

