/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases;

/**
 *
 * @author reroes
 */
public class Estudiante {
   public String nombre;
   public double promedio_final;
   
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
   
}
