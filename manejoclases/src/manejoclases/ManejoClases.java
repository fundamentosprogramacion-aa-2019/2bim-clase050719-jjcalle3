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
public class ManejoClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante e = new Estudiante();
        Estudiante e2 = new Estudiante();
        Estudiante e3 = new Estudiante();
        Operacional op = new Operacional();
        
        e.agregar_nombre("René");
        e.agregar_promedio_final(90.1);
        e2.agregar_nombre("Rolando");
        e2.agregar_promedio_final(80.1);
        e3.agregar_nombre("Felipe");
        e3.agregar_promedio_final(60.1);
        
        Estudiante [] listado = new Estudiante[3];
        listado[0] = e;
        listado[1] = e2;
        listado[2] = e3;
        
        op.agregar_lista_estudiantes(listado);
        op.obtener_promedio_paralelo();
    }
    
    
}
