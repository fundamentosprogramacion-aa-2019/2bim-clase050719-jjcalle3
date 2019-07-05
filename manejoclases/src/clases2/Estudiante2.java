/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases2;

/**
 *
 * @author reroes
 */
public class Estudiante2 {
   public String nombre;
   public double promedio_final;
   
   public Estudiante2(){
       nombre = "N.N";
       promedio_final = 0.0;
              
   }
   
   public Estudiante2(String nuevo_nombre){
       nombre = nuevo_nombre;
       promedio_final = 0.0;
              
   }
   
   public Estudiante2(String nuevo_nombre, double nuevo_promedio){
       nombre = nuevo_nombre;
       promedio_final = nuevo_promedio;
              
   }
   
   
   public void agregar_nombre(String n){
       nombre = n;
   }
   
   public String obtener_nombre(){
       return nombre;
   }
   
   public void agregar_promedio_final(double n){
       promedio_final = n;
   }
   
   public double obtener_promedio_final(){
       return promedio_final;
   }
   
   public String presentar_datos(){
       String cadena = String.format("Nombre: %s\nPromedio: %.2f\n&&&&&&&&&&&&", 
               obtener_nombre(), obtener_promedio_final());
       
       return cadena;
   }
   
}
