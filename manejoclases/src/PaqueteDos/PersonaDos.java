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
public class PersonaDos {
    private String genero;
    private int edad;
    private String nombre;
    
    public void establecerGenero(String g){     //set
        genero = g;
    }
    
    public String obtenerGenero(){      //get
        return genero;
    }
   
    public void establecerNombre(String n){     //set
        nombre = n;
    }
    
    public String obtenerNombre(){      //get
        return nombre;
    }
    public void establecerEdad(int n){     //set
        edad = n;
    }
    
    public int obtenerEdad(){      //get
        return edad;
    }
}
