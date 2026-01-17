import java.util.Scanner;
import java.util.ArrayList;

public class Aplicacion {
         public static void main( String arg[]){
                  Aplicacion ap;
                  ap = new Aplicacion();
                  ArrayList<contMulti> playList;
                  double inicioPlay, finPlay,tiempoTotal;
                 
                  playList = ap.agregarContenido();
                  inicioPlay = System.nanoTime();

                  finPlay = System.nanoTime();
                  tiempoTotal = finPlay - inicioPlay;
                  ap.mostrarResultados(playList, inicioPlay, finPlay,tiempoTotal);
         }
         
     public ArrayList<contMulti> agregarContenido(){
        ArrayList<contMulti> arr;
        return arrs; 
    }    
     public mostrarResultados(ArrayList<contMulti> playList, double inicioPlay, double finPlay,double tiempoTotal){

              System.out.println("tiempo inicial de la PlayList: "+ inicioPlay);
              System.out.println("tiempo final de la PlayList: "+ finPlay);
              System.out.println("Duracion de la PlayList: "+ tiempoTotal);
     }         
}
