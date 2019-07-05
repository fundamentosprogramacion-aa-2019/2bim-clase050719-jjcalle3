/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteDos;



/**
 *
 * @author COMPUMARS
 */
public class PrincipalUno {
    public static void main(String[] args) {
        
        //Persona p;
        //p = new Persona();
        PersonaDos p = new PersonaDos();
        PersonaDos persona2 = new PersonaDos();
        
        System.out.printf("Nombre: %s - Edad: %d - Genero: %s\n", 
                p.obtenerNombre(), p.obtenerEdad(), p.obtenerGenero());
        
        
        System.out.println("------------------------");
        
        //p.nombre = "Jhon";
        p.establecerNombre("Jhon");
        //p.genero = "Masculino";
        p.establecerGenero("Masculino");
        //p.edad = 20;
        p.establecerEdad (20);
        
        System.out.printf("Nombre: %s - Edad: %d - Genero: %s\n", 
                p.obtenerNombre(), p.obtenerEdad(), p.obtenerGenero());
    }
}