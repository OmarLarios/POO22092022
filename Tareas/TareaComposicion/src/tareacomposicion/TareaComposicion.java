/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacomposicion;

import ClaseLibro.Libro;
import ClasePelicula.Pelicula;
import componentesLibro.Autor;
import componentesLibro.Editorial;
import componentesPelícula.Actor;
import componentesPelícula.Director;
import componentesPelícula.Productora;

/**
 *
 * @author omarl
 */
public class TareaComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Libro miLibro = new Libro();
         miLibro.setTitulo("Historias de un adolescente");
         miLibro.setNumPaginas(189);
         miLibro.setAutor(new Autor("Emiliano Donitas",51));
         miLibro.setEditorial(new Editorial("Alebrije", "1245-7847-9389-0139"));
        System.out.println(miLibro);
        miLibro.abrir();
        System.out.println("-------------------------------------------------");
       
      
       Pelicula miPelicula = new Pelicula();     
       miPelicula.setTitulo("Spider Man NWH");
       miPelicula.setDuracion(148);
       miPelicula.setDirector(new Director("Jon Watts", 40));
       miPelicula.setProductora(new Productora("Sony Pictures", "Ciencia Ficción"));
       miPelicula.setActor(new Actor("Andrew Garfield", 38));
       System.out.println(miPelicula);
       miPelicula.reproducir();
       
      
        
        } 
}
