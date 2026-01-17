/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos;
import java.util.Random;

public class Alumno {
    String nombre;
    int edad;
    float notas[]=new float[4];
    float promedio;
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    String getNombre(){
        return nombre;
    }
    public void setEdad(int edad){
        this.edad= edad;
    }
    int getEdad(){
        return edad;
    }
   
    void mostrar(){
        
        System.out.println("Nombre:"+nombre+ "|Edad:"+edad);
        
    }
    void genNota(){
        Random r;
        r = new Random();
        for (int i=0;i<notas.length;i++){
            notas[i]=r.nextFloat(20);
        }
    }
    double promedio(){
        float suma, promedio;
       suma=0;
        for(float nota:notas){
            suma=suma+nota;
        }
       return suma/notas.length;
    }
    void pantalla(){
        System.out.println("Nombre:"+nombre+"|Edad:"+edad);
        System.out.println("notas:");
        for(float nota:notas){
            System.out.println(nota);
        }
        System.out.println();
    }
    void mostrarPromedio(){
        System.out.println("Nombre:"+nombre+"|Edad:"+edad);
        System.out.println("Notas:");
        for(float nota:notas){
            System.out.println(nota);
        }
        System.out.println("Promedio:"+promedio());
        System.out.println();
                
    }
}
