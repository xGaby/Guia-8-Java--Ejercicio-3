/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g8_alumno;

import Entidades.Alumno;
import Servicios.AlumnoServicio;

/**
 *
 * @author Gabriela
 */
public class G8_Alumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AlumnoServicio s1 = new AlumnoServicio();
        
        s1.fabricaAlumnos();
        
        s1.mostrarAlumnos();
        
        //System.out.println(a1.getNotas().toString());
        
        
    }
    
}
