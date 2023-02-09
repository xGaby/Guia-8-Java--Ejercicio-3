/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gabriela
 */
public class AlumnoServicio {

    private ArrayList<Alumno> alumnos;
    private Scanner entrada;

    public AlumnoServicio() {
        this.alumnos = new ArrayList();
        this.entrada = new Scanner(System.in).useDelimiter("\n");
    }

    public Alumno crearAlumno() {

        System.out.println("Ingrese su nombre: ");
        String nombre = entrada.next();

        System.out.println("Ingrese sus notas: ");
        ArrayList<Integer> notas = new ArrayList();

        notas.add(entrada.nextInt());
        notas.add(entrada.nextInt());
        notas.add(entrada.nextInt());

//        for (Integer aux : notas) {
//            System.out.println(aux);
//        }
        return new Alumno(nombre, notas);

    }

    public void agregarAlumno(Alumno a) {

        alumnos.add(a);

    }

    public void mostrarAlumnos() {

        System.out.println("Los alumnos actuales son: ");
        for (Alumno aux : alumnos) {
            System.out.println(aux.toString());
            ;
        }
    }

    public void fabricaAlumnos() {

        System.out.println("Ingrese los alumnos.");
        Alumno alumnoCreado = crearAlumno();
        agregarAlumno(alumnoCreado);
        boolean bandera = false;

        while (bandera == false) {

            System.out.println("Desea seguir añadiendo alumnos: SI o NO");
            String respuesta = entrada.next();
            if (respuesta.equals("si")) {
                agregarAlumno(crearAlumno());
            } else {
                bandera = true;
            }

        }

    }
    
    public void notaFinal(){
        
        System.out.println("Ingrese el nombre del alumno: ");
        String nombreBuscar = entrada.next();
        for (Alumno aux : alumnos) {
            if (aux.getNombre().equals(nombreBuscar)) {
                aux.calcularNotaFinal();
            }
        }
        
    }
    
    
    

}
