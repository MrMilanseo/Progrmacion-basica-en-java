
package com.methaporce.modelo;

/**
 *
 * @author Armando Daniel Rodriguez Fajardo
 */
public class Pelicula {
    private int id;
    private String nombre;
    private boolean disponible;

    // Contructores
    public Pelicula() {
    }

    public Pelicula(int id, String nombre, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.disponible = disponible;
    }

    //Setter y getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "id=" + id + ", nombre=" + nombre + ", disponible=" + disponible + '}';
    }
    
    
    
    
}
