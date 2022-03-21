/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasePelicula;

import componentesPelícula.Actor;
import componentesPelícula.Director;
import componentesPelícula.Productora;

/**
 *
 * @author omarl
 */
public class Pelicula {
    private String titulo;
    private int duracion;
    private Director director;
    private Productora productora;
    private Actor actor;

    public Pelicula() {
    }

    public Pelicula(String titulo, int duracion, Director director, Productora productora, Actor actor) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.director = director;
        this.productora = productora;
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Productora getProductora() {
        return productora;
    }

    public void setProductora(Productora productora) {
        this.productora = productora;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo = " + titulo + ", duracion = " + duracion + "min" + ", director = " + director + ", productora = " + productora + ", actor = " + actor + '}';
    }
    
    public void reproducir(){
        System.out.println("La película se está reproduciendo..." );
    }
    
}
