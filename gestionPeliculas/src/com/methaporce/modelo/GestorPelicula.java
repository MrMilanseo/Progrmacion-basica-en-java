
package com.methaporce.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Armando Daniel Rodriguez Fajardo
 */
public class GestorPelicula {
    
    //creamos la lista de las peliculas
    private List<Pelicula> peliculas = new ArrayList();
    
    //metodo para agregar una nueva pelicula tras recibir un objeto de tipo Pelicula
    public void agregarPelicula(Pelicula pelicula){
        peliculas.add(pelicula);
    }
    //metodo para eliminar una pelicula a travez de su id
    public void eliminarPelicula(int id){
        //for que recorre la lista de peliculas para eliminar la que coincida en su id
        for (Pelicula pelicula : peliculas) {
            if(pelicula.getId() == id){
                peliculas.remove(pelicula);
                break;
            }
        }
    }
    //metodo que requresa las peliculas
    public List<Pelicula> obtenerPeliculas(){
        return peliculas;
    }
    //metodo para obtner peliculas disponibles
    public List<Pelicula> obtenerPeliculaDisponibles(){
        //se crea una nueva lista la cual almacenara las peliculas disponibles
        List<Pelicula> pelisDisponibles = new ArrayList<>();
        //for que recorre la lista principal para encontrar las peliculas disponibles
        for (Pelicula pelicula : peliculas) {
            if (pelicula.isDisponible() == true) {
                //si esta disponible esta se almacena en la nueva lista
                pelisDisponibles.add(pelicula);
            }
        }
        return pelisDisponibles;
    }
    //metodo para obtner peliculas no disponibles
    public List<Pelicula> obtenerPeliculaNoDisponibles(){
        //se crea una nueva lista la cual almacenara las peliculas no disponibles
        List<Pelicula> pelisNoDisponibles = new ArrayList<>();
        //for que recorre la lista principal para encontrar las peliculas no disponibles
        for (Pelicula pelicula : peliculas) {
            if (pelicula.isDisponible() != true) {
                //si no esta disponible esta se almacena en la nueva lista
                pelisNoDisponibles.add(pelicula);
            }
        }
        return pelisNoDisponibles;
    }
    //metodo para actualizar una pelicula como disponible
    public void marcarPeliculaComoDisponible(int id){
        //for que recorre las peliculas y si es el id coincide se cambia a disponible(true)
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getId() == id) {
                pelicula.setDisponible(true);
                break;
            }
        }
    }
    
}
