import java.util.Scanner;
import java.util.ArrayList;

public class Aplicacion {
         public static void main( String arg[]){
                  Aplicacion ap;
                  ap = new Aplicacion();
                  ArrayList<ContMulti> playList;
                  double inicioPlay, finPlay,tiempoTotal;
                 
                  playList = ap.agregarContenido();
                  inicioPlay = System.nanoTime();

                  finPlay = System.nanoTime();
                  tiempoTotal = finPlay - inicioPlay;
                  ap.mostrarResultados(playList, inicioPlay, finPlay,tiempoTotal);
         }
         
     public ArrayList<ContMulti> agregarContenido(){
        ArrayList<ContMulti> arr;
        return arrs; 
    }    
     public mostrarResultados(ArrayList<contMulti> playList, double inicioPlay, double finPlay,double tiempoTotal){

              System.out.println("tiempo inicial de la PlayList: "+ inicioPlay);
              System.out.println("tiempo final de la PlayList: "+ finPlay);
              System.out.println("Duracion de la PlayList: "+ tiempoTotal);
     }

     public boolean confirmarContenido() {
             String op;

             System.out.print("¿Desea agregar otro contenido? (si/no): ");
             op = tec.nextLine().toLowerCase();

             return op.equals("si");
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
            contenido = new Podcast("", 0, 0);
            break;

        case "video":
            contenido = new Video("", 0, "");
            break;

        default:
            System.out.println("Opción no válida");
            return;
    }

    // POLIMORFISMO MAGICO ✨
    contenido.pedirDatos();
    playList.add(contenido);

    System.out.println("Contenido agregado a la playlist");
}
}
