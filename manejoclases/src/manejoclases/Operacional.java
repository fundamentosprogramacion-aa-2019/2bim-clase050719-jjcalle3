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
public class Operacional {
    public Estudiante [] lista_estudiantes;
    
    public void agregar_lista_estudiantes(Estudiante [] lista){
        lista_estudiantes = lista;
    }
    
    public Estudiante [] obtener_lista_estudiantes(){
        return lista_estudiantes;
    }
    
    public void obtener_promedio_paralelo(){
        double promedio = 0;
        double suma = 0;
        for (int i = 0; i < obtener_lista_estudiantes().length; i++) {
            suma = suma + obtener_lista_estudiantes()[i].obtener_promedio_final();
        }
        promedio = suma / obtener_lista_estudiantes().length;
        System.out.printf("El promedio es %.2f", promedio);
    }
    
    
    
}
