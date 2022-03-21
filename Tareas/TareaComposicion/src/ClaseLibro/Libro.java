/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseLibro;

import componentesLibro.Autor;
import componentesLibro.Editorial;

/**
 *
 * @author omarl
 */
public class Libro {
    private String titulo;
    private int numPaginas;
    private Autor autor;
    private Editorial editorial;

    public Libro() {
    }

    public Libro(String titulo, int numPaginas, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.numPaginas = numPaginas;
        this.autor = autor;
        this.editorial = editorial;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", numPaginas=" + numPaginas + ", autor=" + autor + ", editorial=" + editorial + '}';
    }
    
    public void abrir(){
        System.out.println("Abriendo el libro " + this.titulo);
    }
   
}
