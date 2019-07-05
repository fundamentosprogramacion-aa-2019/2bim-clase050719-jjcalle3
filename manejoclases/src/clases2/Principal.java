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
public class Principal {

    public static void main(String[] args) {
        
        Estudiante2 e = new Estudiante2();
        
        System.out.println(e.presentar_datos());
        
        
        Estudiante2 e2 = new Estudiante2("René");
        
        System.out.println(e2.presentar_datos());
        
        Estudiante2 e3 = new Estudiante2("René", 10.1);
        
        System.out.println(e3.presentar_datos());
                
    }
}
