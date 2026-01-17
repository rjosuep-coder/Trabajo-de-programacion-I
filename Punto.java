/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prograoficial;

/**
 *
 * @author rjosu
 */
public class Punto {
    
        
      double coordenadaX;
      double coordenadaY;
      
   void  setCoordenadaX(double coordenadaX)  {
       
       this.coordenadaX = coordenadaX;
   }
        
    double getCoordenadaX(){    
        
       return coordenadaX;
    }
       
    void setCoordenadaY(double coordenadaY){
           
           this.coordenadaY = coordenadaY;
    }
       
    double getCoordenadaY(){
           
           return coordenadaY;
    }
      
    void mostrar(){
        System.out.print("("+coordenadaX+", "+coordenadaY+")" );
       
    }
    
    
    double calcularDistancia(Punto punto){
        double cooXT, cooYT, dif;
        cooXT= this.coordenadaX - punto.getCoordenadaX();
        cooXT= Math.pow(cooXT,2);
        
        cooYT= this.coordenadaY - punto.getCoordenadaY();
        cooYT= Math.pow(cooYT, 2);
        
        
        dif= Math.sqrt(cooXT + cooYT);
        
        return dif;
    }
    double calcularPendiente(Punto punto){
        double resX, resY, pen;
        resY= punto.getCoordenadaY()- this.coordenadaY;
        
        resX= punto.getCoordenadaX() - this.coordenadaX;
        
        pen= resY / resX;
        
        return pen;
    }
}