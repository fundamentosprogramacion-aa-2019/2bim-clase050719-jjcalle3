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
public class PrincipalTres {
    public static void main(String[] args) {
        
        PersonaDos [] lista4 = new PersonaDos [3];
        PersonaDos persona1 = new PersonaDos();
        PersonaDos persona2 = new PersonaDos();
        PersonaDos persona3 = new PersonaDos();
        lista4[0] = persona1;
        lista4[1] = persona2;
        lista4[2] = persona3;
        int suma = 0;
        double promedio = 0;
        
        persona1.establecerNombre("Dennis");
        persona2.establecerNombre("Carlos");
        persona3.establecerNombre("Miguel");
        
        persona1.establecerGenero("Masculino");
        persona2.establecerGenero("Masculino");
        persona3.establecerGenero("Masculino");
        
        persona1.establecerEdad(22);
        persona2.establecerEdad(23);
        persona3.establecerEdad(21);
        
        for (int i = 0; i < lista4.length; i++) {
            PersonaDos p = lista4[i];
            suma = suma + p.obtenerEdad();
            System.out.printf("Nombre: %s - %s\n" , p.obtenerNombre(), 
                    p.obtenerGenero());
        }
        promedio = suma/lista4.length;
        System.out.printf("Promedio de edades: %f", promedio);  
    }
}

            
            
            
            
            

        
        
            
        
            
        
            
        
 
   
