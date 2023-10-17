
package com.methaporce.vista;

import com.methaporce.modelo.GestorPelicula;
import com.methaporce.modelo.Pelicula;
import javax.swing.JOptionPane;

/**
 *
 * @author Armando Daniel Rodriguez Fajardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //se crea la instancia al gestor
        GestorPelicula gp = new GestorPelicula();
        //se crean nuevas peliculas
        Pelicula p1 = new Pelicula(1, "Transformers 1", true);
        Pelicula p2 = new Pelicula(2, "Transformers 2", false);
        Pelicula p3 = new Pelicula(3, "Cars 1", true);
        Pelicula p4 = new Pelicula(4, "Toy Story 1", false);
        //se agregan las peliculas a la lista
        gp.agregarPelicula(p1);
        gp.agregarPelicula(p2);
        gp.agregarPelicula(p3);
        gp.agregarPelicula(p4);
        //se muestran las peliculas agregadas
        System.out.println(gp.obtenerPeliculas());
        //se elimina la pelicula con el id 3
        gp.eliminarPelicula(3);
        //se muestra la nueva lista
        System.out.println(gp.obtenerPeliculas());
        //se marca la pelicula con el id 4 como disponible
        gp.marcarPeliculaComoDisponible(4);
        //se muestra la nueva lista
        System.out.println(gp.obtenerPeliculas());
        //se muestran todas las peliculas no disponibles
        System.out.println("Peliculas No disponibles:");
        for (Pelicula pelicula : gp.obtenerPeliculaNoDisponibles()) {
            //de la lista solo se muestran los nombres de las peliculas no disponibles
            System.out.println(pelicula.getNombre());
        }
        
        //se crea una variable para las opciones del menu que manipulara la lista
        int opcion = 0;
        //se crea una variable para la asignacion automatica del id
        int i = 5;
        //se crea un ciclo para que el usuario decida cuando dejar de interactuar con la lista
        do { 
           
           opcion = Integer.parseInt(JOptionPane.showInputDialog("Selecciona una opcion: \n1)Agregar \n2)Eliminar \n3)Marcar Pelicula como disponible \n4)Peliculas No disponibles \n5)Salir"));
            switch (opcion) {
                //case que agregara una pelicula
                case 1:
                        //variable para saber si se asignara las disponibilidad
                        boolean disponibleFinal=true;
                        //opcion para obtener el nombre de la pelicula
                        String nombre=JOptionPane.showInputDialog("Ingresa el nombre");
                        //opcion para obtener la disponibilidad de la pelicula
                        String disponible = JOptionPane.showInputDialog("Ingresa si esta disponible (Si o No)").toLowerCase();
                        //comparacion para asignar la disponibilidad segun lo ingresado por el usuario
                        if (disponible.equals("si")){
                            disponibleFinal = true;
                        }else if(disponible.equals("no")){
                            disponibleFinal = false;
                        }
                        //se agrega la nueva pelicula
                        Pelicula newPelicula = new Pelicula(i++, nombre, disponibleFinal);
                        gp.agregarPelicula(newPelicula);
                        //se muestra la nueva lista
                        System.out.println(gp.obtenerPeliculas());
                    break;
                //case para eliminar una pelicula
                case 2:
                        //variable para identificar la pelicula a eliminar
                        int idEliminar = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el id de la pelicula"));
                        //se elimina la pelicla
                        gp.eliminarPelicula(idEliminar);
                        //se muestra la nueva lista
                        System.out.println(gp.obtenerPeliculas());
                    break;
                //case para marcar como disponible una pelicula
                case 3:
                        //variable para identificar la pelicula a marcar como disponible
                        int idPelicula = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el id de la pelicula"));
                        //se marca como disponible la pelicula
                        gp.marcarPeliculaComoDisponible(idPelicula);
                        //se muestra la nueva lista
                        System.out.println(gp.obtenerPeliculas());
                    break;
                //case para mostrar las peliculas no disponibles
                case 4:
                        System.out.println("Peliculas No disponibles:");
                        for (Pelicula pelicula : gp.obtenerPeliculaNoDisponibles()) {
                            System.out.println(pelicula.getNombre());
                        }
                    break;
                //case para salir del ciclo
                case 5:
                        opcion = 5;
                    break;
                default:
                    throw new AssertionError();
            }
        } while (opcion!=5);
        
        
        
    }
    
}
